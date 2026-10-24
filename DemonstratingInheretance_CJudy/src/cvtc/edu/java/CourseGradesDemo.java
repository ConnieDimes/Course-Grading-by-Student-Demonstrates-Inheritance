package cvtc.edu.java;

public class CourseGradesDemo {

  public static void main(String[] args) {
    CourseGrades courseGrades = new CourseGrades();

    GradedActivity lab = new GradedActivity();
    lab.setScore(85);

    PassFailExam passFailExam = new PassFailExam
        (70, 20, 3);

    Essay essay = new Essay();
    essay.setScore(10, 10, 10, 45);


    FinalExam finalExam = new FinalExam(50, 10);

    courseGrades.setLab(lab);
    courseGrades.setPassFailExam(passFailExam);
    courseGrades.setEssay(essay);
    courseGrades.setFinalExam(finalExam);

    System.out.println(courseGrades);
    System.out.println("Average Score: " + courseGrades.getAverage() + "\n");
    System.out.println("Highest Score: " +
        courseGrades.getHighest().getScore() + "\n");
    System.out.println("Lowest Score: " + courseGrades.getLowest().getScore());

  }
}

