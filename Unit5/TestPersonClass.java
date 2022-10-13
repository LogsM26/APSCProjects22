

public class TestPersonClass{



  public static void testPersonClass(PersonClass person, String name, String numPets,
                                       String greeting){

    String result = person.greeting();

    System.out.print(" name: " + name + " numPets: " + numPets + " greeting: " + greeting + " result: " + result);

    if(result.equals(greeting)){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }

  }



  public static void main(String[] args){

    PersonClass Grey = new PersonClass("Grey", "5");
    PersonClass Ruby = new PersonClass("Ruby", "8");

    testPersonClass(Grey, "Grey", "5", "Hello, my name is Grey and I have 5 pets");
    testPersonClass(Ruby, "Ruby", "8", "Hello, my name is Ruby and I have 8 pets");

  }
}
