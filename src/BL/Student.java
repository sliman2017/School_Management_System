/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.dataAccessLayer;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author slimane
 */
public class Student extends Person {
    
  private  int idStudent;
  private  float finalResult;
  public   String level;
  private String repeatedYear;
  public int idSection;
  public int idGroup;
  public int idSpecialization;
  
  public Student(int idStudent, int idSection){
    this.idStudent= idStudent; this.idSection= idSection;
  }
  
  public Student(){}
  public Student(int idStd, float finalResult, String level, String repeatedYear){
    this.idStudent= idStd; this.finalResult= finalResult; this.level= level; this.repeatedYear= repeatedYear;
  }
  
  public float calculFinalResult(int idStudent){
        dataAccessLayer dal= new dataAccessLayer();
        String sql= "select  module, resultModule, coeff, m.idModule from modules m left join students_modules sm on  m.idModule= sm.idModule left join specializations_modules spm on spm.idModule = m.idModule where idStudent= "+idStudent+";";
        ArrayList<Module> listModule= new ArrayList<Module>();
        float reslt=0;
        byte coeffGeneral=0;
      try {

          dal.stmt=dal.conn.createStatement();
          dal.rs=dal.stmt.executeQuery(sql);                     

          while(dal.rs.next()){
            listModule.add(new Module(dal.rs.getInt(4),dal.rs.getString(1),dal.rs.getFloat(2),dal.rs.getByte(3)));
            
          }
          System.out.println("jusqu'a sa bien calculFinalResult()");
            for(int i=0; i< listModule.size(); i++){ 
              reslt= reslt + (listModule.get(i).result * listModule.get(i).coeff);
              coeffGeneral= (byte) (coeffGeneral + listModule.get(i).coeff);
            }
          reslt= reslt / coeffGeneral;  
            System.out.println("jusqu'a sa bien calculFinalResult()  2");
          
      } catch (SQLException ex) {

      }            
      System.out.println("jusqu'a sa bien calculFinalResult()  3");

      return reslt;
  }
  
  public void insertFinalResultInDB(int idStudent){
          String sql= " update students \n" +
                  "set finalResult = ? , idLevel = case  when ? >= 10 then  idLevel + 1 when ? < 10 then  idLevel end where idStudent = ?";
          String sql2= "insert into students_repeated_years (select idStudent, idLevel from   students where idStudent = ? and ? < 10 );";
          dataAccessLayer dal = new dataAccessLayer();
          dataAccessLayer dal2 = new dataAccessLayer();
          float rslt;
          Student std = new Student();
          try {
              rslt = std.calculFinalResult(idStudent);
              dal.ps = dal.conn.prepareStatement(sql);
              dal.ps.setFloat(1, rslt);
              dal.ps.setFloat(2, rslt);
              dal.ps.setFloat(3, rslt);
              dal.ps.setInt(4, idStudent);
              dal.ps.executeUpdate();
              System.out.println("successfully insertion finalResult in DB class Student 1");
              dal2.ps= dal2.conn.prepareStatement(sql2);
              dal2.ps.setInt(1, idStudent);
              dal2.ps.setFloat(2, rslt);
              dal2.ps.executeUpdate();
              System.out.println("successfully insertion finalResult in DB class Student 2 ");
      } catch (SQLException ex) {
            System.out.print("failed insertion finalResult in DB class Student ");
      }
  }
  
  
  public void showStudents(int idStudent){
      dataAccessLayer dal= new dataAccessLayer();
      ArrayList<Person> listStudent= new ArrayList<Person>();
      try {
          
          dal.callable= dal.conn.prepareCall("{call showStudents(?)}");
          dal.callable.setInt(1, idStudent);
          dal.rs= dal.callable.executeQuery();
          while(dal.rs.next()){
            listStudent.add(new Person(dal.rs.getString(1), dal.rs.getString(2)));
          }
          for (int i= 0; i<listStudent.size(); i++){
            System.out.print(listStudent.get(i).firstName+" ");
            System.out.println(listStudent.get(i).lastName+" ");
          }
      } catch (SQLException ex) {
         System.out.println("failed show listStudent ");
      }
  }
  
  public ArrayList<ImageIcon> getAffichage(int idP){
      ArrayList<ImageIcon> listNote= new ArrayList<ImageIcon>();
      ImageIcon image= null;
      try {
          String sql = "select listNote from affichage aff left join students st on (aff.idSpecialization = st.idSpecialization and aff.idSection = st.idSection and aff.idGroup = st.idGroup)"
                  + "where st.idStudent= "+idP+";";
          dataAccessLayer dal = new dataAccessLayer();
          dal.stmt= dal.conn.createStatement();
          dal.rs= dal.stmt.executeQuery(sql);System.out.println("success 1 :)");
          byte[] imageData= null;
          if(dal.rs.next()){
              System.out.println("success 2 :)");
              imageData = dal.rs.getBytes("listNote");
              image = new ImageIcon(imageData);System.out.println("success 3 :)");
              listNote.add(image);System.out.println("success 4 :)");
          }
           System.out.println("success 6 :)");
      } catch (SQLException ex) {
         System.out.println("failed in getAffichage()");
      }
      return listNote;
  }
 
}
