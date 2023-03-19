

import java.util.*;
import processing.core.*;
import java.lang.Math.*;

public class Plant1SelectLevel4 implements SceneInterface{

  //Variables
  private MasterFile p;

    //ArrayLists
    ArrayList<Label> labels;


  //Fun Stuff/Aesthetics
    //Images
    PImage star;

    //Fonts
    PFont liquid;



  public Plant1SelectLevel4(MasterFile p, PImage star, PFont liquid){

    //Variables
    this.p = p;

    //Images
    this.star = star;

    //Fonts
    this.liquid = liquid;

    labels = new ArrayList<Label>();
    labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
      
    labels.add(new Label(p, p.width/8+100, p.height/2+100, 100, 40, "Puppis I"));
    labels.add(new Label(p, p.width/3+80+100, p.height/2+100, 100, 40, "Vela II"));
    labels.add(new Label(p, p.width/2+p.width/8+p.width/32+100, p.height/2+100, 100, 40, "Carina III"));

  }





  //Custom Functions
  public void drawPlant1Levels(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);

    p.background(0, 0, 0);


    //Images
    star = p.loadImage("starFragment.png");
    star.resize(300, 300);
    p.image(star, p.width/8, p.height/4);
    p.image(star, p.width/3+80, p.height/4);
    p.image(star, p.width/2+p.width/8+p.width/32, p.height/4);

    //Text
    p.textFont(liquid);
    p.textSize(30);
    p.fill(209, 73, 19);



    //Collison Detection
    //makes it glow
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawPlant1Levels();

    for(Label label : labels){
      label.display();
    }

  }


  public void handleMouseClicked(){


    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
        p.fill(235, 198, 99);
        p.changeScene(labels.get(0).getTargetScene(2));
        
    }else if(labels.get(1).isInside(p.mouseX, p.mouseY) == true){
        p.fill(235, 198, 99);
        p.changeScene(labels.get(1).getTargetScene(5));
    }


  }
  
  public void handleKeyPressed(){
      
  }
}
