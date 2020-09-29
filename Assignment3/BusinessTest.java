/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author ruima
 */
public class BusinessTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Executive
        System.out.println("-----------Executives----------");
        Address johnAddress = new Address(1, "Washington Sq", "San Jose", "95192", "CA");
        Executive john  = new Executive("John", "Smith", johnAddress, 1000, 200000.00, 55000.00);
        john.setAge(40); 
        john.setSSN("014-25-2589");
        john.setEducation("PhD");
        john.introduce(true);
        System.out.println("Yearly salary: " + john.computePay());
        john.setDirectDeposit(true);
        System.out.println();
        
        Address aliceAddress = new Address(1288, "N First St", "San Jose", "95192", "CA");
        Executive alice  = new Executive("Alice", "Lee", aliceAddress, 1026, 200000.00, 50000.00);
        alice.setAge(58); 
        alice.setSSN("851-96-7112");
        alice.setEducation("PhD");
        alice.introduce(true);
        System.out.println("Yearly salary: " + alice.computePay());
        alice.setDirectDeposit(false);
        System.out.println();
        
        System.out.println("-----------Full time salaried employees----------");
        Address natAddress = new Address(895, "Aber St", "Milpitas", "95142", "CA");
        FullTimeSalaried nathan  = new FullTimeSalaried("Nathan", "Sander", natAddress, 84000.00);
        nathan.setAge(30); 
        nathan.setSSN("599-79-1697");
        nathan.setID(1005);
        nathan.setEducation("Bachelor");
        nathan.introduce(true);
        System.out.println("This year pay: " + nathan.computePay(45));
        nathan.setDirectDeposit(true);
        System.out.println();
        
        Address lauAddress = new Address(22106, "Landess Ave", "Milpitas", "95170", "CA");
        FullTimeSalaried laura  = new FullTimeSalaried("Laura", "Glen", lauAddress, 102000.00);
        laura.setAge(29); 
        laura.setSSN("844-80-1036");
        laura.setID(1018);
        laura.setEducation("Master");
        laura.introduce(true);
        System.out.println("This year pay: " + laura.computePay(48));
        laura.setDirectDeposit(true);
        System.out.println();
        
        System.out.println("-----------Full time hourly employees----------");
        Address betAddress = new Address(25, "Story Rd", "San Jose", "95122", "CA");
        FullTimeHourly betty  = new FullTimeHourly("Betty", "Vagel", betAddress, 1030, 30.00, 45.00);
        betty.setAge(26); 
        betty.setSSN("498-77-0105");
        betty.setEducation("Bachelor");
        betty.introduce(true);
        System.out.println("This week pay: " + betty.computePay(45));
        betty.setDirectDeposit(true);
        System.out.println();
        
        Address zackAddress = new Address(335, "Steven Creek Blvd", "San Jose", "95129", "CA");
        FullTimeHourly zack  = new FullTimeHourly("Zack ", "Hughman", zackAddress, 1029, 30.00, 45.00);
        zack.setAge(25); 
        zack.setSSN("979-41-4987");
        zack.setEducation("Bachelor");
        zack.introduce(true);
        System.out.println("This week pay: " + zack.computePay(60));
        zack.setDirectDeposit(false);
        System.out.println();
        
        System.out.println("-----------Part time hourly employees----------");
        Address danAddress = new Address(106, "Lenzen Ave", "San Jose", "95111", "CA");
        PartTimeHourly daniel  = new PartTimeHourly("Daniel", "Gao", danAddress, 1030, 28.00);
        daniel.setAge(22); 
        daniel.setSSN("127-54-0526");
        daniel.setEducation("Bachelor");
        daniel.introduce(true);
        System.out.println("This week pay (over 40 hrs/week, return -1): " + daniel.computePay(45));
        daniel.setDirectDeposit(true);
        System.out.println();
        
        Address fredAddress = new Address(70, "Butter Dr", "San Jose", "95112", "CA");
        PartTimeHourly fred  = new PartTimeHourly("Fred", "Mathew", fredAddress, 1040, 25.00);
        fred.setAge(23); 
        fred.setSSN("418-10-7978");
        fred.setEducation("Bachelor");
        fred.introduce(true);
        System.out.println("This week pay: " + fred.computePay(30));
        fred.setDirectDeposit(true);
        System.out.println();
        
        System.out.println("-----------Contractors----------");
        Address kylieAddress = new Address(64, "Sunset Ave", "Mountain View", "95208", "CA");
        Contractor kylie  = new Contractor("Kylie", "Nguyen", kylieAddress, 1009, 33.00);
        kylie.setAge(28); 
        kylie.setSSN("179-54-0078");
        kylie.setEducation("Master");
        kylie.introduce(true);
        System.out.println("This week pay: " + kylie.computePay(40));
        kylie.setDirectDeposit(true);
        System.out.println();
        
        Address jennieAddress = new Address(1087, "Comet Sq", "Palo Alto", "95128", "CA");
        Contractor jennie  = new Contractor("Jennie", "Wu", jennieAddress, 1047, 32.00);
        jennie.setAge(26); 
        jennie.setSSN("579-00-1514");
        jennie.setEducation("Master");
        jennie.introduce(true);
        System.out.println("This week pay: " + jennie.computePay(26));
        jennie.setDirectDeposit(false);
        System.out.println();
        
        
        System.out.println("-----------Customers----------");
        Address minnieAddress = new Address(8, "Waterhorse St", "San Jose", "95125", "CA");
        Customer minnie  = new Customer("Minnie", "Salve", minnieAddress, 2044);
        minnie.setAge(35); 
        minnie.setSSN("189-77-1103");
        minnie.introduce(false);
        minnie.setPayPreference("Check");
        minnie.makePayment();
        System.out.println();
        
        Address rachelAddress = new Address(512, "Queen Ave", "San Francisco", "94131", "CA");
        Customer rachael  = new Customer("Rachael", "Davila", rachelAddress, 2801);
        rachael.setAge(48); 
        rachael.setSSN("098-30-1900");
        rachael.introduce(false);
        rachael.setPayPreference("Direct deposit");
        rachael.makePayment();
        System.out.println();
    }
}
