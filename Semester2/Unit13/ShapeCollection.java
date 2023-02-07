

import java.util.*;
import processing.core.*;

public class ShapeCollection{

  private static ArrayList<Shape> shapes = new ArrayList<Shape>();


  public static void addShape(Shape s){

    shapes.add(s);
  }


  public static int numOfSides(String name){

    int numSides = 0;

    for(Shape s : shapes){

      if(name.equals(s.getName())){

        numSides = s.getNumSides();
      }
    }

    return numSides;
  }


  public static int avNumSides(){

    int av = 0;

    for(Shape s : shapes){
      av += s.getNumSides();
    }

    return av / shapes.size();
  }


  public static ArrayList<String> evenNumSides(){

    ArrayList<String> evens = new ArrayList<String>();

    for(Shape s : shapes){
      if(s.getNumSides()%2 == 0){
        evens.add(s.getName());
      }
    }

    return evens;
  }



  public static void main(String[] args){

    addShape(new Shape("Pentagon", 5));
    addShape(new Shape("Dodecagon", 12));
    addShape(new Shape("Pentadecgon", 15));

    System.out.println(numOfSides("Pentagon"));
    //used ints not floats, not a decimal
    System.out.println(avNumSides());
    System.out.println(evenNumSides());
  }
}
