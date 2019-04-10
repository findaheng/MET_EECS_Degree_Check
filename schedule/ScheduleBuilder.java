package schedule;

import java.util.List;

public class ScheduleBuilder {
    String name;
    List<Semester> semList;

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
        semList = List.of(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
    }

    /** Help menu listing available actions.*/
    public void help() {
        System.out.println("Available functions:\n"
                + "   addCourse(Semester sem, Course cse) — ");
    }

    /** Add a course to a specific semester.*/
    public void addCourse(Semester sem, Course cse) {

    }


    public static void main(String[] args) {
        ScheduleBuilder sb = new ScheduleBuilder("Francis Indaheng");
    }
}