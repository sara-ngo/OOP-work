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
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("John", "Smith", 20, 3.6, "Computer Science major",
                "School of Computer Science department");
        
        Student.Course course1 = student1.new Course();   
        course1.printSchedule();
        
    }
    
}
