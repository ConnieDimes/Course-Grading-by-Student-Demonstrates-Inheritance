package cvtc.edu.java;

public class PassFailExam extends PassFailActivity {

  private int numberOfQuestions;
  private int numberOfMissed;
  private double pointsEach;

  public PassFailExam(double minimumPassingScore,
                      int numberOfQuestions, int numberOfMissed) {
    super(minimumPassingScore);
    double numericScore;

    this.numberOfQuestions = numberOfQuestions;
    this.numberOfMissed = numberOfMissed;

    pointsEach = 100 / numberOfQuestions;
    numericScore = 100 - (numberOfMissed * pointsEach);

    setScore(numericScore);
  }

  public int getNumberOfQuestions() {
    return numberOfQuestions;
  }
  public int getNumberOfMissed() {
    return numberOfMissed;
  }
  public double getPointsEach() {
    return pointsEach;
  }

}
