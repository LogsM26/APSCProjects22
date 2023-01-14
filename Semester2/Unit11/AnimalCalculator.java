

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


  public static double avLegCount(ArrayList<Animal> animals){

    double avLegCount = 0;

    for(Animal a : animals){
      avLegCount += a.getLegCount();
    }

    return avLegCount / animals.size();
  }


  public static String leastLegCount(ArrayList<Animal> animals){

    String leastLegCount = " ";
    double leastLegs = 0;

    for(Animal a : animals){

      if(a.getLegCount() <= leastLegs){
        leastLegs += a.getLegCount();
        leastLegCount = a.getName();
      }
    }

    return leastLegCount;
  }




  public static void testFunctions(ArrayList<Animal> animals, double expected1, String expected2){

    double result1 = avLegCount(animals);
    String result2 = leastLegCount(animals);

    System.out.println("Animals: ");

    for(Animal a : animals){
      System.out.println(a.getName() + " ");
    }


    System.out.println("expected1: " + expected1 + " result1: " + result1);
    System.out.println("expected2: " + expected2 + " result2: " + result2);

    if( (expected1 == result1) && (expected2 == result2) ){
      System.out.println("W");
    }else{
      System.out.println("L");
    }
  }




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

    testFunctions(animals, 3.5, "Fish");
  }
}
