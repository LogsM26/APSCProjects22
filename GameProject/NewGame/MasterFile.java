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
    
    Save strings function to save position in the game
        whether they collected the star(s) from the past levels
        saves to a file
        can call when running again
*/


import java.util.*;
import processing.core.*;

public class MasterFile extends PApplet{


  //Variables
    //ArrayLists
    ArrayList<SceneInterface> scenes;

    //Integers
    private int current = 3;
    private int scenceIndex = 0;
    
    private int level = 0;
    private int nextLevel = 0;

    //Floats

    //Strings
    
    //Booleans
    /*
    public boolean goalRI = false;
    public boolean goalRII = false;
    public boolean goalRIII = false;
    */


  //Fun Stuff/Aesthetics
    //Images
      //Cursor Images
      PImage dot;
    
      //Title
      PImage bridge;
    
      //Character Select
      PImage face;

      //Planet Select
      PImage p1;
      PImage p2;
      PImage p3;
      PImage a;

      //Level Select
      PImage star;
    
      //Character
      //PImage face;
      //PImage right;
      //PImage left;
      //PImage front;
        
    
    //Fonts
      //Main
      PFont liquid;
    
    
  //Characters
    Character link;




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
        scenes.add(new CharacterSelect3(this, liquid, face));

        //Level Select
        scenes.add(new Plant1SelectLevel4(this, star, liquid));

      
        //Gameplay
        //scenes.add(new Plant1Game1(this, liquid));
        scenes.add(new GamePlay5(this, liquid, star));
        scenes.add(new GamePlayII5(this, liquid, star)); //6
        scenes.add(new GamePlayIII5(this, liquid, star)); //7
      
        //Goal Reached
        scenes.add(new GoalReached6(this, liquid, star)); //8
        scenes.add(new GoalReachedII6(this, liquid, star)); //9
        scenes.add(new GoalReachedIII6(this, liquid, star)); //10
      


    //Fun Stuff

      //Fonts
      liquid = createFont("DkLiquidEmbrace-YBvv.ttf", 75);
      
      

    //Character
    //PApplet p, float x, float y, float vx, float vy, PImage face, PImage right, PImage left, PImage front
      //link = new Character(p, width/2, height/2, 5, 5, face, right, left, front);

  }
    
    
  //Accsessor Functions
    /*
  public boolean getGoalRI(){
       
       return false;
   }
   public boolean getGoalRII(){
       
       return false;
   }
   public boolean getGoalRIII(){
       
       return false;
   }
   */
   
    

    
  public int getCurrent() {return current;}
    
  public int getLevel(){
      return level;
  }

    
    
    
  public void draw(){

    scenes.get(current).display();
      
    
    /*
    if(current == 6){
        
        if( (level == 0) && (scenes.get(current).getGoalRI() == true) ){
            scenes.get(current).displayI();
            
        }else if( (level == 1) && (scenes.get(current).getGoalRII() == true) ){
            scenes.get(current).displayII();
            
        }else if( (level == 2) && (scenes.get(current).getGoalRIII() == true) ){
            scenes.get(current).displayIII();
            
        }
    }
    */
      
      
      
    //noCursor();
      
    dot = loadImage("dot.png");
    dot.resize(80, 40);
    //image(dot, mouseX, mouseY);
      
    
  }




  public void changeScene(int sceneIndex){

    current = sceneIndex;
  }
    
  public void changeLevel(int nextLevel){
      
    level = nextLevel;
      
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

    scenes.get(current).handleMouseClicked();
    
    //System.out.print(mouseX + ":" + mouseY + "      ");
  }

  
  public void mouseDragged(){
      
      scenes.get(current).handleMouseDragged();
  }
  
    
  public void mouseReleased(){
      
      scenes.get(current).handleMouseReleased();
  }
    
  public void keyPressed(){
      
      scenes.get(current).handleKeyPressed();
      
  }
    
  public void keyReleased(){
      
      scenes.get(current).handleKeyReleased();
  }





  //Main
  public static void main(String[] args){

    //PApplet
    PApplet.main("MasterFile");
  }
}
