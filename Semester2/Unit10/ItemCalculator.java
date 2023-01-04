

import java.util.*;


public class ItemCalculator{


  //Test It!
  public static void testItemCalculator(ArrayList<Item> items, /*float expected,*/ String expected2){

    String result = printNamePrice(items);
    //float result = averagePrice(items);
    //String result = mostExpensive(items);


    System.out.print("items: ");


    for(Item item : items){
      System.out.print(people + " ");
    }


    //System.out.println("expected: " + expected + " result: " + result);
    System.out.println("expected: " + expected2 + " result: " + result);

    /*
    if(expected == result){
      System.out.println("W");
    }else{
      System.out.println("L");
    }
    */

    if(expected2 == result){
      System.out.println("W");
    }else{
      System.out.println("L");
    }

  }



  //Prints Name and Price, FOR EACH LOOP
  public static String printNamePrice(ArrayList<Item> items){

    String namePrice = " ";

    for(Item i : items){
      System.out.println("This grocery is " + i.getName() + " and it costs " + i.getPrice());
    }

    return namePrice;
  }


  //Returns Average Price of Item
  public static float averagePrice(ArrayList<Item> items){

    float total = 0;

    for(Item i : items){
      total += i.getPrice();
    }

    return total / items.size();
  }


  //Returns Most Expensive Item Name
  public static String mostExpensive(ArrayList<Item> items){

    float thing = 0.0f;
    String expensive = " ";

    for(Item i : items){

      if(i.getPrice() > thing){
        thing = i.getPrice();
      }

      expensive = i.getName();
    }

    return expensive;
  }



  public static void main(String[] args){

    ArrayList<Item> items = new ArrayList<Item>();

    //Add to AL
    items.add(new Item("Milk", 5.0f));
    items.add(new Item("Strawberries", 6.0f));
    items.add(new Item("Pinot Noir", 1800.0f));
    items.add(new Item("Truffle Oil", 300.0f));
    items.add(new Item("Arrewon Water", 70.0f));


    //Test It! Pt.2
    testItemCalculator(items, "This grocery is Milk and it costs 5.0");
    //testItemCalculator(items, 436.2f);
    //testItemCalculator(items, "Pinot Noir");
  }
}
