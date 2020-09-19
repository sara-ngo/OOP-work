/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author ruima
 */
public class Address {
    private int streetNum;
    private String streetName, city, zip, state;
    
    //constructor
    public Address(int num, String name, String c, String s, String z) {
        this.streetNum = num;
        this.streetName = name;
        this.city = c;
        this.zip = z;
        this.state = s;
    }
    
    //getters and setters
    public int getStreetNum() {
        return streetNum;
    }
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }
    
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    
    //to print address when input is received from instance in main
    @Override
    public String toString() {
        return streetNum 
               + " " + streetName
               + " " + city
               + " " + state
               + " " + zip;
    }
    
}
