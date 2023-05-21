

import java.util.*;
import processing.core.*;

public class CharacterSelect3 implements SceneInterface{
    
    
    //Variables
    private MasterFile p;

    //ArrayLists
    ArrayList<Label> labels;
    
        //Tiles
        ArrayList<Tile> tiles;
        ArrayList<Tile> tiles2;
        ArrayList<Tile> tiles3;


    //Fun Stuff/Aesthetics
        //Images
        PImage face;

        //Fonts
        PFont liquid;
    
        //Character
        Character link;



  public CharacterSelect3(MasterFile p, PFont liquid, PImage face){

    //Variables
    this.p = p;

    //Images
    this.face = face;

    //Fonts
    this.liquid = liquid;

    //Labels
    labels = new ArrayList<Label>();
    labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
      
    //Tiles
    tiles = new ArrayList<Tile>();
    tiles2 = new ArrayList<Tile>();
    tiles3 = new ArrayList<Tile>();
      
      
    //Character
    link = new Character(p, p.width/6+275, p.height/2+25, 10, 10);

  }





  //Custom Functions
  public void drawCharacterSelect3(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);

    p.background(5, 21, 33);


    //Images
    face = p.loadImage("faceyouloz.png");
    face.resize(300, 300);
    p.image(face, p.width/6-100, p.height/2-100);
    
    

    //Text
    p.textFont(liquid);
        
        //Heading
        p.textSize(75);
        p.fill(235, 198, 99);
        p.text("Character Overview and Fun Facts", p.width/15, p.height/9);
      
        //Body Text
        p.textSize(40);
        p.fill(103, 209, 214);
        p.text("The only current Character is", p.width/2, p.height/9+200);
        p.text("LINK from The Legend of Zelda:", p.width/2, p.height/9+250);
        p.text("The Minish Cap", p.width/2, p.height/9+300);
    
        p.text("Movement is described in the Manuel", p.width/2, p.height/9+400);
        p.text("But you can use keys W A S D", p.width/2, p.height/9+450);
        p.text("Try with the smaller Link on the left", p.width/2, p.height/9+500);


    p.textSize(30);
    p.fill(235, 199, 99);
      
    //Collison Detection
    //makes it glow
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawCharacterSelect3();

    for(Label label : labels){
      label.display();
    }
      
      
    //Character
    link.displayChara(tiles, tiles2, tiles3);

  }
    
    
  
   /*
  public void displayI(){
      
  }
  public void displayII(){
      
  }
  public void displayIII(){
      
  }
  */
    
    
 

  public void handleMouseClicked(){

    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
        p.fill(235, 198, 99);
        p.changeScene(labels.get(0).getTargetScene(2));
    }
  }
  
  public void handleMouseDragged(){
      
  }
    
  public void handleMouseReleased(){
      
  }
    
  public void handleKeyPressed(){
      
      link.handleKeyPressedChara();
     
  }
    
  public void handleKeyReleased(){
      
      link.handleKeyReleasedChara();
  }
    
    
    
    
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
    
}