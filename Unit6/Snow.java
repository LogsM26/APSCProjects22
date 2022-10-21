


import processing.core.*;
import java.util.*;



public class Snow extends PApplet{


  private ArrayList<Snow> crystals;




  public void settings(){

    size(600, 600);
  }



  public void setup(){

    crystals = new ArrayList<Snow>();
    sprinkleSnow();
  }


  public void sprinkleSnow(){

    PVector position = new PVector(random(0, width), 0);
    PVector v = PVector.random2D();
    v.setMag(random(1, 3));

    float radius = random(2, 10);


    Snow sphere = new SnowClass(this, position, v, radius);
    crystals.add(sphere);


    for(int i = 0; i < 150; i++){
      sprinkleSnow();
    }
  }


  public void draw(){

    background(8, 125, 37);

    for(Snow sphere: crystals){
      sphere.display();
    }
  }




  public static void main(String[] args){

    PApplet.main("Snow");
  }

}
