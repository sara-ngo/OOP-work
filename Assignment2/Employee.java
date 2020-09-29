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

public class Employee extends Person {
     
    private int employeeID;
    private String employeeStatus;
    private double basePay;
     
    //getters and setters
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    public String getEmployeeStatus() {
        return employeeStatus;
    }
    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }
    
    public double getBasePay() {
        return basePay;
    }
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
    
    
    //contractor
    public Employee(String f, String l, int a, String s, String add, String g, double w, int id, String st, double p){
        super(f, l, a, s, add, g, w); //because it held person's attribute
        employeeID = id;
        employeeStatus = st;
        basePay = p;   
    }
    
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Employee ID: " + employeeID + " . Employee status: " 
                + employeeStatus + " . Base pay: $" + basePay);
    }
    
    //calculate net pay
    public double calculatePay(double unitsWorked) {
        
        double pay;

        if ("Part time".equals(employeeStatus) )
            return pay = unitsWorked * basePay;
        else if ("Contractor".equals(employeeStatus)) 
            return pay = unitsWorked * basePay;
        else if ("Full time".equals(employeeStatus)) 
            return pay = basePay * 1/52 * unitsWorked;
       
        return 0;
        
    }
}

