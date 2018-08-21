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
public class InfoContact {
    public ArrayList<String> phone = new ArrayList<String>();
    public ArrayList<String> email = new ArrayList<String>();
    public Address address;
    public InfoContact(){
    
    }
    public InfoContact(ArrayList<String> phone, ArrayList<String> email, Address address){
       this.phone=phone; this.email=email; this.address= address;
    }
    
}
