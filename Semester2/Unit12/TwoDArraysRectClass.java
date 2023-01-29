

import java.util.*;
import processing.core.*;

public class TwoDArraysRectClass{


  private String name;

  private double width;
  private double height;

  private double p;
  private double a;

  public TwoDArraysRectClass(String name, double width, double height){

    this.name = name;

    this.width = width;
    this.height = height;
  }


  public String getName() {return name;}

  public double getWidth() {return width;}
  public double getHeight() {return height;}



  public double perim(){

    //double p = 0;

    p = (2*width)+(2*height);

    return p;
  }

  public double area(){

    //double a = 0;

    a = width*height;

    return a;
  }
}
