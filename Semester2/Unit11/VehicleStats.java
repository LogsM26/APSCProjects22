

import java.util.*;


public class VehicleStats{


  public static int totalWheels(ArrayList<Vehicle> vehicles){

    int totalWheels = 0;

    for(Vehicle v : vehicles){
      totalWheels += v.wheelCount();
    }


    System.out.println(totalWheels);
    return totalWheels;
  }


  public static ArrayList<String> humanPowered(ArrayList<Vehicle> vehicles){

    ArrayList<String> humanPowers = new ArrayList<String>();

    for(Vehicle v : vehicles){
      if(v.isHumanPowered() == true){
        humanPowers.add(v.name());
      }
    }


    System.out.println(humanPowers);
      return humanPowers;
  }



  public static void main(String[] args){

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    System.out.println(totalWheels(vehicles));
    System.out.println(humanPowered(vehicles));
  }
}
