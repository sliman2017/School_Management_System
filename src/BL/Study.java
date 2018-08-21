/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.dataAccessLayer;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;



/**
 *
 * @author slimane
 */
public class Study {
    float noteExam;
    float noteInterrogation1;
    float noteInterrogation2;
    float noteParticipation;
    float examCoeff;
    float interroCoeff;
    boolean presence;
    
    Student students= new Student();
    Module modules= new Module();
    
    public Study(){}
    public Study(float exam, float interro, float partic, byte coeff){
    this.noteExam= exam; this.noteInterrogation1=interro; this.noteParticipation= partic;
    }
    
    public void setExamCoeff(float coef){
      this.examCoeff= coef;
    }
    public void setInterroCoeff(float coef){
      this.interroCoeff= coef;
    }
    public void ifAbsence(boolean presence, int idStudent){
        try {
            dataAccessLayer dal= new dataAccessLayer();
            dal.callable= dal.conn.prepareCall("{call absence(?,?)}");
            dal.callable.setBoolean(1, presence);
            dal.callable.setInt(2, idStudent);
            dal.callable.executeQuery();
            System.out.println("successefully call absence()");
        } catch (SQLException ex) {
            System.out.println("failed call absence()");

        }
        
    }
    public byte getAbsencesNumber(int idStudent){
             byte abNumber= 0;
             dataAccessLayer dal= new dataAccessLayer();
        try {
             String sql="select absencesNumber from students where idStudent= "+idStudent+";";          
             dal.stmt=dal.conn.createStatement();
             dal.rs=dal.stmt.executeQuery(sql);
            while(dal.rs.next()){
              abNumber = dal.rs.getByte(1);
            }
           
            System.out.println("successefully call getAbsencesNumber()");

        } catch (SQLException ex) {
            System.out.println("failed call getAbsencesNumber()");
        }
        return abNumber;
    }
    
    Specialization sp= new Specialization();
    
