

import java.util.*;


public class Spider extends Animal{


  public Spider(String name, int legCount, boolean furriness){

    super(name, legCount, furriness);
  }


  public static void main(String[] args){

    Animal spider = new Animal("Spider", 8, false);
    System.out.println(spider.getName());
    System.out.println(spider.getLegCount());
    System.out.println(spider.getFurriness());
  }
}
