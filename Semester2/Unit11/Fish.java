

import java.util.*;


public class Fish extends Animal{


  public Fish(String name, int legCount, boolean furriness){

    super(name, legCount, furriness);
  }


  public static void main(String[] args){

    Animal fish = new Animal("Fish", 8, false);
    System.out.println(fish.getName());
    System.out.println(fish.getLegCount());
    System.out.println(fish.getFurriness());
  }
}
