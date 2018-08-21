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
public class Section {
    int idSection;
    char sectionNumber;
    ArrayList<Group> group = new ArrayList<Group>();
    public Section(){
        
    }
    public Section(int idSection, char sectionNumber){
        this.idSection= idSection; this.sectionNumber= sectionNumber;
    }
    public void diffuserToGroup(String spec,int section){
        
        int idGroup= 0;
        dataAccessLayer dal= new dataAccessLayer();
        ArrayList<Integer> idList = new ArrayList<Integer>();
        String sql = "select min(idGroup) from groups where idGroup not in (select idGroup from students where idGroup is not null);";
        String sql2 = "update students set idGroup = ? where idStudent = ? and idGroup is null;";

        try{
            dal.stmt=dal.conn.createStatement();
            dal.ps= dal.conn.prepareStatement(sql2);
            dal.callable= dal.conn.prepareCall("{call diffuserToGroup(?,?)}");
            dal.callable.setString(1, spec);
            dal.callable.setInt(2, section);
            dal.rs= dal.callable.executeQuery();
            
            while(dal.rs.next()){
              idList.add(dal.rs.getInt(1));
            }
            System.out.println("successfully call diffuserToGroup()");            
            
            for(int i: idList){
               System.out.println("the idList is : "+ i); 
              }
            
            int j= 0;
            for(int i=0; i<= (idList.size()/1); i++){
              dal.rs= dal.stmt.executeQuery(sql);
              while(dal.rs.next()){
                idGroup = dal.rs.getInt(1);
                System.out.println("successfully 1__"+ idGroup);
              } 
              
              int k= 1;
              while( k <= 1 ){
                dal.ps.setInt(1, idGroup);
                dal.ps.setInt(2, idList.get(j));
                dal.ps.executeUpdate();
                System.out.println("successfully call diffuserToSection() 3");
                j++;
                k++;
              }
              
            }
        }catch(SQLException ex){
            
        }
    }
    
}
