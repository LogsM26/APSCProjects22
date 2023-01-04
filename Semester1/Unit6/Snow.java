


import processing.core.*;
import java.util.*;



public class Snow extends PApplet{


  private ArrayList<SnowClass> crystals;




  public void settings(){

    size(400, 400);
  }



  public void setup(){

    crystals = new ArrayList<SnowClass>();
    sprinkleSnow();
  }


  public void sprinkleSnow(){

    PVector position = new PVector(random(0, width), 0);
    PVector v = PVector.random2D();
    v.setMag(random(1, 2));

    float radius = random(2, 10);

    SnowClass sphere = new SnowClass(this, position, v, radius);
    crystals.add(sphere);

  }


  public void draw(){

    background(3, 37, 126);

    for(SnowClass sphere: crystals){
      sphere.display();
    }

    for(int i = 0; i < 1; i++){
      sprinkleSnow();
    }
  }




  public static void main(String[] args){

    PApplet.main("Snow");
  }

}
