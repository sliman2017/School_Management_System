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
public class Specialization {
    int idSpecialization;
    String specialization;
    public  float examCoeff;
    public  float interroCoeff;
    ArrayList<Section> listSection = new ArrayList<Section>();
    
    public Specialization(){}
    public Specialization(int idSpec, String spec, float examCoeff, float interroCoeff){
      this.idSpecialization= idSpec; this.specialization= spec; this.interroCoeff=interroCoeff;
    }
    
    public float getExamCoeff(int idStuent){
          float coeff = 0;
          dataAccessLayer dal= new dataAccessLayer();
          String sql = "select distinct(examCoeff) " +
                       "from specializations sp inner join students s "+
                       "on sp.idSpecialization = s.idSpecialization;";

        try {
              dal.stmt= dal.conn.createStatement();
              dal.rs= dal.stmt.executeQuery(sql);
              while(dal.rs.next()){
                coeff = dal.rs.getFloat(1);
              }
              System.out.println("successfully get ExamCoeff __calss Specialization getExamCoeff()__ ");
        } catch (SQLException ex) {
            System.out.println("error in get ExamCoeff __calss Specialization getExamCoeff()__ ");
        }
       return coeff;
    }
    
    public float getInterroCoeff(int idStuent){
          float coeff = 0;
          dataAccessLayer dal= new dataAccessLayer();
          String sql = "select distinct(interroCoeff) "+
                       "from specializations sp inner join students s "+
                       "on sp.idSpecialization = s.idSpecialization;";
        try {
             dal.stmt= dal.conn.createStatement();
             dal.rs= dal.stmt.executeQuery(sql);
             while(dal.rs.next()){
               coeff = dal.rs.getFloat(1);
             }
             System.out.println("successfully get InterroCoeff  __calss Specialization getInterroCoeff()__ ");
        } catch (SQLException ex) {
            System.out.println("error in get InterroCoeff __calss Specialization getInterroCoeff()__ ");
        }
       return coeff;
    }
    
    public void diffuserToSection(String spec){
        int idSection= 0;
        dataAccessLayer dal= new dataAccessLayer();
        ArrayList<Integer> idList = new ArrayList<Integer>();
        String sql = "select min(idSection) from sections where idSection not in (select idSection from students where idSection is not null);";
        String sql2 = "update students set idSection = ? where idStudent = ? and idSection is null;";
        try {   
            dal.stmt=dal.conn.createStatement();
            dal.ps= dal.conn.prepareStatement(sql2);
            
            dal.callable= dal.conn.prepareCall("{call diffuserToSection(?)}");
            dal.callable.setString(1, spec);
            dal.rs= dal.callable.executeQuery();
            while(dal.rs.next()){
              idList.add(dal.rs.getInt(1));
            }
            System.out.println("successfully call diffuserToSection()");
            for(int i: idList){
               System.out.println("the idList is : "+ i); 
              }
            
            
            int j=0;
            for(int i=0; i<= (idList.size()/2); i++){
              dal.rs= dal.stmt.executeQuery(sql);
              while(dal.rs.next()){
                idSection = dal.rs.getInt(1);
                System.out.println("successfully 1__"+ idSection);
              }    
              
                 int k= 1;
              while( k <= 2 ){
                dal.ps.setInt(1, idSection);
                dal.ps.setInt(2, idList.get(j));
                dal.ps.executeUpdate();
                System.out.println("successfully call diffuserToSection() 3");
                j++;
                k++;
              }
              
            }
            System.out.println("successfully call diffuserToSection() 2");
            
        } catch (SQLException ex) {
          System.out.println("failed call diffuserToSection()");
        }
    }
}
