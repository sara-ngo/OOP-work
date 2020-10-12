import java.util.Comparator;
import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;
    private LinkedList<Course> courses;

    public Student(String fn, String ln, int a, double gpa, String m, String dep, LinkedList<Course> c) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        this.gpa = gpa;
        this.major = m;
        this.department = dep;
        this.courses = c;
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

    public LinkedList<Course> getCourse() {
        return courses;
    }

    public void setCourse(LinkedList<Course> c) {
        this.courses = c;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void removeCourse(Course c) {
        courses.remove(c);
    }

    public void sortCourses(boolean ascending, String attribute) {
        courses.sort(new Comparator<Course>() { // implement sort from Collections
            @Override
            public int compare(Course o1, Course o2) {
                int sortValue = 0;
                switch (attribute.toUpperCase()) {
                    case "NAME":
                        sortValue = o1.getName().compareTo(o2.getName()); // sort in ascending order
                        break;
                    case "DESCRIPTION":
                        sortValue = o1.getDescription().compareTo(o2.getDescription());
                        break;
                    case "DEPARTMENT":
                        sortValue = o1.getDepartment().compareTo(o2.getDepartment());
                        break;
                    case "TIME":
                        sortValue = o1.getHour().compareTo(o2.getHour());
                        break;
                    case "WEEKDAY":
                        sortValue = o1.getDay().compareTo(o2.getDay());
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                return ascending ? sortValue : -sortValue;
            }
        });
        for (Course course : courses) {
            System.out.println(course);
        }
    }


}

