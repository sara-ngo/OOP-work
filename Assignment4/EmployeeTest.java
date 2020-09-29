public class EmployeeTest {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Smith", "101", 35);
        john.printInfo();
        System.out.println(john.computePay(40));
        System.out.println(john.computePay(23));
        System.out.println(john.computePay(1));
        System.out.println(john.computePay(0));
        System.out.println(john.computePay(-5));
        System.out.println(john.computePay(45));

    }
}
