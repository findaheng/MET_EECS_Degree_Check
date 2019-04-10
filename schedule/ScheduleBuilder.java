package schedule;

import java.util.List;

public class ScheduleBuilder {
    String name;
    List<Semester> semesterList;

    public ScheduleBuilder(String name) {
        this.name = name;
        Semester sem1 = new Semester(Semesters2022.FA18);
        Semester sem2 = new Semester(Semesters2022.SP19);
        Semester sem3 = new Semester(Semesters2022.FA19);
        Semester sem4 = new Semester(Semesters2022.SP20);
        Semester sem5 = new Semester(Semesters2022.FA20);
        Semester sem6 = new Semester(Semesters2022.SP21);
        Semester sem7 = new Semester(Semesters2022.FA21);
        Semester sem8 = new Semester(Semesters2022.SP22);
        semesterList = List.of(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
    }

    /** Help menu listing available actions.*/
    public void help() {
        System.out.println("Available functions:\n"
                + "   addCourse(Semester sem, Course cse) — ");
    }

    /** Returns the corresponding semester enum to the
     *  inputted String. Format must be as follows:
     *  "Fall 2018" in which capitalization does
     *  not matter.
     */
    private Semesters2022 stringToSemester(String s) {
        if (s.equalsIgnoreCase("fall 2018")) {
            return Semesters2022.FA18;
        } else if (s.equalsIgnoreCase("spring 2019")) {
            return Semesters2022.SP19;
        } else if (s.equalsIgnoreCase("fall 2019")) {
            return Semesters2022.FA19;
        } else if (s.equalsIgnoreCase("spring 2020")) {
            return Semesters2022.SP20;
        } else if (s.equalsIgnoreCase("fall 2020")) {
            return Semesters2022.FA20;
        } else if (s.equalsIgnoreCase("spring 2021")) {
            return Semesters2022.SP21;
        } else if (s.equalsIgnoreCase("fall 2021")) {
            return Semesters2022.FA21;
        } else if (s.equalsIgnoreCase("spring 2022")) {
            return Semesters2022.SP22;
        } else {
            throw new IllegalArgumentException("Must be one of the follwing: Fall 2018, "
                    + "Spring 2019, Fall 2019, Spring 2020, Fall 2020, Spring 2021, "
                    + "Fall 2021, Spring 2020.");
        }
    }

    /** Add a course to a specific semester.*/
    public void addCourse(String s, Department d, String c, String n, int u) {
        Semesters2022 sEnum = stringToSemester(s);
        Semester sem = semesterList.get(semesterList.indexOf(sEnum));
        sem.addCourse(new Course(d, c, n, u));
    }


    public static void main(String[] args) {
        ScheduleBuilder sb = new ScheduleBuilder("Francis Indaheng");
    }
}