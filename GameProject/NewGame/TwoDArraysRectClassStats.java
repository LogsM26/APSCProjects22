

import java.util.*;
import processing.core.*;

public class TwoDArraysRectClassStats{


  public static double averageP(TwoDArraysRectClass[][] objects){

    //start at first index if COMPARING
    double avP = objects[0][0].perim();

    for(TwoDArraysRectClass[] row : objects){

      for(TwoDArraysRectClass object : row){

        avP += object.perim();
      }
    }

    return avP / objects.length;
  }



  public static double greatestA(TwoDArraysRectClass[][] objects){

    double grA = objects[0][0].area();

    for(TwoDArraysRectClass[] row : objects){

      for(TwoDArraysRectClass object : row){

        if(object.area() > grA){
          grA = object.area();
        }

      }
    }

    return grA;
  }


  public static void main(String[] args){

    TwoDArraysRectClass[][] objects = new TwoDArraysRectClass[2][2];
    objects[0][0] = new TwoDArraysRectClass("Rect1", 5, 8);
    objects[0][1] = new TwoDArraysRectClass("Rect2", 67, 2);

    System.out.println(greatestA(objects));
  }
}
