/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author slimane
 */
public class Classe {
    int idClass;
    Date date;
    Time time;
    
    Teacher teacher = new Teacher();
    Group group = new Group();
    
}
