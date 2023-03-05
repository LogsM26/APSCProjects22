

import java.util.*;
import processing.core.*;

public class CharacterSelect3 implements SceneInterface{
    
    
    //Variables
    private MasterFile p;

    //ArrayLists
    ArrayList<Label> labels;


    //Fun Stuff/Aesthetics
        //Images

        //Fonts
        PFont liquid;



  public CharacterSelect3(MasterFile p, PFont liquid){

    //Variables
    this.p = p;

    //Images

    //Fonts
    this.liquid = liquid;

    labels = new ArrayList<Label>();
    labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));

  }





  //Custom Functions
  public void drawCharacterSelect3(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);

    p.background(0, 0, 0);


    //Images
    

    //Text



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

  }
 

  public void handleKeyPressed(){

    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
        p.fill(235, 198, 99);
        p.changeScene(labels.get(0).getTargetScene(2));
    }
  }
    
}