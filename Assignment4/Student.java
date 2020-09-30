public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;
    private Course course;

    public Student(String fn, String ln, int a, double gpa, String m, String dep, Course c) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        this.gpa = gpa;
        this.major = m;
        this.department = dep;
        this.course = c;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String m) {
        this.major = m;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String dep) {
        this.department = dep;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course c) {
        this.course = c;
    }


    @Override
    public String toString() {
        return "Full name: " + getFirstName() + " " + getLastName()
                + "\nAge: " + getAge()
                + "\nGPA: " + getGpa()
                + "\nMajor: " + getMajor()
                + "\nDepartment: " + getDepartment()
                + "\nCourse: " + getCourse();
    }

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }
}

