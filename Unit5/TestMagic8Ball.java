

public  class TestMagic8Ball{


  //make object from class
  /*
  public static void testMagic8Ball(Magic8Ball one, final String input, String wanted){

    String result = one.ask(input);

    System.out.print(" input: " + input + " wanted: " + wanted + " result: " + result);

    if(result.equals(wanted)){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    Magic8Ball input1 = new Magic8Ball("uyg");

    testMagic8Ball(input1, "Are you real?", "");
    testMagic8Ball(input1, "Will my favoirte show be renewed?", "");
    testMagic8Ball(input1, "I don't remember", "");

    input1.ask("jkfbsjf");
    input1.ask()

  }
  */



  public static void main(String[] args){

    Magic8Ball question1 = new Magic8Ball("Will my favoirite show be renewed?");
    Magic8Ball question2 = new Magic8Ball("ihsbf");

    question1.ask();
    question1.ask();
    question2.ask();
  }
}