package schedule;

import java.util.ArrayList;
import java.util.List;

public class Semester {
    Semesters2022 currSemester;
    List<Course> courses;
    int totalUnits = 0;

    public Semester(Semesters2022 currSemester, List<Course> courses) {
        this.currSemester = currSemester;
        this.courses = courses;
        for (Course c : courses) {
            totalUnits += c.units;
        }
    }

    public Semester(Semesters2022 currSemester) {
        this(currSemester, new ArrayList<>());
    }

    public void addCourse(Course c) {
        courses.add(c);
    }
}
