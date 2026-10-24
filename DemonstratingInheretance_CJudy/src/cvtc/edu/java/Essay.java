package cvtc.edu.java;

public class Essay extends GradedActivity {

  private double grammar;
  private double spelling;
  private double correctLength;
  private double content;

  public double getScore() {
    return grammar + spelling +
        correctLength + content;
  }

  public void setScore(double grammar, double spelling,
                       double correctLength, double content) {
    setGrammar(grammar);
    setSpelling(spelling);
    setCorrectLength(correctLength);
    setContent(content);

    super.setScore(getScore());
  }

  public double getGrammar() {
    return grammar;
  }

  public void setGrammar(double grammar) {
    if (grammar >= 0 && grammar <= 15) {
      this.grammar = grammar;
    }
  }

  public double getSpelling() {
    return spelling;
  }

  public void setSpelling(double spelling) {
    if (spelling >= 0 && spelling <= 15) {
      this.spelling = spelling;
    }
  }

  public double getCorrectLength() {
    return correctLength;
  }

  public void setCorrectLength(double correctLength) {
    if (correctLength >= 0 && correctLength <= 20) {
      this.correctLength = correctLength;
    }
  }


  public double getContent() {
    return content;
  }

  public void setContent(double content) {
    if (content >= 0 && content <= 50) {
      this.content = content;
    }
  }
}
