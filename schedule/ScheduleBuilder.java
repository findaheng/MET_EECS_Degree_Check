package schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleBuilder {
  String name;
  private Semester sem1;
  private Semester sem2;
  private Semester sem3;
  private Semester sem4;
  private Semester sem5;
  private Semester sem6;
  private Semester sem7;
  private Semester sem8;

  public ScheduleBuilder(String name) {
    this.name = name;
    sem1 = new Semester(Semesters2022.FA18);
    sem2 = new Semester(Semesters2022.SP19);
    sem3 = new Semester(Semesters2022.FA19);
    sem4 = new Semester(Semesters2022.SP20);
    sem5 = new Semester(Semesters2022.FA20);
    sem6 = new Semester(Semesters2022.SP21);
    sem7 = new Semester(Semesters2022.FA21);
    sem8 = new Semester(Semesters2022.SP22);
  }

  public static void main(String[] args) {
    ScheduleBuilder sb = new ScheduleBuilder("Francis Indaheng");
  }
}
