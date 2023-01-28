

import java.util.*;
import processing.core.*;

public class PlanetSelect3 implements SceneInterface{

  //Variables
  private PApplet p;


  //Fun Stuff/Aesthetics
    //Images
    PImage p1;
    PImage p2;
    PImage p3;

    //Fonts
    PFont liquid;



  public PlanetSelect3(PApplet p, PImage p1, PImage p2, PImage p3, PFont liquid){

    //Variables
    this.p = p;

    //Images
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;

    //Fonts
    this.liquid = liquid;


  }



  public void drawPlanetSelect(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);


    p.background(5, 21, 33);

    //Images

      //Planets
      p1 = p.loadImage("P1Earth.png");
      p1.resize(600, 600);
      p.image(p1, p.width/2+25, p.height/2-125);
      //525, 175

      p2 = p.loadImage("P2Mars.png");
      p2.resize(300, 300);
      p.image(p2, p.width/10, p.height/4);
      //100, 150

      p3 = p.loadImage("P3Alge.png");
      p3.resize(200, 200);
      p.image(p3, p.width/2, p.height/20);
      //500, 30


    //Text
    p.textFont(liquid);
    p.textSize(30);
    p.fill(103, 209, 214);
    p.text("Return",  p.width/20-40, p.height-25);
    //25, 575
  }




  //Interface Functions
  public void display(){

    //Calling Custom Functions
    drawPlanetSelect();
  }


  public void handleKeyPressed(){

  }
}
