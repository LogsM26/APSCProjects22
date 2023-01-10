

import java.util.*;


public class VehicleTest{



  public static int totalWheels(ArrayList<Vehicle> vehicles){

    int totalWheels = 0;

    for(Vehicle v : vehicles){
      totalWheels += v.wheelCount();
    }


    return totalWheels;
  }


  public static ArrayList<String> humanPowered(ArrayList<Vehicle> vehicles){

    ArrayList<String> humanPowers = new ArrayList<String>();

    for(Vehicle v : vehicles){
      if(v.isHumanPowered() == true){
        humanPowers.add(v.name());
      }
    }


    return humanPowers;
  }




  public static void main(String[] args){

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Car c = new Car();
    vehicles.add(c);

    Motorcycle m = new Motorcycle();
    vehicles.add(m);

    Bicycle b = new Bicycle();
    vehicles.add(b);

    Unicycle u = new Unicycle();
    vehicles.add(u);



    for(Vehicle v : vehicles){
      System.out.println(v.name() + " " + v.wheelCount() +
                          " " + v.isHumanPowered());
    }


    System.out.println(totalWheels(vehicles));
    System.out.println(humanPowered(vehicles));
  }
}
