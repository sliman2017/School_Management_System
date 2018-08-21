/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.dataAccessLayer;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slimane yes this is my name
 */
public class Person {
   private int idPerson;
   public String firstName;
   public String lastName;
   public Date birthday;
   public Date subscribeDate;
   private String username;
   private String password;
   public String nationality;
   public int contacts;
    InfoContact contact= new InfoContact();
    private Object dal;
    
    
    public Person(){
    }
    public Person(String fName, String lName){
     this.firstName= fName; this.lastName= lName;
    }
    public Person(int id, String fName, String lName, Date birthday){
        this.idPerson=id; this.firstName=fName; this.lastName=lName; this.birthday=birthday;
    }
    public Person(int id,String fName,String lName,Date birthday, InfoContact idContact, String nationality, String pass,String uname){
       this.idPerson=id; this.firstName=fName; this.lastName=lName;
       this.username=uname; this.password=pass; this.contact=idContact;
       this.birthday=birthday;
       this.nationality=nationality;
    }
    public Person(int id,String fName,String lName,Date birthday,Date subscribeDate, InfoContact idContact, String nationality, String pass,String uname){
       this.idPerson=id; this.firstName=fName; this.lastName=lName;
       this.username=uname; this.password=pass; this.contact=idContact;
       this.birthday=birthday; this.subscribeDate=subscribeDate;
       this.nationality=nationality;
    }
    boolean auth;                    // use for the return of login() function
      // function that allow to login to application
    public boolean login(String username, String password){
                  
      try{
        dataAccessLayer dal= new dataAccessLayer();       

          
          dal.callable= dal.conn.prepareCall("{call loginPersons(?,?,?)}");
          dal.callable.setString(2,username);
          dal.callable.setString(1, password);
          dal.callable.registerOutParameter(3, Types.BOOLEAN);
          dal.callable.execute();
          
           auth= dal.callable.getBoolean(3);
          System.out.println(" Bravo ^-^ call login Procedure successed");
          System.out.println(" the entred is "+ auth);
          
          
          
      }catch(SQLException e){
          System.out.println("call login procedure is failed !");
     } 
       return auth;
    }    
     // for write a rapport  and i want to change the type of date from string to date
    public void writeRapport(fullName author,String about,String subject,String details,String date,int idType){
      try{
            dataAccessLayer dal= new dataAccessLayer();       

            dal.callable= dal.conn.prepareCall("{call writeRapport(?,?,?,?,?,?,?)}");
            dal.callable.setString(1,author.firstName);
            dal.callable.setString(2, author.lastName);
            dal.callable.setString(3, about);
            dal.callable.setString(4, subject);
            dal.callable.setString(5, details);
            dal.callable.setString(6, date);                  
            dal.callable.setInt(7, idType);
            dal.callable.execute();
            System.out.println("Bravo in Person method writeRapport()");
            dal.closeConnection();
         }catch(SQLException e){
            System.out.println("Failed in Person method writeRapport()");
         }
    }
    /*  function that return true if the name is exist in the database  */
    public boolean ifNameExists(String FName,String LName){
           dataAccessLayer dal= new dataAccessLayer();
            String sql="select * from persons where firstName= '"+FName+"' and lastName ='"+LName+"'";
            boolean b=false;
         try{
                dal.stmt=dal.conn.createStatement();
              dal.rs = dal.stmt.executeQuery(sql);
              dal.closeConnection();
               if(dal.rs.next())
                     b=true;
           
            }catch(SQLException e){
           System.out.println("failed in Person method ifNameExists() !");
          }
        
    return b;
    
    }
    
