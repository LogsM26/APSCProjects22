

import java.util.*;


public class AnimalCalculator{


  public static void everything(ArrayList<Animal> animals){

    for(Animal a : animals){

      if(a.getFurriness() == true){
        System.out.println("This animal is a " + a.getName() + " and it has " + a.getLegCount() + " legs. It is " + " furry");
      }else{
        System.out.println("This animal is a " + a.getName() + " and it has " + a.getLegCount() + " legs. It is " + "not furry");
      }
    }
  }


  public static int avLegCount(ArrayList<Animal> animals){

    int avLegCount = 0;

    for(Animal a : animals){
      avLegCount += a.getLegCount();
    }

    return avLegCount / animals.size();
  }


  public static String leastLegCount(ArrayList<Animal> animals){

    String leastLegCount = " ";
    int leastLegs = 0;

    for(Animal a : animals){

      if(a.getLegCount() <= leastLegs){
        leastLegs += a.getLegCount();
        leastLegCount = a.getName();
      }
    }

    return leastLegCount;
  }



  /*
  public void testFunctions(ArrayList<Animal> animals, String expected, int expected2, boolean expected3){

  }
  */



  public static void main(String[] args){

    ArrayList<Animal> animals = new ArrayList<Animal>();

    Human h = new Human("Human", 2, false);
    animals.add(h);

    Cat c = new Cat("Cat", 4, true);
    animals.add(c);

    Fish f = new Fish("Fish", 0, false);
    animals.add(f);

    Spider s = new Spider("Spider", 8, false);
    animals.add(s);

    everything(animals);
    System.out.println("Average Leg Count: " + avLegCount(animals));
    System.out.println("Least Leg Count: " + leastLegCount(animals));
  }
}
