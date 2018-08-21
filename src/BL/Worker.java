/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.dataAccessLayer;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slimane
 */
public class Worker extends Person{
    int idWorker;
    Date workTime;
    float salary;
    
    public Worker(){
    }
    public Worker(int idWorker, Date workTime, float salary){
        this.idWorker=idWorker; this.workTime= workTime; this.salary= salary;
    }
}
