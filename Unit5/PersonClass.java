

public class PersonClass{



  public PersonClass(String nameIn, String numPetsIn){

    nameIn = "";
    numPetsIn = "";

  }



  public static String name(){
    return name;
  }

  public static String numPets()
    return numPets;
  }





  public static String greeting(){

    System.out.println("Hello, my name is" + name + "and I have" + numPets);
  }



  //Private Non-Changing Variables
  private String name;
  private String numPets;
}
