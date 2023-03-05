

import java.util.*;
import processing.core.*;

public class PlanetSelect3 implements SceneInterface{

  //Variables
  private MasterFile p;

    //ArrayLists
    private ArrayList<Label> labels;


  //Fun Stuff/Aesthetics
    //Images
    PImage p1;
    PImage p2;
    PImage p3;
    
    PImage a;

    //Fonts
    PFont liquid;



  public PlanetSelect3(MasterFile p, PImage p1, PImage p2, PImage p3, PImage a, PFont liquid){

    //Variables
    this.p = p;
      

    //Images
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
      
    this.a = a;

      
    //Fonts
    this.liquid = liquid;


    labels = new ArrayList<Label>();
    labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
    //p.image(p1, p.width/2+25, p.height/2-125);
    labels.add(new Label(p, p.width/2+125, 400, 375, 375, ""));
    
    p.pushMatrix();
    p.rotate(p.PI/3);
    labels.add(new Label(p, p.width/4+p.width/50, p.height/2, p.width/8, p.height/24, "Characters"));
    p.popMatrix();
  }



  public void drawPlanetSelect(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);


    p.background(5, 21, 33);

    //Images

      //Planets
      p1 = p.loadImage("P1Earth.png");
      p1.resize(600, 600);
      p.image(p1, p.width/2+25, p.height/2-125);
      //525, 175

      p2 = p.loadImage("P2Mars.png");
      p2.resize(300, 300);
      p.image(p2, p.width/10, p.height/4);
      //100, 150

      p3 = p.loadImage("P3Alge.png");
      p3.resize(200, 200);
      p.image(p3, p.width/2, p.height/20);
      //500, 30
      
      
      //Other Stuff
      a = p.loadImage("a.png");
      a.resize(150, 150);
      p.image(a, p.width/10+p.width/6, p.height/4+p.height/5);


    //Text
    p.textFont(liquid);
    p.textSize(30);
    p.fill(103, 209, 214);

      //Planet 1
      p.text("Constellations", p.width/2+215, p.height/2-100);
      //Planet 2
      //Planet 3

    /*p.textFont(liquid);
    p.textSize(30);
    p.fill(103, 209, 214);
    p.text("Return",  p.width/20-40, p.height-25);
    //25, 575
    */
  }




  //Interface Functions
  public void display(){

    //Calling Custom Functions
    drawPlanetSelect();

    for(Label label : labels){
      label.display();
    }
  }


  public void handleKeyPressed(){

      if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
        p.fill(235, 198, 99);
        p.changeScene(labels.get(0).getTargetScene(0));
          
      }else if(labels.get(1).isInside(p.mouseX, p.mouseY) == true){
        p.fill(235, 198, 99);
        p.changeScene(labels.get(1).getTargetScene(4));
          
      }else if(labels.get(2).isInside(p.mouseX, p.mouseY) == true){
        p.fill(235, 198, 99);
        p.changeScene(labels.get(2).getTargetScene(3));
      }

  }
}
