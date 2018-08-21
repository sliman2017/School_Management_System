/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author slimane
 */

public class Test {   
    
    public static void main(String args[]) throws SQLException{
         
        Module modd= new Module();
        Student su= new Student();
        Admin ad= new Admin();
        Study sd= new Study();
        Section sc = new Section();
        Specialization spc= new Specialization();
        Person pr = new Person();
        Teacher ch = new Teacher();
        boolean d= false;
        pr.login("sliman2015", "1234");
        
    
    }
}
