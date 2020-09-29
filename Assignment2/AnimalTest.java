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
public class AnimalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog", "Uno", 2, "Male", "House", 20);
        dog1.introduce();
        dog1.walk();
        dog1.greetHuman();
        dog1.bark();
        System.out.println();
        
        Cat cat1 = new Cat("Cat", "Wang", 1, "Female", "House", 15);
        cat1.introduce();
        cat1.sound();
        cat1.eat();
        System.out.println();
                
        Racoon racoon1 = new Racoon("Raccoon", "Mot", 3, "Male", "Forest", 15);
        racoon1.introduce();
        racoon1.scratch();
        racoon1.sound();
        System.out.println();
                
        Whale whale1 = new Whale("Whale", "Yi", 12, "Female", "Ocean", 30);
        whale1.introduce();
        whale1.sound();
        whale1.swim();
        System.out.println();
        
    }
    
}