    public float calculResultModule(float exam,float interrogation1, float particp, int idStudent){
        float result=0;
        if(getAbsencesNumber(idStudent) == 0){
           result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + particp + 5)* sp.getInterroCoeff(idStudent)));
           System.out.println("good condition 1");
        }else{
          if(getAbsencesNumber(idStudent) == 1){
            result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1  + particp + 4)* sp.getInterroCoeff(idStudent))); 
             System.out.println("good condition 2");
          }else{
               if(getAbsencesNumber(idStudent) == 2){
                 result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1  + particp + 3)* sp.getInterroCoeff(idStudent))); 
                 System.out.println("good condition 3");
                   }else{
                     if(getAbsencesNumber(idStudent) == 3){
                          result = 0;
                          System.out.print("good condition 4");
                              }
                        }
                }
            }
        return result;
    }
    
    public float calculResultModule(float exam,float interrogation1, float interrogation2, float particp, int idStudent){
        float result=0;
        if(getAbsencesNumber(idStudent) == 0){
           result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + interrogation2 + particp + 5)* sp.getInterroCoeff(idStudent)));
        }else{
          if(getAbsencesNumber(idStudent) == 1){
            result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + interrogation2 + particp + 4)* sp.getInterroCoeff(idStudent))); 
          }else{
               if(getAbsencesNumber(idStudent) == 2){
                 result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + interrogation2 + particp + 3)* sp.getInterroCoeff(idStudent))); 
                   }else{
                     if(getAbsencesNumber(idStudent) == 3){
                          result = 0;
                              }
                        }
                }
            }
        return result;
    }
    
     public float calculResultModule(float exam,float interrogation1, float interrogation2,float tp, float particp, int idStudent){
        float result=0;
        if(getAbsencesNumber(idStudent) == 0){
           result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + interrogation2 + particp + 5) *  (sp.getInterroCoeff(idStudent) /2) + (tp *  (sp.getInterroCoeff(idStudent) /2))));
        }else{
          if(getAbsencesNumber(idStudent) == 1){
            result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + interrogation2 + particp + 4)*  (sp.getInterroCoeff(idStudent) /2) + (tp *  (sp.getInterroCoeff(idStudent) /2)))); 
          }else{
               if(getAbsencesNumber(idStudent) == 2){
                 result = (float) ((exam * sp.getInterroCoeff(idStudent))+ ((interrogation1 + interrogation2 + particp + 3)*  (sp.getInterroCoeff(idStudent) /2) + (tp *  (sp.getExamCoeff(idStudent) /2)))); 
                   }else{
                     if(getAbsencesNumber(idStudent) == 3){
                          result = 0;
                              }
                        }
                }
            }
        return result;
    }
     
     public float calculResultModuleAvecTp(float exam,float interrogation1, float tp, float particp, int idStudent){
        float result=0;
        if(getAbsencesNumber(idStudent) == 0){
           result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + particp + 5) *  (sp.getInterroCoeff(idStudent) /2) + (tp *  (sp.getInterroCoeff(idStudent) /2))));
        }else{
          if(getAbsencesNumber(idStudent) == 1){
            result = (float) ((exam * sp.getExamCoeff(idStudent))+ ((interrogation1 + particp + 4)*  (sp.getInterroCoeff(idStudent) /2) + (tp *  (sp.getInterroCoeff(idStudent) /2)))); 
          }else{
               if(getAbsencesNumber(idStudent) == 2){
                 result = (float) ((exam * sp.getInterroCoeff(idStudent))+ ((interrogation1 + particp + 3)*  (sp.getInterroCoeff(idStudent) /2) + (tp *  (sp.getExamCoeff(idStudent) /2)))); 
                   }else{
                     if(getAbsencesNumber(idStudent) == 3){
                          result = 0;
                              }
                        }
                }
            }
        return result;
    }
    
   public void insertResultInDB(int idStudent){
       Study std= new Study();
       ArrayList<Module> resultModule = new ArrayList<Module>();
       ArrayList<Integer> listIdModule = new ArrayList<Integer>();
       float exam, interro1, interro2, tp, particp;
       String theKey;
       String sql3="select idModule from notes1 group by idModule;";
       String sql2="insert into students_modules values(?,?,?)";
       dataAccessLayer dal= new dataAccessLayer();
       try {                   

                     dal.stmt= dal.conn.createStatement();
                     dal.rs= dal.stmt.executeQuery(sql3);
                     while(dal.rs.next()){
                       listIdModule.add(dal.rs.getInt(1));
                     }
             
            //  is done ^ç^
          for(int i= 0; i< listIdModule.size(); i++){
            dal.callable= dal.conn.prepareCall("{call getNotesFromDB(?, ?, ?, ?, ?, ?, ?, ?)}");
            dal.callable.setInt(1, idStudent);
            dal.callable.setInt(2, listIdModule.get(i));
            dal.callable.registerOutParameter(3, Types.FLOAT);
            dal.callable.registerOutParameter(4, Types.FLOAT);
            dal.callable.registerOutParameter(5, Types.FLOAT);
            dal.callable.registerOutParameter(6, Types.FLOAT);
            dal.callable.registerOutParameter(7, Types.FLOAT);
            dal.callable.registerOutParameter(8, Types.NVARCHAR);
            dal.callable.executeQuery();
            exam= dal.callable.getFloat(3);
            interro1= dal.callable.getFloat(4);
            interro2= dal.callable.getFloat(5);
            tp= dal.callable.getFloat(6);
            particp= dal.callable.getFloat(7);
            theKey=  dal.callable.getString(8);
            System.out.println("the methode of level : "+theKey);
                
            if(theKey.equals("1stStar")){
               resultModule.add(new Module(listIdModule.get(i), std.calculResultModule(exam, interro1, particp, idStudent)));
               System.out.println("successfully calcul result _Class study 'insertResultInDB()'_1 "+theKey);
            }else{
              if(theKey.equals("2ndStar")){
               resultModule.add(new Module(listIdModule.get(i), std.calculResultModule(exam, interro1, interro2, particp, idStudent)));
               System.out.println("successfully calcul result _Class study 'insertResultInDB()'_2 "+theKey); 
              }else{
                if(theKey.equals("3rdStar")){
                 resultModule.add(new Module(listIdModule.get(i), std.calculResultModuleAvecTp(exam, interro1, tp, particp, idStudent)));
                 System.out.println("successfully calcul result _Class study 'insertResultInDBAvecTp()'_3 "+theKey);
                }else{
                  if(theKey.equals("4thStar")){
                 resultModule.add(new Module(listIdModule.get(i), std.calculResultModule(exam, interro1, interro2, tp, particp, idStudent)));
                 System.out.println("successfully calcul result _Class study 'insertResultInDB()'_3 "+theKey);
                }
                }
              }
            }
            
          }
            System.out.println("the calling is good getNotesFromDB()");
            for (int i= 0; i< resultModule.size(); i++ ){
              dal.ps=dal.conn.prepareStatement(sql2);
              dal.ps.setInt(1, idStudent);
              dal.ps.setInt(2, resultModule.get(i).idModule);
              dal.ps.setFloat(3, resultModule.get(i).result);
              dal.ps.executeUpdate();
            }
              System.out.println("successfully insertion in DB __Class study 'insertResultInDB()'__ 3");
              
        } catch (SQLException ex) {
            System.out.println("failed insertion in DB __Class study 'insertResultInDB()'__");
        }
      
   }
 }