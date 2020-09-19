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
public class FullTimeSalaried extends FullTimeEmployee{
    private double salary;
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public FullTimeSalaried() {  
    }
    
    public FullTimeSalaried(String fn, String ln, Address a, double salary) {
        this.firstName = fn;
        this.lastName = ln;
        this.address = a;
        this.salary = salary;
    }
    
    public double computePay(int numWeeks) {
        double payment = salary * 1/52 * numWeeks;
        return payment;
    }
    
    @Override
    public String toString() {
        return  super.toString()
                + "\nSalary: " + getSalary();
    }
    
    public void introduce(boolean displaySSN) {
        System.out.println(this.toString());
        if (displaySSN == true)
            System.out.println("SSN: " + getSSN());
    }
    

}
