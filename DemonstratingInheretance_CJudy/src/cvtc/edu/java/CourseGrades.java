package cvtc.edu.java;

public class CourseGrades implements Analyzable {

  private final int NUMBER_OF_GRADES = 4;
  private GradedActivity[] grades;

  public CourseGrades() {
    grades = new GradedActivity[NUMBER_OF_GRADES];
  }

  public void setLab(GradedActivity gradedActivity) {
    grades[0] = gradedActivity;
  }

  public void setPassFailExam(PassFailExam passFailExam) {
    grades[1] = passFailExam;
  }

  public void setEssay(Essay essay) {
    grades[2] = essay;
  }

  public void setFinalExam(FinalExam finalExam) {
    grades[3] = finalExam;
  }

  public String toString() {
    String scores = "Lab Score: " + grades[0].getScore() + "\n"
        + " Grade: " + grades[0].getGrade() + "\n\n" +
        "PassFail Score: " + grades[1].getScore() + "\n" +
        " Grade: " + grades[1].getGrade() + "\n\n" +
        "Essay Score: " + grades[2].getScore() + "\n" +
        " Grade: " + grades[2].getGrade() + "\n\n" +
        "Final Exam Score: " + grades[3].getScore() + "\n" +
        " Grade: " + grades[3].getGrade() + "\n";

    return scores;
  }

  public double getAverage() {
    double total = 0;

    for (GradedActivity activity : grades) {
      total += activity.getScore();
    }

    return total / NUMBER_OF_GRADES;
  }

  public GradedActivity getHighest() {
    GradedActivity highest = grades[0];

    for (int i = 1; i < grades.length; i++) {
      if (grades[i].getScore() > highest.getScore()) {
        highest = grades[i];
      }
    }
    return highest;
  }

  public GradedActivity getLowest() {
    GradedActivity lowest = grades[0];
    for (int i = 1; i < grades.length; i++) {
      if (grades[i].getScore() < lowest.getScore()) {
        lowest = grades[i];
      }
    }
    return lowest;
  }
}
