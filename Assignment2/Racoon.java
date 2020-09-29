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
public class Racoon extends Animal{
    public Racoon(String type, String name, int age, String gender, String environment, double speed) {
        super(type, name, age, gender, environment, speed);
    }
    
    public void scratch() {
        System.out.println("This animal can scratch.");
    }
    
    @Override
    public void sound() {
        System.out.println("Chit~");
    }
}
