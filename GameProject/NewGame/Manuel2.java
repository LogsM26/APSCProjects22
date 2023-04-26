

import java.util.*;
import processing.core.*;

public class Manuel2 implements SceneInterface{

  //Variables
  private MasterFile p;
    
    //Integers
    
    //Floats
    
    
  //ArrayLists
  private ArrayList<Label> labels;
  private ArrayList<Tile> tiles;
    private Tile active = null;


  //Fun Stuff/Aesthetics
    //Images

    //Fonts
    PFont liquid;



  public Manuel2(MasterFile p, PFont liquid){

    //Variables
    this.p = p;

    //Images

    //Fonts
    this.liquid = liquid;
      
      
    //ArrayLists
    labels = new ArrayList<Label>();
    labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
      
    tiles = new ArrayList<Tile>();
    tiles.add(new Tile(p, 0, p.width/15+p.width/15, p.height-p.height/6, 140, 140));

  }





  //Custom Functions
  public void drawManuel(){
    
    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);
      
    //1400, 900
    p.background(5, 21, 33);

      
    //Images


    //Main text
    p.textFont(liquid);
        
        //Header
        p.textSize(75);
        p.fill(235, 198, 99);
        p.text("Guide to Playing", p.width/15, p.height/9);
      
        //Subheadings
        p.textSize(45);
        p.fill(209, 73, 19);
        p.text("Main Goal/Storyline", p.width/15, p.height/4);
        p.text("Moving Tiles", p.width/15, p.height/2);
        p.text("Moving Your Character", p.width/2+100, p.height/4);
        p.text("Finding Fragments and Goals", p.width/2+100, p.height/2);
      
        p.textSize(30);
        p.fill(235, 199, 99);
        p.text("Good Luck and Have Fun!", p.width/2+100, p.height/2+350);
            
            //Bodytext
            p.textSize(25);
            p.fill(103, 209, 214);
            p.text("Star fragments have suddenly and", p.width/15, p.height/4+40);
            p.text("unexplainably fallen from the sky!", p.width/15, p.height/4+65);
            p.text("You have been chosen to journey and find these fragments", p.width/15, p.height/4+110);
            p.text("in order to return them to the night sky!", p.width/15, p.height/4+135);
            
            p.text("15 Tiles will appear on the bottom right", p.width/15, p.height/2+40);
            p.text("Click and click drag to move them with the Mouse", p.width/15, p.height/2+75);
            p.text("Hover over a tile with the Mouse", p.width/15, p.height/2+110);
            p.text("to rotate using the Right Arrow Key", p.width/15, p.height/2+135);
            p.text("The tiles will snap into place in the middle of grid squares", p.width/15, p.height/2+180);
      
            p.text("Use keys WASD to move your character around", p.width/2+100, p.height/4+40);
            p.text("You can only walk on brown pathways", p.width/2+100, p.height/4+75);
            p.text("or grass with bushes", p.width/2+100, p.height/4+95);
            p.text("Fully walk up to any objects you see", p.width/2+100, p.height/4+130);
      
            p.text("Once All Tiles are placed, you can obtain a fragment", p.width/2+100, p.height/2+40);
            p.text("by walking up to it and clicking with the Mouse", p.width/2+100, p.height/2+75);
            p.text("Play to find out what's inside!", p.width/2+100, p.height/2+110);
            p.text("Obtaing fragments gives you fun facts", p.width/2+100, p.height/2+180);
            p.text("and another goal reached!", p.width/2+100, p.height/2+205);

      
      
    p.textSize(30);
    p.fill(235, 199, 99);


    //Collison Detection
    //makes it glow
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawManuel();
      
    for(Label label : labels){
        label.display();
    }
      
    for(Tile tile : tiles){
        tile.displaySP();
    }
  }


  public void handleMouseClicked(){
      
    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
        p.changeScene(labels.get(0).getTargetScene(2));
    }
      
    //Tile Stuff
    active = null;
    for(Tile tile : tiles){
        
        if(tile.isInsideTile(p.mouseX, p.mouseY) == true){
            active = tile;
        }
    }
  }
    
  public void handleMouseDragged(){
      
      if(active != null){
            active.x = p.mouseX;
            active.y = p.mouseY;
            //System.out.println("Not Null");
      }
  }

  public void handleMouseReleased(){
      
      
  }
    
  public void handleKeyPressed(){
      
      for(Tile tile : tiles){
        
        if(tile.isInsideTile(p.mouseX, p.mouseY) == true){
            tile.keyPressedTile();
            //tile.mouseClicked();
        }
    }
  }
    
  public void handleKeyReleased(){
    
  }
}
