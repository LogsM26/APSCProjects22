

import java.util.*;


public class Human extends Animal{


  public Human(String name, int legCount, boolean furriness){

    super(name, legCount, furriness);
  }



  public static void main(String[] args){

    Animal human = new Animal("Human", 2, false);

    System.out.println(human.getName());
    System.out.println(human.getLegCount());
    System.out.println(human.getFurriness());
  }
}
