

public class TestPersonClass{



  public static boolean testPersonClass(PersonClass name, PersonClass numPets,
                                        PersonClass greeting, boolean wanted){

    boolean result = testPersonClass(name, numPets, greeting, wanted);

    System.out.print(" name: " + name + " numPets: " + numPets + " greeting: " + greeting
                      + " wanted: " + wanted + " result: " + result);

    if(result == wanted){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }

  }



  public static void main(String[] args){

    PersonClass Grey = new PersonClass(Grey, 5);
    Grey.greeting();

    PersonClass Ruby = new PersonClass(Ruby, 8);
    Ruby.greeting();

    testPersonClass(Grey, 5, "Hello, my name is Grey and I have 5 pets", true);
    testPersonClass(Ruby, 8, "Hello, my name is and I have 8 pets", false);

  }
}
