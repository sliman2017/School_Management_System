/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.dataAccessLayer;
import PL.LoginHome.TeacherAccount.PostConsultation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slimane
 */
public class Teacher extends Worker{
    int idTeacher;
    Module modu= new Module();  
    
    public Teacher(){
    }
    public Teacher(int idTeacher){
        this.idTeacher=idTeacher;
    }
    public void enterResultExam(float exam, int idStudent, int idModule){
        try {
            String sql3="insert into notes1(exam, idModule, idStudent) values(?,?,?);";
            String sql2="select * from notes1 where idStudent ="+idStudent+" and idModule ="+idModule+";";
            String sql ="update notes1 set exam = ? where idStudent = ? and idModule = ?;";
            
            dataAccessLayer dal= new dataAccessLayer();
            dal.stmt= dal.conn.prepareStatement(sql2);
            dal.rs= dal.stmt.executeQuery(sql2);
            System.out.println("step 1 success");
           if(dal.rs.next()){
            dal.ps= dal.conn.prepareStatement(sql);
            dal.ps.setFloat(1, exam);
            dal.ps.setInt(2, idStudent);
            dal.ps.setInt(3, idModule);
            dal.ps.executeUpdate();
           }else{
            dal.ps= dal.conn.prepareStatement(sql3);
            dal.ps.setFloat(1, exam);
            dal.ps.setInt(2, idModule);
            dal.ps.setInt(3, idStudent);
            dal.ps.executeUpdate();
           }
            System.out.println("step 2 success");
        } catch (SQLException ex) {
            System.out.println("failed insertion note exam()");
        }
    }
    public void enterResultInterro1(float interro1, int idStudent, int idModule){
        try {
            String sql3="insert into notes1(interrogation1, idModule, idStudent) values(?,?,?);";            
            String sql2="select * from notes1 where idStudent ="+idStudent+" and idModule ="+idModule+";";
            String sql ="update notes1 set interrogation1 = ? where idStudent = ? and idModule = ?;";
            dataAccessLayer dal= new dataAccessLayer();
            
            
            dal.stmt= dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql2);
            if(dal.rs.next() == true){
                dal.ps= dal.conn.prepareStatement(sql);
                dal.ps.setFloat(1, interro1);
                dal.ps.setInt(2, idStudent);
                dal.ps.setInt(3, idModule);
                dal.ps.executeUpdate();
            }else{
                dal.ps= dal.conn.prepareStatement(sql3);
                dal.ps.setFloat(1, interro1);
                dal.ps.setInt(2, idModule);
                dal.ps.setInt(3, idStudent);
                dal.ps.executeUpdate();
            }
            
        } catch (SQLException ex) {
            System.out.println("failed insertion note interro1()");
        }
    }
    public void enterResultInterro2(float interro2, int idStudent, int idModule){
        try {
            String sql4="select idNote1 from notes1 where idStudent= "+idStudent+" and idModule = "+idModule+";";
            String sql3="insert into notes2(idNote1, interrogation2) values(?,?);";            
            String sql2="select * from notes2 n2 left join notes1 n1 on n1.idNote1 = n2.idNote1  where n1.idStudent ="+idStudent+" and n1.idModule = "+idModule+";";
            String sql ="update notes2 n2, notes1 n1 set interrogation2 = ? where n2.idNote1= n1.idNote1 and idStudent ="+idStudent+" and idModule = "+idModule+";";
            dataAccessLayer dal= new dataAccessLayer();
            
            dal.stmt= dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql2);
            
            if(dal.rs.next() == true){
                dal.ps= dal.conn.prepareStatement(sql);
                dal.ps.setFloat(1, interro2);
                dal.ps.executeUpdate();
            }else{
                dal.stmt= dal.conn.createStatement();
                dal.rs= dal.stmt.executeQuery(sql4);
                int idNote = dal.rs.getInt(1);
                
                dal.ps= dal.conn.prepareStatement(sql3);
                dal.ps.setInt(1, idNote);
                dal.ps.setFloat(2, interro2);
                dal.ps.executeUpdate();
            }
            
        } catch (SQLException ex) {
            System.out.println("failed insertion note interro2()");
        }
    }
    public void enterResultTP(float TP, int idStudent, int idModule){
        try {
            String sql4="select idNote1 from notes1 where idStudent= "+idStudent+" and idModule= "+idModule+";";
            String sql3="insert into notes1(idNote1, tp) values(?,?);";            
            String sql2="select * from notes3 n2 left join notes1 n1 on n1.idNote1 = n2.idNote1  where n1.idStudent ="+idStudent+" and n1.idModule = "+idModule+";";
            String sql ="update notes3 n3, notes1 n1 set tp = ? where n3.idNote1= n1.idNote1 and idStudent ="+idStudent+" and idModule = "+idModule+";";
            dataAccessLayer dal= new dataAccessLayer();
            
            dal.stmt= dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql2);
             
            if(dal.rs.next() == true){
                dal.ps= dal.conn.prepareStatement(sql);
                dal.ps.setFloat(1, TP);
                dal.ps.executeUpdate();System.out.println("step 1 success");
            }else{
                dal.stmt= dal.conn.createStatement();
                dal.rs= dal.stmt.executeQuery(sql4);
                int idNote = dal.rs.getInt(1);
                
                
                dal.ps= dal.conn.prepareStatement(sql3);
                dal.ps.setInt(1, idNote);
                dal.ps.setFloat(2, TP);
                dal.ps.executeUpdate();
            }
                System.out.println("step 2 success");
        } catch (SQLException ex) {
            System.out.println("failed insertion note particip()");
        }
    }
    public void enterResultParticip(float particip, int idStudent, int idModule){
        try {
            String sql2="select * from notes1 where idStudent ="+idStudent+" and idModule = "+idModule+";";
            String sql3="insert into notes1(participation,idModule, idStudent) values(?,?,?);";
            String sql ="update notes1 set participation = ? where idStudent = ? and idModule = ?;";
            dataAccessLayer dal= new dataAccessLayer();
            
            
            dal.stmt= dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql2);
            
            if(dal.rs.next() == true){
                dal.ps= dal.conn.prepareStatement(sql);
                dal.ps.setFloat(1, particip);
                dal.ps.setInt(2, idStudent);
                dal.ps.setInt(3, idModule);
                dal.ps.executeUpdate();
            }else{
                dal.ps= dal.conn.prepareStatement(sql3);
                dal.ps.setFloat(1, particip);
                dal.ps.setInt(2, idModule);
                dal.ps.setInt(3, idStudent);
                dal.ps.executeUpdate();
            }
            
        } catch (SQLException ex) {
            System.out.println("failed insertion note particip()");
        }
        
        
    }
    public ArrayList<String> showHomeworkOfStudent(int idStudent){
          ArrayList<String> listHomework= new ArrayList<String>();
        try {
            String sql = "select * from homework where idStudent = "+idStudent+";";
            dataAccessLayer dal = new dataAccessLayer();
            dal.stmt = dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql);
            while(dal.rs.next()){
                listHomework.add(dal.rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("failed in showHomeworkOfStudent() ");
        }
           return listHomework;
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
    public void editListStudent(int idStudent1, int idStudent2){
            int gStudent1=0;
            int gStudent2=0;
            
            try {
            String groupStudent1="select idGroup from students where idStudent= "+idStudent1+" ;";
            String groupStudent2="select idGroup from students where idStudent= "+idStudent2+" ;";
            String edit1="update students set idGroup = ? where idStudent = "+idStudent1+";";
            String edit2="update students set idGroup = ? where idStudent = "+idStudent2+";";
            dataAccessLayer dal1 = new dataAccessLayer();
            dataAccessLayer dal2 = new dataAccessLayer();
            dal1.stmt = dal1.conn.createStatement();
            dal2.stmt = dal2.conn.createStatement();
            
            dal1.rs= dal1.stmt.executeQuery(groupStudent1);
            dal2.rs= dal2.stmt.executeQuery(groupStudent2);
            
            if(dal1.rs.next()){
                gStudent1= dal1.rs.getInt(1);
                
            }
            if(dal2.rs.next()){
                gStudent2= dal2.rs.getInt(1);
            }
            
            
            dal1.ps=dal1.conn.prepareStatement(edit1);
            dal1.ps.setInt(1, gStudent2);
            dal1.ps.executeUpdate();
            dal1.ps=dal1.conn.prepareStatement(edit2);
            dal1.ps.setInt(1, gStudent1);
            dal1.ps.executeUpdate();
            System.out.println(gStudent2+" success 1 "+gStudent1);
        } catch (SQLException ex) {
            System.out.println("failed in editStudent()");
        }
        
                
    }
    
    public void postAffichage(int idP, String pathh){
        
        try {
            int idMod= 0;
            String sql ="insert into aff values(?,?);";
            dataAccessLayer dal= new dataAccessLayer();
            dal.stmt= dal.conn.createStatement();
            
            System.out.println("success 1");
            dal.ps= dal.conn.prepareStatement(sql);  System.out.println("success 2");
            
            File fl= new File(pathh);   System.out.println("success 3");
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(fl);  System.out.println("success 4");
                try {
                dal.ps.setBinaryStream(1, fis, fis.available());  System.out.println("success 5");
            } catch (IOException ex) {}
            } catch (FileNotFoundException ex) {}
                System.out.println("success 6");
                
             dal.ps.setInt(2, idP);   System.out.println("success 6");
            dal.ps.executeUpdate();System.out.println("success 9");
            
        } catch (SQLException ex) {
           System.out.println("failed in postAffichage()");
        }
    }
    
    public void postAffichage2(int idf, int idP, String pathh, String spec, String section, String group){
        int i=0, j=0, k=0;
        switch(spec){
            case "Computer science": i=1;  break;
            case "Mathématic" : i=2; break;
            case "Eléctronic" : i=3; break;
            default: i=1; break;
        }
        switch(section){
            case "Section 1": j=6;  break;
            case "Section 2" : j=7; break;
            case "Section 3" : j=8; break;
            case "Section 4" : j=9; break;
            default: j=1; break;
        }
        
        switch(group){
            case "Group 1": k=1;  break;
            case "Group 2" : k=2; break;
            case "Group 3" : k=3; break;
            case "Group 4" : k=4; break;
            default: k=1; break;
        }
        try {
            int idMod= 0;
            String sql ="insert into affichage(listNote,idTeacher,idSpecialization,idSection,idGroup) values(?,?,?,?,?);";
            //String sql2 = "select idModule from teachers where idTeacher = "+idP+";";
            dataAccessLayer dal= new dataAccessLayer();
            dal.stmt= dal.conn.createStatement();
            //dal.rs=dal.stmt.executeQuery(sql2);System.out.println("success 0");
           /* if(dal.rs.next()){
                idMod= dal.rs.getInt(1);
                System.out.println("success 1");
            }*/
            dal.ps= dal.conn.prepareStatement(sql);  System.out.println("success 2");
            
            File fl= new File(pathh);   System.out.println("success 3");
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(fl);  System.out.println("success 4");
                try {
                dal.ps.setBinaryStream(1, fis, fis.available());  System.out.println("success 5");
            } catch (IOException ex) {}
            } catch (FileNotFoundException ex) {}
                System.out.println("success The idF = "+ idf);
                System.out.println("success The idP = "+ idP);
                System.out.println("success The path = "+ pathh);
                System.out.println("success The spec = "+ spec+" *** the idSpec = "+i);
                System.out.println("success The section = "+ section+" *** the idSection = "+j);
                System.out.println("success The group = "+ group+" *** the idGroup = "+k);
             dal.ps.setInt(2, idP);
             dal.ps.setInt(3, i); 
             dal.ps.setInt(4, j);
             dal.ps.setInt(5, k);
            /* dal.ps.setInt(6, j);
             dal.ps.setInt(7, k);*/
             System.out.println("success 7");
            dal.ps.executeUpdate();System.out.println("success 8");
            
        } catch (SQLException ex) {
           System.out.println("failed in postAffichage()");
        }
    }
    
}
