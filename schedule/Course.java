package schedule;

public class Course {
    Department subject;
    String course;
    String name;
    int units;

    public Course(Department subject, String course, String name, int units) {
        this.subject = subject;
        this.course = course;
        this.name = name;
        this.units = units;
    }
}
