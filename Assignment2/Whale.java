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
public class Whale extends Animal implements Swimmer{
    public Whale(String type, String name, int age, String gender, String environment, double speed) {
        super(type, name, age, gender, environment, speed);
    }
    
    
    @Override
    public void sound() {
        System.out.println("Hummmm");
    }
    
    @Override
    public void swim() {
        System.out.println("This animal can swim.");
    }
}
