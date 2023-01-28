

import java.util.*;
import processing.core.*;

public class Plant1SelectLevel4 implements SceneInterface{

  //Variables
  private PApplet p;


  //Fun Stuff/Aesthetics
    //Images
    PImage star;

    //Fonts
    PFont liquid;



  public Plant1SelectLevel4(PApplet p, PImage star, PFont liquid){

    //Variables
    this.p = p;

    //Images
    this.star = star;

    //Fonts
    this.liquid = liquid;


  }





  //Custom Functions
  public void drawPlant1Levels(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);

    p.background(0, 0, 0);

    //Images



    //Main text



    //Collison Detection
    //makes it glow
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawPlant1Levels();
  }


  public void handleKeyPressed(){

  }
}
