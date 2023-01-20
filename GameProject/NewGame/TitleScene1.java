

import java.util.*;
import processing.core.*;

public class TitleScene1 implements SceneInterface{

  //Variables
  private PApplet p;

  //Fun Stuff/Aesthetics

    //Images
    PImage bridge;

    //Fonts
    PFont liquid;



  public TitleScene1(PApplet p, PImage bridge, PFont liquid){

    //Variables
    this.p = p;

    //Images
    this.bridge = bridge;

    //Fonts
    this.liquid = liquid;


  }





  //Custom Functions
  public void drawTitle(){


    //Images
    bridge = p.loadImage("Bridge.jpg");
    bridge.resize(p.width, p.height);
    p.background(bridge);
    //image(bridge, 0, 0);


    //Main text
    p.textSize(75);
    p.fill(235, 198, 99);
    p.textFont(liquid);
    p.text("Hunt for Stars", p.width/20, p.height/6+75);


    //Buttons
    p.textSize(20);
    p.fill(209, 73, 19);
    p.text("Visit the Stars", p.width/20, p.height-100);

    p.textSize(20);
    p.fill(209, 73, 19);
    p.text("Manual", p.width/20, p.height-75);

    p.textSize(20);
    p.fill(209, 73, 19);
    p.text("Credits", p.width/20, p.height-50);


    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);

    //Collison Detection
    //makes it glow
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawTitle();
  }


  public void handleKeyPressed(){

  }
}
