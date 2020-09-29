public class StudentTest {
    public static void main(String[] args) {
        Course course1 = new Course("CS151", "Object Oriented Design and Programming",
                "CS", "6:00 pm", "Tue");
        Course course2 = new Course("CS146", "Data structure and Algorithm",
                "CS", "4:30 pm", "Mon");
        Student john = new Student("John", "Smith", 20, 3.6, "Computer Science",
                "School of Computer Science", course1);

        john.printInfo();
        Student cloned = null;

        try {
            cloned = (Student) john.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(); // pinpoint the exact line in which the method raised the exception
        }
        System.out.println("\nCloning result: ");
        cloned.setCourse(course2);
        cloned.printInfo();

    }
}
