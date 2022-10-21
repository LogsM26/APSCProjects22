

public class TestMagic8Ball{


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

    System.out.println("Will my favorite show be renewed?");
    System.out.println(Magic8Ball.ask("Will my favorite show be renewed?"));

    System.out.println("shfsj");
    System.out.println(Magic8Ball.ask("shfsj"));

    System.out.println("Will I fail my next test?");
    System.out.println(Magic8Ball.ask("Will I fail my next test?"));

    System.out.println("Will I be diagnosied with autisim?");
    System.out.println(Magic8Ball.ask("Will I be diagnosied with autisim"));
  }
}
