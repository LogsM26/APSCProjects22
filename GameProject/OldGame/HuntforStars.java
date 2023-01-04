

import java.util.*;
import processing.core.*;


public class HuntforStars extends PApplet{



  PImage titlePage;
  PImage threePlanets2;

  String gameState = "SELECT";

  int x = 800;
  int y = 600;



  public void settings(){

    size(1100, 700);
  }


  public void setup(){

  }


  public void draw(){

    if(gameState == "TITLE"){
      drawTitle();
    } else if(gameState == "SELECT"){
      drawSelect();
    } else if(gameState == "LEVELS"){
      //drawLevels();
    } else if(gameState == "LORE"){
      //drawLore();
    } else if(gameState == "MANUAL"){
      drawManual();
    }
  }




  public void drawTitle(){

    //background
    titlePage = loadImage("titlePage.png");
    titlePage.resize(1100, 700);
    background(titlePage);


    //Enter button and text
    fill(234, 227, 211);
    strokeWeight(2);
    stroke(60, 66, 88);
    rect(505, 300, 100, 50);

    textSize(25);
    fill(60, 66, 88);
    text("Enter", 525, 335);


    //Mnanuel button
    fill(234, 227, 211);
    strokeWeight(2);
    stroke(60, 66, 88);
    rect(240, 210, 85, 50);

    textSize(20);
    fill(60, 66, 88);
    text("Manual", 250, 240);
  }


  public void drawManual(){

    //background


    //Text
      //Goal
      //How

    //Images

  }



  public void drawSelect(){

    //background
    threePlanets2 = loadImage("ThreePlanets2.png");
    threePlanets2.resize(1100, 700);
    background(threePlanets2);

    //buttons
      //levels
      //lore
      //title page
  }




  public void lightUp(){

    //whenever an object is hovered over w/mouse
    //stroke to bright yellow or something and large strokeWeight
  }




  public void keyPressed(){

  }




  public static void main(String[] args){

    PApplet.main("HuntforStars");
  }
}
