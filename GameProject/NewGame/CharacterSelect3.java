

import java.util.*;
import processing.core.*;

public class CharacterSelect3 implements SceneInterface{
    
    
    //Variables
    private MasterFile p;

    //ArrayLists
    ArrayList<Label> labels;


    //Fun Stuff/Aesthetics
        //Images
        PImage face

        //Fonts
        PFont liquid;



  public CharacterSelect3(MasterFile p, PFont liquid, PImage face){

    //Variables
    this.p = p;

    //Images
    this.face = face;

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
    face = p.loadImage("faceyouloz.png");
    face.resize(200, 200);
    p.image(face, p.width/6, p.height/8);
    
    

    //Text
    p.textFont(liquid);
        
        //Heading
        p.textSize(75);
        p.fill(209, 73, 19);
        p.text("Character Overview and Fun Facts", p.with/2, height/8);
      
        //Body Text
        p.textSize(50);
        p.fill(103, 209, 214);
        p.text("The only current Character is", p.width/2, height/6);
        p.text("LINK from The Legend of Zelda: The Minish Cap", p.width/2, height/6-50);
    
        p.text("Movement is described in the Manuel", p.width/2, p.height/6-125);
        p.text("But you can use keys WASD", p.width/2, p.height/6-175);



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
     
  }
    
  public void handleKeyReleased(){
    
  }
    
}