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
public abstract class Employee extends Person{
    private int id;
    private String educationLevel;
    private boolean directDeposit;
    
    public Employee() {}
    
    public Employee(String fn, String ln, Address a, int id) {
        super(fn, ln, a);
        this.id = id;
    }
    
    public int getID() {
        return id;
    } 
    public void setID(int id) {
        this.id = id;
    }
    
    public String getEducation() {
        return educationLevel;
    }
    public void setEducation(String educationLevel) {
        this.educationLevel = educationLevel;
    }
    
    public boolean getDirectDeposit() {
        return directDeposit;
    }
    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
        if(directDeposit == true)
            System.out.println("Payment method: Direct Deposit");
        else
            System.out.println("Payment method: Check");
    }
    
    @Override
    public String toString() {
        return  getFirstName()
                + " " + getLastName()
                + "\tAge: " + getAge()
                + "\nAddress: " + getAddress()
                + "\nID: " + getID()
                + "\tEducation: " + getEducation();
    }
    
}
