

public class PersonClass{



  public PersonClass(String nameIn, String numPetsIn){

    name = nameIn;
    numPets = numPetsIn;

  }



  public String name(){

    return name;
  }

  public String numPets(){

    return numPets;
  }





  public String greeting(){

    return "Hello, my name is " + name + " and I have " + numPets + " pets";
  }



  //Private Non-Changing Variables
  private String name;
  private String numPets;
}
