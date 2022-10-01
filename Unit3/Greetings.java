

public class Greetings{



  public static String greetings(String name){

    return "Hello " + name + " how are you?";

  }



  public static void testGreetings(String name, String wanted){

    String result = greetings(name);
      //greeting(name) is a String

    System.out.print("name: " + name + " wanted: " + wanted + " result: " + result);

    if(result.equals(wanted)){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    testGreetings("Grey", "Hello Grey how are you?");
    testGreetings("Dr.Fitts", "Hello Dr.Fitts how are you?");
    testGreetings("Ffhr", "Hello Ffhr how are you?");

  }
}
