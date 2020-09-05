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
public class Cat extends Animal implements Domesticated{

    public Cat(String type, String name, int age, String gender, String environment, double speed) {
        super(type, name, age, gender, environment, speed);
    }
    
    public void scratch() {
        System.out.println("This animal can scratch.");
    }
    
    @Override
    public void sound() {
        System.out.println("Meow meow~");
    }
    
    @Override
    public void walk() {
        System.out.println(name + " is walking.");
    }
    
    @Override 
    public void greetHuman(){
        System.out.println(name + " is greeting you.");
    }
}
