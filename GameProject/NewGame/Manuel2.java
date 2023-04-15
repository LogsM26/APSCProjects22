

import java.util.*;
import processing.core.*;

public class Manuel2 implements SceneInterface{

  //Variables
  private MasterFile p;
    
    //Integers
    
    //Floats
    
    
  //ArrayLists
  private ArrayList<Label> labels;
    

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
        p.text("Opening Chests & Satchels", p.width/2+100, p.height/2);
      
        p.textSize(30);
        p.fill(235, 199, 99);
        p.text("Good Luck & Have Fun!", p.width/2+100, p.height/2+350);
            
            //Bodytext

      
      
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
  }


  public void handleMouseClicked(){
      
    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
        p.changeScene(labels.get(0).getTargetScene(2));
    }
  }
    
  public void handleMouseDragged(){
      
  }

  public void handleMouseReleased(){
      
  }
    
  public void handleKeyPressed(){
      
  }
}
