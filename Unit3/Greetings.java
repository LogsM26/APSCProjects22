

public class Greetings{



  public static void greetings(String name){
    //System.out.println("Hello " + name + "  how are you?");

  }



  public static void testGreetings(String name, boolean wanted){

    boolean result = greetings(name, wanted);

    System.out.print("name: " + name + "wanted: " + wanted + "result: " + result);

    if(result == wanted){
      System.out.println("W");
    }else{
      System.out.println("L");
    }
  }

  public static void main(String[] args){
    testGreetings(Grey, Hello Grey how are you?);
    testGreetings(Dr.Fitts, Hello Dr.Fitts how are you?);
    testGreetings(Ffhr, Hello Ffhr how are you?);
  }
}
