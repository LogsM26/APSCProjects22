

public class Magic8Ball{



  private String replies;



  public Magic8Ball(String repliesIn){

    replies = repliesIn;
  }



  public String ask(String question){


    if(Math.random()*100 > 75){
      return r1;

    }else if((Math.random()*100 > 50) && (Math.random()*100 < 75)){
      return r2;

    }else if(Math.random()*100 < 50){
      return r3;

    }else{
      return r4;
    }

  }



  //private final String question;

  private final String r1 = "The sun's premortal position indecates the Greek Gods are nonchalant.";
  private final String r2 = "Your close friends and familt will provide you with all the signs you need";
  private final String r3 = "No.";
  private final String r4 = "Whatever you seek has already presented itself to you through the asteral projections.";
}
