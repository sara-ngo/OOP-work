public class Course {
    private String name;
    private String description;
    private String department;
    private String time;
    private String weekday;

    public Course(String n, String d, String dep, String h, String day) {
        this.name = n;
        this.description = d;
        this.department = dep;
        this.time = h;
        this.weekday = day;
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
        return time;
    }

    public void setHour(String h) {
        this.time = h;
    }

    public String getDay() {
        return weekday;
    }

    public void setDay(String day) {
        this.weekday = day;
    }

    @Override
    public String toString() {
        return "Course name: " + name
                + ", Description: " + description
                + ", Department: " + department
                + ", Hours: " + time
                + ", Day: " + weekday;
    }
}
