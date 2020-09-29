/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author ruima
 */

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee joe = new Employee ("Joe", "Smith", 30, "058-852-8526",
                "123 SunnyCrest Dr" , "Male", 160.30, 101, "Contractor", 60);
        joe.introduce();
        System.out.printf("Net pay: $%.2f", joe.calculatePay(30));
        System.out.println();
         System.out.println("-----------------");
        
        Employee lisa = new Employee ("Lisa", "Gray", 28, "741-852-9630",
                "25800 West First St" , "Female", 140, 102, "Full time", 110000);
        lisa.introduce();
        System.out.printf("Net pay: $%.2f", lisa.calculatePay(2));
        System.out.println();
        System.out.println("-----------------");
        
        Employee tim = new Employee ("Timothy", "Briggs", 24, "753-951-8520",
                "356 Monterey Rd" , "Female", 120, 103, "Full time", 80000);
        tim.introduce();
        System.out.printf("Net pay: $%.2f", tim.calculatePay(4));
        System.out.println();
        System.out.println("-----------------");
        
        Employee george = new Employee ("George", "Wallace", 40, "052-854-0320",
                "89 McKay Rd" , "Male", 185, 104, "Part time", 20);
        george.introduce();
        System.out.printf("Net pay: $%.2f", george.calculatePay(25));
        System.out.println();
        System.out.println("-----------------");
        
        Employee amy = new Employee ("Amy", "Student", 20, "144-0587-9971",
                "8 Washington St" , "Female", 143.50, 105, "Contractor", 45);
        amy.introduce();
        System.out.printf("Net pay: $%.2f", amy.calculatePay(45));
        System.out.println();
        System.out.println("-----------------");
        
    }  
}
    
