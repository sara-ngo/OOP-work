/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author ruima
 */
public class Person {
    
    private String fName, lName;
    private int age;
    private String ssn, address, gender;
    private double weight;
    
    //getters and setter
    public String getFirstName() {
        return fName;
    }
    public void setFirstName(String fName) {
        this.fName = fName;
    }
    
    public String getLastName() {
        return lName;
    }
    public void setLastName(String lName) {
        this.lName = lName;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getSSN() {
        return ssn;
    }
    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //constructor
    public Person(String f, String l, int a, String s, String add, String g, double w) {
        fName = f;
        lName = l;
        age = a;
        ssn = s;
        address = add;
        gender = g;
        weight = w;
    }
    

    @Override
    public String toString() { //returns a string representation of the obj
        return "Full name: " +fName +" "+ lName 
                +" . Age: "+ age 
                +" . SSN: "+ ssn 
                +" . Address: "+ address 
                +" . Gender: "+ gender 
                +" . Weight: "+ weight +" lbs";
    }
    
    public void introduce() { //print the info and return type void
        System.out.println(toString()); 
    }
    
}


