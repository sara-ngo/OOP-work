/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author ruima
 */
public class Animal {
    public String type;
    public String name;
    public int age;
    public String gender; //male, female
    public String environment; //home, forst, ocean
    public double speed;
    
    //getters and setters
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getEnv() {
        return environment;
    }
    public void setEnv(String environment) {
        this.environment = environment;
    }
    
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    
    //constructor
    public Animal(String t, String n, int a, String g, String e, double s) {
        this.type = t;
        this.name = n;
        this.age = a;
        this.gender = g;
        this.environment = e;
        this.speed = s;
    }
    
    //functions
    public void move() {
        System.out.println("This animal is moving.");
    }
    public void sound() {
        System.out.print("This animal is saying something.");
    }
    public void eat() {
        System.out.println("This animal is eating.");
    }
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
    public void introduce() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Type: " + type 
                +" Name: " + name 
                +" Age: " + age 
                +" Gender: " + gender 
                +" Environment: "+ environment 
                +" Speed: "+ speed +"mph.";
    }
}
