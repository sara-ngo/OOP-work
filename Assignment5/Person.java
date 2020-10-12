/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 * @author ruima
 */
public class Person {

    private String firstName, lastName;
    private int age;


    //getters and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLastNameLength() {
        return lastName.length();
    }

    //constructor
    public Person(String f, String l, int a) {
        firstName = f;
        lastName = l;
        age = a;

    }

}


