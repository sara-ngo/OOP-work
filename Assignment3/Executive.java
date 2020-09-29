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
public class Executive extends Employee{
    private double yearlyCompensation;
    private double yearlyBonus;
    
    public Executive() {}
    
    public Executive(String fn, String ln, Address a, int id, double compensation, double bonus) {
        super(fn, ln, a, id);
        this.yearlyCompensation = compensation;
        this.yearlyBonus = bonus;
    }
    
    public double getYearlyCompensation() {
        return yearlyCompensation;
    }
    public void setYearlyCompensation(double yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }
    
    public double getBonus() {
        return yearlyBonus;
    }
    public void setBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
    
    public double computePay() {
        return getYearlyCompensation() + getBonus();
    }
    
    @Override
    public String toString() {
        return  super.toString()
                + "\nSalary: " + getYearlyCompensation()
                + "\tBonus: " + getBonus();
    }
    
    public void introduce(boolean displaySSN) {
        System.out.println(this.toString());
        if (displaySSN == true)
            System.out.println("SSN: " + getSSN());
    }

}
