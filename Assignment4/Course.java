public class Course implements Cloneable {
    private String name;
    private String description;
    private String department;
    private String startTime;
    private String day;

    public Course(String n, String d, String dep, String h, String day) {
        this.name = n;
        this.description = d;
        this.department = dep;
        this.startTime = h;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        this.description = d;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String dep) {
        this.department = dep;
    }

    public String getHour() {
        return startTime;
    }

    public void setHour(String h) {
        this.startTime = h;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Course name: " + name
                + " Description: " + description
                + " Department: " + department
                + " Hours: " + startTime
                + " Day: " + day;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
