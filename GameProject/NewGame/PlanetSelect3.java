

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

    //Fonts
    PFont liquid;



  public PlanetSelect3(MasterFile p, PImage p1, PImage p2, PImage p3, PFont liquid){

    //Variables
    this.p = p;

    //Images
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;

    //Fonts
    this.liquid = liquid;


    labels = new ArrayList<Label>();
    labels.add(new Label(p, 30, 830, 100, 40, "Return"));
    //      p.image(p1, p.width/2+25, p.height/2-125);
    labels.add(new Label(p, p.width/2+125, 400, 375, 375, ""));
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


    //Text
    p.textFont(liquid);
    p.textSize(30);
    p.fill(103, 209, 214);

      //Planet 1
      p.text("Levels", p.width/2+260, p.height/2-100);
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
        p.changeScene(labels.get(1).getTargetScene(3));
      }

  }
}