     // function allow you to list the information of person in the databases 
    public ArrayList<Person> infoListsPersons(){
        ArrayList<Person> list= new ArrayList();
        ArrayList<String> phoneList= new ArrayList();
        ArrayList<String> emailList= new ArrayList();
        
        dataAccessLayer dal= new dataAccessLayer();       

         try{
            String sql = " select idPerson,firstName,lastName,birthday,subscribeDate,numberPhone,email,state,city,street, nationality, password, username "
                       + " from persons p, phone_numbers pn, nationality n, adresses a, emails e,contact_info ci"
                       + " where p.idNationality= n.idNationality and p.idContact= ci.idContact and ci.idAdress= a.idAdress and pn.idContact= ci.idContact and ci.idContact= e.idContact and username = 'sliman2015';";
            dal.stmt= dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql);
            
            while(dal.rs.next()){
                
                phoneList.add(dal.rs.getString(6));
                emailList.add(dal.rs.getString(7));
                Address adds= new Address(dal.rs.getString(8),dal.rs.getString(9),dal.rs.getString(10),dal.rs.getString(11));
                InfoContact contact= new InfoContact(phoneList,emailList,adds);

                list.add(new Person(dal.rs.getInt(1),dal.rs.getString(2),dal.rs.getString(3),dal.rs.getDate(4),dal.rs.getDate(5),
                                     contact,dal.rs.getString(11),dal.rs.getString(12),dal.rs.getString(13)));
                
            }
         }catch(SQLException e){
          System.out.print("error in infoListsPersons() Person's Class .");
         }
      return list;
    }
    
    public void showProfile(int idPerson){
          Person pr = new Person();
          InfoContact ccc;
          ArrayList<String> phone = new ArrayList<String>();
          ArrayList<String> email = new ArrayList<String>();
          Address ad;
          String sql= "select idPerson,username, firstName, lastName, birthday, concat(state,'/ ', city,'/ ',street), numberPhone, email, password, nationality "
                  + "from persons ps left join  nationality nt on nt.idNationality= ps.idNationality left join contact_info ci on ps.idContact= ci.idContact left join adresses ad on ad.idAdress= ci.idAdress left join emails em on em.idContact= ci.idContact left join phone_numbers pn on pn.idContact= ci.idContact"
                  + "where ps.idPerson ="+idPerson+";";
          dataAccessLayer dal1= new dataAccessLayer();
          
      try {
              dal1.stmt=dal1.conn.createStatement();
              System.out.println("step 1 show Profile ");
              dal1.rs= dal1.stmt.executeQuery(sql);
          System.out.println("successfully show profile"); 
         while(dal1.rs.next()){
              ad= new Address(dal1.rs.getString(6));
              phone.add(dal1.rs.getString(7));
              email.add(dal1.rs.getString(8));
              ccc= new InfoContact(phone, email, ad);
              pr= new Person(dal1.rs.getInt(1),dal1.rs.getString(3),dal1.rs.getString(4),dal1.rs.getDate(5),ccc,dal1.rs.getString(10), dal1.rs.getString(9),dal1.rs.getString(2));
         } 
         System.out.println(pr.idPerson);
         System.out.println(pr.firstName);
         System.out.println(pr.lastName);
         System.out.println(pr.birthday);
         System.out.println(pr.contact);
         System.out.println(pr.nationality);
         System.out.println(pr.password);
         System.out.println(pr.username);
      } catch (SQLException ex) {
           System.out.println("failed show Profile ");
      }
  }   // this methode doesn't work for unknown raison ?????
    public void editProfile(int Person, String username, String password, String email, String phoneNumber, Address adress){
       dataAccessLayer dal= new dataAccessLayer();
      try {
          dal.callable= dal.conn.prepareCall("{call updateProfile(?,?,?,?,?,?,?,?)}");
          dal.callable.setInt(1, Person);
          dal.callable.setString(2, username);
          dal.callable.setString(3, password);
          dal.callable.setString(4, email);
          dal.callable.setString(5, phoneNumber);
          dal.callable.setString(6, adress.state);
          dal.callable.setString(7, adress.city);
          dal.callable.setString(8, adress.street);
          dal.callable.executeUpdate();
          System.out.println("successfully editing profile");
      } catch (SQLException ex) {
          System.out.println("failed editing profile");
      }
        
    }   
    public int getIdPerson(){
      return idPerson;
    }
    public String getPassword(){
      return password;
    }
    public String getUsername(){
      return username;
    }
    
    Address ad = new Address();
    
    public void setCountry(String country ){
     this.ad.country=country;
    }
    public String getCountry(){
     return this.ad.country;
    }
}
