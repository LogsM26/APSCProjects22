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


  ArrayList of blocks
    grid, 0s and 1s, empty or not
    show where the map pieces can go or something
    
    cursor
    noCursoir function
    draw the image at p.mouseX and p.mouseY
*/


import java.util.*;
import processing.core.*;

public class MasterFile extends PApplet{


  //Variables
    //ArrayLists
    ArrayList<SceneInterface> scenes;

    //Integers
    private int current = 5;
    private int scenceIndex = 0;

    //Floats

    //Strings


  //Fun Stuff/Aesthetics
    //Images
      //Cursor Images
      PImage dot;
    
      //Title
      PImage bridge;

      //Planet Select
      PImage p1;
      PImage p2;
      PImage p3;
      PImage a;

      //Level Select
      PImage star;
        
    
    //Fonts
      //Main
      PFont liquid;




  //Setup Funtions
  public void settings(){

    //size(1000, 600);
    //1400, 900
    fullScreen();

  }


  public void setup(){

    //ArrayList
    scenes = new ArrayList<SceneInterface>();

      //Add To the AL
        //Beginning
        scenes.add(new TitleScene1(this, bridge, liquid));
        scenes.add(new Manuel2(this, liquid));

        //Select
        scenes.add(new PlanetSelect3(this, p1, p2, p3, a, liquid));
        scenes.add(new CharacterSelect3(this, liquid));

        //Level Select
        scenes.add(new Plant1SelectLevel4(this, star, liquid));

        //Gameplay
        //scenes.add(new Plant1Game1(this, liquid));
        scenes.add(new GamePlay5(this, liquid));



    //Fun Stuff

      //Fonts
      liquid = createFont("DkLiquidEmbrace-YBvv.ttf", 75);

  }


  public void draw(){

    scenes.get(current).display();
      
      
    //noCursor();
      
    dot = loadImage("dot.png");
    dot.resize(80, 40);
    image(dot, mouseX, mouseY);
    
  }




  public void changeScene(int sceneIndex){

    current = sceneIndex;
  }



  //Interaction
  public void mouseClicked(){

  /*
  label class, bounding boxes
  check if inside, boolean true or false
  */

  /*
  if(label.isInside(mouseX, mouseY)){
    current = 2;
  }

    //During TITLE
    if(current == 0){

      //System.out.print(mouseX + ":" + mouseY + "      ");

      if( (mouseX < 289) && (mouseX > 77)
            && (mouseY > 748) && (mouseY < 769) ){
              //70, 50
              //520, 500

              //Into plant select
              current = 2;
              System.out.println("PLANETSELECT");
            }


    //During planet SELECT
  }else if(current == 2){

      //System.out.print(mouseX + ":" + mouseY + "      ");

      //BACK TO TITLE
      if( (mouseX < 126) && (mouseX > 32)
            && (mouseY < 875) && (mouseY > 849) ){
              //55, 25
              //605, 575

              current = 0;
              System.out.println("TITLE");


            //INTO planet 1
          }else if( (mouseX < 1269) && (mouseX > 820)
                      && (mouseY < 854) && (mouseY > 377) ){
                        //1125, 525
                        //775, 175

              current++;
              System.out.println("On Plant1");
            }

    }
    */

    scenes.get(current).handleKeyPressed();
    
    //System.out.print(mouseX + ":" + mouseY + "      ");
  }





  //Main
  public static void main(String[] args){

    //PApplet
    PApplet.main("MasterFile");
  }
}
