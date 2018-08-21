/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.SQLException;
/**
 *
 * @author slimane
 */
 public class dataAccessLayer {
   public Connection conn=null;
   public Statement stmt=null;
   public ResultSet rs=null;
   public PreparedStatement ps= null;
   public CallableStatement callable= null;
   
  public dataAccessLayer(){
    getConnection();
  }
  
  public void getConnection(){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        conn= DriverManager.getConnection("jdbc:mysql://localhost/schoolManagement","root","bismi llah&");        
      }catch(Exception e){
       System.out.println("DAL getConnection failed !!!");
      } 
  }
  
    public void closeConnection(){
        try{
          rs.close();
          conn.close();
          stmt.close();
          ps.close();
          callable.close();
        }catch(SQLException e){
        
        }
      }
}
