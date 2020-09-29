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
public class Contractor extends Employee{
    private double basePay;
    
    public double getBasePay() {
        return basePay;
    }
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
    
    public Contractor() {}
    public Contractor(String fn, String ln, Address a,int id, double p) {
        super(fn, ln, a, id);
        this.basePay = p;
    }
    
    public double computePay(int numHrs) {
        double payment = numHrs * basePay;
        return payment;
    }
        
    @Override
    public String toString() {
        return super.toString()
                + "\nHourly rate: " + getBasePay();
    }
    
    public void introduce(boolean displaySSN) {
        System.out.println(this.toString());
        if (displaySSN == true)
            System.out.println("SSN: " + getSSN());
    }

}
