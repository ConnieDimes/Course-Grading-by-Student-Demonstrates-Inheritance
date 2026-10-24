package cvtc.edu.java;

public class FinalExam extends GradedActivity {

  private int numberOfQuestions;
  private double pointsEach;
  private int numberofMissed;

  public FinalExam(int numberOfQuestions, int numberOfMissed) {
    double numericScore;

    this.numberOfQuestions = numberOfQuestions;
    this.numberofMissed = numberOfMissed;

    pointsEach = 100 / numberOfQuestions;
    numericScore = 100 - (numberOfMissed * pointsEach);
    setScore(numericScore);
  }

  public int getNumberOfQuestions() {
    return numberOfQuestions;
  }

  public double getPointsEach() {
    return pointsEach;
  }

  public int getNumberofMissed() {
    return numberofMissed;
  }
}
