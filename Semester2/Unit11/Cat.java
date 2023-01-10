

import java.util.*;


public class Cat extends Animal{


  public Cat(String name, int legCount, boolean furriness){

    super(name, legCount, furriness);
  }


  public static void main(String[] args){

    Animal cat = new Animal("Cat", 4, true);
    System.out.println(cat.getName());
    System.out.println(cat.getLegCount());
    System.out.println(cat.getFurriness());
  }
}
