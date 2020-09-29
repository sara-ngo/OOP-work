public class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private double hourlyPay;
    private int unitsWorked;

    public Employee(String fn, String ln, String id, double pay) {
        this.firstName = fn;
        this.lastName = ln;
        this.employeeID = id;
        this.hourlyPay = pay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public void setEmployeeID(String id) {
        this.employeeID = id;
    }

    public void setHourlyPay(double pay) {
        this.hourlyPay = pay;
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName()
                + " Last name: " + getLastName()
                + " Employee ID: " + getEmployeeID()
                + " Hourly pay: $" + getHourlyPay();
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public static class TooManyHoursWorkedException extends NumberFormatException {
        public TooManyHoursWorkedException(String message) {
            super(message);
        }
    }

    public double computePay(int unitsWorked) {
        double payment;
        try {
            if (unitsWorked < 0) {
                throw new NumberFormatException("Hours cannot be negative");
            } else if (unitsWorked > 40) {
                throw new TooManyHoursWorkedException("Hours cannot be more than 40");
            } else {
                System.out.print("Total hours: " + unitsWorked + " Payment: $");
                return payment = unitsWorked * hourlyPay;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
            return -1;
        }
    }

}
