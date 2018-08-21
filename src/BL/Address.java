/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author slimane
 */
public class Address {
    int idAdress;
    String country;
    String city ;
    String state ;
    String street;
    String concat;
    
    public Address(){}
    public Address(String st){
     this.concat= st;
    }
    public Address(String state, String city, String street){
      this.state= state; this.city= city; this.street= street;
    }
    public Address(String country,String city, String state, String street){
        this.city= city; this.country= country; this.state=state; this.street=street;
    }
    public String getCountry(){
     return this.country;
    }
    
}
