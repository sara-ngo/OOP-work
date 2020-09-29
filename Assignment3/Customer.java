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
public class Customer extends Person{
    int customerID;
    String paymentPreference;
    
    public Customer() {}
    
    public Customer(String fn, String ln, Address a, int id) {
        super(fn, ln, a);
        this.customerID = id;
    }
    
    public int getID() {
        return customerID;
    }
    public void setID(int customerID) {
        this.customerID = customerID;
    }
    
    public String getPayPreference() {
        return paymentPreference;
    }
    public void setPayPreference(String paymentPreference) {
        this.paymentPreference = paymentPreference;
    }
        
    public void makePayment() {
        System.out.println("Payment method: " + getPayPreference());
    }
    
    @Override
    public String toString() {
        return  getFirstName()
                + " " + getLastName()
                + "\tAge: " + getAge()
                + "\nAddress: " + getAddress()
                + "\nCustomer ID: " + getID();
    }
    
    public void introduce(boolean displaySSN) {
        System.out.println(toString());
        if (displaySSN == true)
            System.out.println("SSN: " + getSSN());
    }

}
