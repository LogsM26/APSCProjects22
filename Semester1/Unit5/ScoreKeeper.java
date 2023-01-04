


public class ScoreKeeper{



  public ScoreKeeper(int scoreIn){

    score = scoreIn;
  }



  public int scoreNormal(){

    int scoreNormal = score + 100;

    System.out.println(scoreNormal);

    return scoreNormal;
  }



  public int scoreBonus(){

    int scoreBonus = score + 1000;

    System.out.println(scoreBonus);

    return scoreBonus;
  }



  private int score;
}
