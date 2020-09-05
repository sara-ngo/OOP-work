/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author ruima
 */
public class Student {
    String firstName;
    String lastName;
    int age;
    double gpa;
    String major;
    String department;
    
    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double g) {
        this.gpa = g;
    }    
    
    public String getMajor() {
        return major;
    }
    public void setMajor(String m) {
        this.major = m;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String d) {
        this.department = d;
    }    
    
    //contructor
    public Student(String fn, String ln, int a, double g, String m, String d) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        this.gpa = g;
        this.major = m;
        this.department = d;
    }
    
    public class Course{

        public void printSchedule() {
            System.out.println("CIS 151 Tue/Thur 6-7:15");
        }
    }
    
}

