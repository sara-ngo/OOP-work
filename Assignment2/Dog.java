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
public class Dog extends Animal implements Domesticated {
    public Dog(String type, String name, int age, String gender, String environment, double speed) {
        super(type, name, age, gender, environment, speed);
    }
    
    public void bark() {
        System.out.println("This animal is barking!");
    }
    
    @Override
    public void sound() {
        System.out.println("Bark! Bark!");
    }
    
    @Override 
    public void walk() {
        System.out.println(name + " is walking!");
    }
    
    @Override
    public void greetHuman() {
        System.out.println(name + " is greeting!");
    }
}
