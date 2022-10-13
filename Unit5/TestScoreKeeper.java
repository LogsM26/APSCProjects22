

public class TestScoreKeeper{

  /*
  public static void testScoreKeeper(ScoreKeeper player, int score, int wantedScoreNormal, int wantedScoreBonus){

    int result = player.testScoreKeeper(score);

    if(result == wanted){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }

  }



  public static void main(String[] args){

    ScoreKeeper one = new ScoreKeeper(50);

    testScoreKeeper();
    testScoreKeeper();
    testScoreKeeper();
  }
  */

  public static void main(String[] args){

    ScoreKeeper player = new ScoreKeeper(100);

    player.scoreNormal();
    player.scoreBonus();
    player.scoreNormal();
  }
}
