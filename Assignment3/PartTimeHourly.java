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
public class PartTimeHourly extends Employee{
    private double baseHourlyPay;
    
    public PartTimeHourly() {}
    
    public PartTimeHourly(String fn, String ln, Address a, int id, double baseHourlyPay) {
        super(fn, ln, a, id);
        this.baseHourlyPay = baseHourlyPay;
    }
    
    public double getHourlyPay() {
        return baseHourlyPay;
    }
    public void setHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }
    
    public double computePay(int numHrs) {
        double payment;
        if (numHrs <= 40) payment = baseHourlyPay * numHrs;
        else return -1;
        return payment;
    }
        
    @Override
    public String toString() {
        return  super.toString()
                + " " + getHourlyPay();
    }
    
    public void introduce(boolean displaySSN) {
        System.out.println(this.toString());
        if(displaySSN == true)
            System.out.println("SSN: " + getSSN());
    }

}
