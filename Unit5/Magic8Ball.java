

public class Magic8Ball{



  public Magic8Ball(String questionIn){

    question = questionIn;
  }



  public String ask(){

    String r1 = "The sun's premortal position indecates the Greek Gods are nonchalant.";
    String r2 = "Your close friends and familt will provide you with all the signs you need";
    String r3 = "No.";
    String r4 = "Whatever you seek has already presented itself to you through the asteral projections.";


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



  private final String question;
}
