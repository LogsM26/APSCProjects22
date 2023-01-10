

import java.util.*;


public class Car implements Vehicle{


  public Car(){

  }



  public String name(){

    return "Car";
  }

  public int wheelCount(){

    return 4;
  }

  public boolean isHumanPowered(){

    return false;
  }
}
