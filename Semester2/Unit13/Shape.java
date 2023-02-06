

import java.util.*;
import processing.core.*;

public class Shape{

  private int numSides;
  private String name;

  public Shape(String name, int numSides){

    this.name = name;
    this.numSides = numSides;
  }

  public String getName() {return name;}
  public int getNumSides() {return numSides;}
}
