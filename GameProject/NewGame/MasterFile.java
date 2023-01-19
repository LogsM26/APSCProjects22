/*
  NOTES:

  character should have a POSITION and a VELOCITY
    PVectors
    the longer you hold faster you get or something


    translation, rotate, scale
      translate moves the origin to the middle of the screen
        width/2, height/2
      for rotate you can draw an object at the origin
        will rotate in place

      push pop

  Controlls the scenes
    Interface

  scene Interface
    display and keypressed

  change between classes for each scene
     make an arraylist of scnees
     add into setup in MasterFile
     draw is get(current).display();
     scenes.get(current).handleKeyPressed();
        current is a Private Integer

  print an integer to say what scene you're on

  induvival scene
    current++; to change scenes w/keypressed or something
    each is a class that implements Interface
    construcuor has the this.p = p;

  each level(s) for each planet
    three constalations
      list horizontally of star fragments
      each is a level for one constalation
      next one is locked
        image or color
        if statement somewhere
*/


import java.util.*;
import processing.core.*;

public class MasterFile extends PApplet{


  //Variables
    //Integers

    //Floats

    //Strings
    String gameState = "PLANETSELECT";


  //Fun Stuff/Aesthetics
    //Images
      //Title
      PImage bridge;

      //Planet Select
      PImage p1;
      PImage p2;
      PImage p3;

      //Level Select
      PImage star;

    //Fonts
      //Main
      PFont liquid;




  //Setup Funtions
  public void settings(){

    size(1000, 600);
  }


  public void setup(){

    //background(100,4,37);
    liquid = createFont("DkLiquidEmbrace-YBvv.ttf", 75);
  }


  public void draw(){

    //gameState If Statement
    if(gameState == "TITLE"){
      drawTitle();
    }else if(gameState == "MANUEL"){
      //drawManuel();

    }else if(gameState == "PLANETSELECT"){
      drawPlanetSelect();

    }else if(gameState == "P1"){
      drawSelectP1();
    }else if(gameState == "P1LEVELS"){
      //drawP1Levels();
    }else if(gameState == "P1G1"){
      //drawSelectP1G1();
    }
  }




  //Beginning Custom Functions
  public void drawTitle(){

    //Images
    bridge = loadImage("Bridge.jpg");
    bridge.resize(width, height);
    background(bridge);
    //image(bridge, 0, 0);


    //Main text
    textSize(75);
    fill(235, 198, 99);
    textFont(liquid);
    text("Hunt for Stars", width/20, height/6+75);


    //Buttons
    textSize(20);
    fill(209, 73, 19);
    text("Visit the Stars", width/20, height-100);

    textSize(20);
    fill(209, 73, 19);
    text("Manual", width/20, height-75);

    textSize(20);
    fill(209, 73, 19);
    text("Credits", width/20, height-50);


    //Collison Detection
    //makes it glow
  }


  public void drawSelect(){

    background(5, 21, 33);

    //Images

      //Planets
      p1 = loadImage("P1Earth.png");
      p1.resize(600, 600);
      image(p1, width/2+25, height/2-125);

      p2 = loadImage("P2Mars.png");
      p2.resize(300, 300);
      image(p2, width/10, height/4);

      p3 = loadImage("P3Alge.png");
      p3.resize(200, 200);
      image(p3, width/2, height/20);


    //Text
    textFont(liquid);
    textSize(30);
    fill(103, 209, 214);
    text("Return",  width/20-25, height-25);
  }




  //Planet Levels
  public void drawSelectP1(){

    //Images
      //Constalations

      //Stars
  }




  //Interaction
  public void mouseClicked(){

    //During TITLE
    if(gameState.equals("TITLE")){

      if( (mouseX < width/20+20) && (mouseX > width/20)
            && (mouseY < height-80) && (mouseY > height-100) ){

              gameState = "PLANETSELECT";
              System.out.println("PLANETSELECT");
            }


    //During SELECT
  }else if(gameState.equals("PLANETSELECT")){

      if( (mouseX < width/20-25+30) && (mouseX > width/20-25)
            && (mouseY < height-25+30) && (mouseY > height-25) ){

              gameState = "TITLE";
              System.out.println("TITLE");


            //P1
            }else if( (mouseX < width/2+25+600) && (mouseX > width/2+25)
                      && (mouseY < height/2-125+600) && (mouseY > height/2-125) ){

              gameState = "P1";
              System.out.println("P1");
            }


    //During P1
    }
  }




  //Main
  public static void main(String[] args){

    //PApplet
    PApplet.main("MasterFile");
  }
}
