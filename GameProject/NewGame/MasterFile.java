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
    //ArrayLists
    ArrayList<SceneInterface> scenes;

    //Integers
    private int current = 1;

    //Floats

    //Strings
    //String gameState = "PLANETSELECT";


  //Fun Stuff/Aesthetics
    //Images
    PImage bridge;

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

    //size(1000, 600);
    fullScreen();
  }


  public void setup(){

    //ArrayList
    scenes = new ArrayList<SceneInterface>();

      //Add To the AL
        //Beginning
        scenes.add(new TitleScene1(this, bridge, liquid));
        //scenes.add(new Manuel2(this));

        //Select
        scenes.add(new PlanetSelect3(this, p1, p2, p3, liquid));

        //Level Select
        //scenes.add(new P1SelectLevel4(this));

        //Gameplay
        //scenes.add(new P1Game16(this));



    //Fun Stuff

      //Fonts
      liquid = createFont("DkLiquidEmbrace-YBvv.ttf", 75);

  }


  public void draw(){

    scenes.get(current).display();
  }





  //Interaction
  public void mouseClicked(){

    //During TITLE
    if(current == 1){

      if( (mouseX < width/20+20) && (mouseX > width/20)
            && (mouseY < height-80) && (mouseY > height-100) ){

              //Into plant select
              current = 3;
              System.out.println("PLANETSELECT");
            }


    //During planet SELECT
    }else if(current == 3){

      //BACK TO TITLE
      if( (mouseX < width/20-25+30) && (mouseX > width/20-25)
            && (mouseY < height-25+30) && (mouseY > height-25) ){

              current = 1;
              System.out.println("TITLE");


            //INTO planet 1
            }else if( (mouseX < width/2+25+600) && (mouseX > width/2+25)
                      && (mouseY < height/2-125+600) && (mouseY > height/2-125) ){

              current = 4;
              System.out.println("On Plant1");
            }


    //During P1
    /*
    }else if(current == 4){

      //Into games
      if( ()){

        current = 5;
        System.out.println("Into game 1");
      }
      */

    }
  }





  //Main
  public static void main(String[] args){

    //PApplet
    PApplet.main("MasterFile");
  }
}
