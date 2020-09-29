/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruima
 */
public class Product {
    private String name; //product name
    private String des; //description
    private double price; //product price
    private int maxQ; //maximum quantity to be ordered
    
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
         this.name = name;
    }

    public String getDes() {
        return des;
    }
    public void setDes(String des) {
         this.des = des;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
         this.price = price;
    }
    
    public int getMaxQ() {
        return maxQ;
    }
    public void setMaxQ(int maxQ) {
         this.maxQ = maxQ;
    }    
    
    //constructor
    public Product(String n, String d, double p, int m) {
        this.name = n;
        this.des = d;
        this.price = p;
        this.maxQ = m;              
    }
    
    @Override 
    public String toString() {
        return "Product name: " + name + "Description: " + des + "Product price: $" + price 
                + "Maximum quantity: " + maxQ;
    }
           
}
