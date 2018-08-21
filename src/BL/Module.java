/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.dataAccessLayer;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author slimane
 */
public class Module {
    int idModule;
    String moduleName;
    float result;
    public  byte coeff;
    
    
    public Module(){}
    public Module(int idModule, float result){
      this.idModule= idModule; this.result= result;
    }
    public Module(int idModule, String moduleName ,float result, byte coeff){
       this.moduleName=moduleName; this.coeff=coeff; this.result= result;
    }
    
    /* public void setCoeff(int coef, String spec, String modl){
           dataAccessLayer dal= new dataAccessLayer();
           dataAccessLayer dal2= new dataAccessLayer();
           
           ArrayList<String> listSpec= new ArrayList<String>();
           ArrayList<String> listMod= new ArrayList<String>();
           String sql = "update specializations_modules"
                   +    "set coeff = ? "
                   +    "where     ? = ?"
                   + "         and ? = ?;";
                        
           String sql2="select specialization from specializations s,  specializations_modules sm where s.idSpecialization = sm.idSpecialization;";
           String sql3="select module from modules s,  specializations_modules sm where s.idModule = sm.idModule;";
           try {
              dal.stmt=dal.conn.createStatement();
              dal.rs=dal.stmt.executeQuery(sql2);
              while(dal.rs.next()){
                listSpec.add(dal.rs.getString(1));
              }
              while(dal2.rs.next()){
                listMod.add(dal.rs.getString(1));
              }
              dal2.stmt=dal2.conn.createStatement();
              dal2.rs=dal2.stmt.executeQuery(sql3);
              
             dal.ps=dal.conn.prepareStatement(sql);
             dal.ps.setInt(1, coef);
             dal.ps.setString(2, spec);
             dal.ps.setString(3, modl);
             dal.ps.executeUpdate();  System.out.println("error in setCoeff()");  
        } catch (SQLException ex) {

        }
    }
*/
    

    
    
    
}
