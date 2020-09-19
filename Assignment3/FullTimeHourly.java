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
public class FullTimeHourly extends FullTimeEmployee{
    private double overtimePay;
    
    public double getOvertimePay() {
        return overtimePay;
    }
    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }
    
    public FullTimeHourly() {}
    
    public FullTimeHourly(String fn, String ln, Address a, int id, double b, double overtimePay) {
        super(fn, ln , a, id, b);
        this.overtimePay = overtimePay;
    }
    
    public double computePay(int numHrs) {
        double payment;
        if (numHrs <= 40.0) {
            payment = basePay * numHrs; 
        }
        payment = (basePay * 40.0) + (overtimePay * (numHrs - 40.0));  
        return payment;
    }
        
   @Override
    public String toString() {
        return  super.toString()
                + "\nHourly pay rate: " + getBasePay()
                + "\tHourly overtime rate: " + getOvertimePay();
    }
    
    public void introduce(boolean displaySSN) {
        System.out.println(this.toString());
        if (displaySSN == true)
            System.out.println("SSN: " + getSSN());
    }
    
}
