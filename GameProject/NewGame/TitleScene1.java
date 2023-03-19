

import java.util.*;
import processing.core.*;

public class TitleScene1 implements SceneInterface{


  //Variables
  private MasterFile p;

    //ArrayLists
    private ArrayList<Label> labels;


  //Fun Stuff/Aesthetics
    //Images
    PImage bridge;

    //Fonts
    PFont liquid;



  public TitleScene1(MasterFile p, PImage bridge, PFont liquid){

    //Variables
    this.p = p;

    //Images
    this.bridge = bridge;

    //Fonts
    this.liquid = liquid;


    labels = new ArrayList<Label>();
    labels.add(new Label(p, 75, 720, 220, 30, "Visit the Stars"));
    //labels.add(new Label(p, 75, 775, 50, 20, "Manual"));
    //labels.add(new Label(p, 75, 825, 50, 20, "Credits"));
  }




  public void drawTitle(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);


    //Images
    bridge = p.loadImage("Bridge.jpg");
    bridge.resize(p.width, p.height);
    //bridge.resize(1400, 800);
    p.background(bridge);
    //image(bridge, 0, 0);


    //Main text
    p.textSize(75);
    p.fill(235, 198, 99);
    p.textFont(liquid);
    p.text("Hunt for Stars", p.width/20, p.height/6+65);
    //50, 175



    //Buttons
    p.textSize(35);
    p.fill(209, 73, 19);
    //p.text("Visit the Stars", p.width/20, p.height-125);
    //50, 500

    //p.textSize(35);
    //p.fill(209, 73, 19);
    //p.text("Manual", p.width/20, p.height-90);
    //50, 525

    //p.textSize(35);
    //p.fill(209, 73, 19);
    //p.text("Credits", p.width/20, p.height-55);
    //50, 550


    //Collison Detection
    //makes it glow
  }




  public ArrayList getLabel(){

    return labels;
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawTitle();


    //go through list of labels
      //for each loop
    for(Label label : labels){
      label.display();
    }

  }


  public void handleMouseClicked(){

    for(Label label : labels){

      if(label.isInside(p.mouseX, p.mouseY) == true){
        p.changeScene(label.getTargetScene(2));
        p.fill(235, 198, 99);
      }

    }
  }
    
  public void handleKeyPressed(){
      
  }

}
