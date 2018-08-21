/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.dataAccessLayer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author slimane
 */
public class Admin extends Person{
    
    public void setExamCoeff(float examCoeff, float interroCoeff){
       
    }
    public void setCoeffGeneral(String spec, String module, byte coeff){
        try {
            dataAccessLayer dal= new dataAccessLayer();
            dal.callable=dal.conn.prepareCall("{call setCoeffGeneral(?,?,?)}");
            dal.callable.setString(1, spec);
            dal.callable.setString(2, module);
            dal.callable.setByte(3, coeff);
            dal.callable.executeQuery();
            System.out.println("successfully update coeffGeneral __class Admin 'setCoeffGeneral()'__");
            
        } catch (SQLException ex) {
            System.out.println("error in class Admin 'setCoeffGeneral()'");
        }
    }
    public void openPlatform(){
        
    } 
    public void choseWorker(int idWorker, String username, String password){
            String check = "select * from workers where idWorker = "+idWorker+" ;";
            String chose = "insert into platform_admins values(?, ?, ?)";
            dataAccessLayer dal = new dataAccessLayer(); 
            try {
            
            dal.stmt = dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(check);
            if(dal.rs.next()){
                dal.ps= dal.conn.prepareStatement(chose);
                dal.ps.setInt(1, idWorker);
                dal.ps.setString(2, username);
                dal.ps.setString(3, password);
                dal.ps.executeUpdate();
                System.out.println("success 1");
            }else{
                System.out.println("idWorker cann't be found choseWorker()");
            }
        } catch (SQLException ex) {
            System.out.println("failed in shoseWorker()");
        }
    }
    public ArrayList<Person> showListStudent(int idSpec, int idSection, int idGroup){
        
        dataAccessLayer dal= new dataAccessLayer();       
        ArrayList<Person> list= new ArrayList<Person>();
        String sql = " select idPerson,firstName,lastName,birthday"
                       + " from persons p, students st"
                       + " where  p.idPerson = st.idStudent and st.idSpecialization = "+idSpec+" and st.idSection = "+idSection+" and st.idGroup = "+idGroup+";";

         try{
             
            
            dal.stmt= dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql);
            while(dal.rs.next()){
                list.add(new Person(dal.rs.getInt(1),dal.rs.getString(2),dal.rs.getString(3),dal.rs.getDate(4)));
            }
         }catch(SQLException e){
          System.out.println("failed in showListStudent()");
         }
         return list;
    } 
    public ArrayList<Person> showWorkersList(){
         
        dataAccessLayer dal= new dataAccessLayer();       
        ArrayList<Person> list= new ArrayList<Person>();
        String sql = " select idPerson,firstName,lastName,birthday"
                       + " from persons p, workers wk"
                       + " where  p.idPerson = wk.idWorker ;";

         try{
             
            
            dal.stmt= dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql);
            while(dal.rs.next()){
                list.add(new Person(dal.rs.getInt(1),dal.rs.getString(2),dal.rs.getString(3),dal.rs.getDate(4)));
            }
         }catch(SQLException e){
          System.out.println("failed in showListWorker()");
         }
         return list;
    }
}
