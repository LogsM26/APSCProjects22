

import java.util.*;
import processing.core.*;

public class Manuel2 implements SceneInterface{

  //Variables
  private PApplet p;


  //Fun Stuff/Aesthetics
    //Images

    //Fonts
    PFont liquid;



  public Manuel2(PApplet p, PFont liquid){

    //Variables
    this.p = p;

    //Images

    //Fonts
    this.liquid = liquid;


  }





  //Custom Functions
  public void drawManuel(){


    //Images


    //Main text



    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);

    //Collison Detection
    //makes it glow
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawManuel();
  }


  public void handleKeyPressed(){

  }
}
