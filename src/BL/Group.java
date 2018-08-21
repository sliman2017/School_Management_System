/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;

/**
 *
 * @author slimane
 */
public class Group {
    int idGroup;
    byte groupNumber;
    ArrayList<Student> listStudents = new ArrayList<Student>();
    
    public Group(){}
    public Group(int idGroup, byte groupNumber){
      this.idGroup= idGroup;
      this.groupNumber= groupNumber;
    }
}
