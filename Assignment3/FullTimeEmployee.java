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
public abstract class FullTimeEmployee extends Employee{
    double basePay;
    
    public FullTimeEmployee() {}
    
    public FullTimeEmployee(String fn, String ln, Address a, int id, double basePay) {
        super(fn, ln, a, id);
        this.basePay = basePay;
    }
    
    public double getBasePay() {
        return basePay;
    }
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
    
    

}
