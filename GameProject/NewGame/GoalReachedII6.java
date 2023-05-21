

import java.util.*;
import processing.core.*;
import java.lang.Math.*;

public class GoalReachedII6 implements SceneInterface{
    
    //Variables
    private MasterFile p;
    
        //Integers
        //public int level = 1; from Level Select
        //private int subScene = 0;
    
        //Floats
        float x;
        float y;
    
        float width;
        float height;
    
        //Strings
    
        
    //Arrays
        //ArrayLists
        ArrayList<Label> labels;
        
    
    //Fun Stuff/Aesthetics
        //Images
        PImage star;
        
        //Fonts
        PFont liquid;
    
    
    
    public GoalReachedII6(MasterFile p, PFont liquid, PImage star){
        
        this.p = p;
        
        //Fonts
        this.liquid = liquid;
        
        //Images
        this.star = star;
        
        
        //ArrayList
        labels = new ArrayList<Label>();
        labels.add(new Label(p, p.width/15, p.height-p.height/8, p.width/6, p.height/18, "Return to Stars"));
        labels.add(new Label(p, p.width/15, p.height-p.height/8+50, p.width/4, p.height/18, "Return to Constellations"));
    }
    
    
    
    //set substate
    public void display(){
        
        drawGoalReachedII6();
    }
    
    /*
    public void drawGoalReachedII6(){
        
        liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);
        p.textFont(liquid);
        
        //Images
        star = p.loadImage("starFragment.png");
        star.resize(300, 300);
        p.image(star, p.width/4, p.height/3);
        
        
        //Text
        //Overall Heading
        p.textSize(75);
        p.fill(235, 198, 99);
        p.text("Congratulations!", p.width/15, p.height/9);
        
        //Heading
        p.textSize(65);
        p.fill(235, 198, 99);
        p.text("You collected a Star Fragment from Puppis!", p.width/15, p.height/9-50);
        
            //Subheadings
            p.textSize(45);
            p.fill(209, 73, 19);
            p.text("What is Puppis?", p.width/2, p.height/8);
                p.text("Puppis is the Constellation representing the", p.width/2, p.height/8+50);
                p.text("Stern/Back of Ship with the Engine of Argo Navis, the Larger Constellation", p.width/2, p.height/8+100);
                p.text("that represents the ship Argo used by Jason and the       Argonauts", p.width/2, p.height/8+150);
                p.text("to find the Golden Fleece in Greek Mythology", p.width/2, p.height/8+200);
            p.text("Who Named it?", p.width/2, p.height/5);
                p.text("Nicolas Louis de Lacaille in 1763", p.width/2, p.height/5+50);
                p.text("a French astronomer, after breaking up the too large Argo Navis into Three Parts", p.width/2, p.height/5+100);
            p.text("Why this name?", p.width/2, p.height/2+100);
                p.text("Puppis actually means 'Poop Deack' in Latin", p.width/2, p.height/2+150);
                p.text("and the standard word for Ship", p.width/2, p.height/2+200);
                p.text("but mostly to refer to the Rear, which is the Poop Deck", p.width/2, p.height/2+250);
        
            //Body Text
            p.textSize(25);
            p.fill(103, 209, 214);
        
        
        
        for(Label l : labels){
            l.display();
        }
    }
    */

    public void drawGoalReachedII6(){
        
        liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);
        p.textFont(liquid);
        
         p.background(5, 21, 33);
        
        //Images
        star = p.loadImage("starFragment.png");
        star.resize(500, 500);
        p.image(star, p.width/12, p.height/3-50);
        
        
        //Text
        //Overall Heading
        p.textSize(75);
        p.fill(235, 198, 99);
        p.text("Congratulations!", p.width/15, p.height/9+50);
        
        //Heading
        p.textSize(65);
        p.fill(235, 198, 99);
        p.text("You collected a Star Fragment from Carina!", p.width/15, p.height/9-50);
        
            //Subheadings
            p.textSize(45);
            p.fill(209, 73, 19);
            p.text("What is Carina?", p.width/2, p.height/8+125);
                p.textSize(20);
                p.text("Carina is the Constellation representing the", p.width/2, p.height/8+175);
                p.text("Keel/Structal Middle Beam from Bow-Stern of Argo Navis,",p.width/2, p.height/8+225);
                p.text("the Larger Constellation", p.width/2, p.height/8+275);
                p.text("that represents the ship Argo used by Jason and the Argonauts", p.width/2, p.height/8+325);
                p.text("to find the Golden Fleece in Greek Mythology", p.width/2, p.height/8+375);
            p.textSize(45);
            p.text("Who Named it?", p.width/2, p.height/5+365);
                p.textSize(20);
                p.text("Nicolas Louis de Lacaille in 1763", p.width/2, p.height/5+415);
                p.text("a French astronomer, after breaking up the too large", p.width/2, p.height/5+465);
                p.text("Argo Navis into Three Parts", p.width/2, p.height/5+515);
            p.textSize(45);
            p.text("Why this name?", p.width/2, p.height/2+300);
                p.textSize(20);
                p.text("Carina means Keel in Latin", p.width/2, p.height/2+350);
                p.text("or the bottom part of a ship", p.width/2, p.height/2+400);
        
            //Body Text
            p.textSize(25);
            p.fill(103, 209, 214);
        
        
        
        for(Label l : labels){
            l.display();
        }
    }
    
    /*
    public void displayIII(){
        
        liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);
        p.textFont(liquid);
        
        //Images
        star = p.loadImage("starFragment.png");
        star.resize(300, 300);
        p.image(star, p.width/4, p.height/3);
        
        
        //Text
        //Overall Heading
        p.textSize(75);
        p.fill(235, 198, 99);
        p.text("Congratulations!", p.width/15, p.height/9);
        
        //Heading
        p.textSize(65);
        p.fill(235, 198, 99);
        p.text("You collected a Star Fragment from Vela!", p.width/15, p.height/9-50);
        
            //Subheadings
            p.textSize(45);
            p.fill(209, 73, 19);
            p.text("What is Vela?", p.width/2, p.height/8);
                p.text("Vela is the Constellation representing the", p.width/2,   p.height/8+50);
                p.text("Sails of Argo Navis, the Larger Constellation",           p.width/2, p.height/8+100);
                p.text("that represents the ship Argo used by Jason and the       Argonauts", p.width/2, p.height/8+150);
                p.text("to find the Golden Fleece in Greek Mythology", p.width/2, p.height/8+200);
            p.text("Who Named it?", p.width/2, p.height/5);
                p.text("Nicolas Louis de Lacaille in 1763", p.width/2, p.height/5+50);
                p.text("a French astronomer, after breaking up the too large Argo Navis into Three Parts", p.width/2, p.height/5+100);
            p.text("Why this name?", p.width/2, p.height/2+100);
                p.text("Vela is Latin for 'Sails of the Ship'", p.width/2, p.height/2+150);
        
            //Body Text
            p.textSize(25);
            p.fill(103, 209, 214);
        
        
        
        for(Label l : labels){
            l.display();
        }
    }
    */
    
    
    /*
    public void display(){
        
        //How to make the Reached Boolean/Int Variable
        //Correspond with each Level and not just One
        
        
        if( (p.getLevel() == 0) && (.getGoalRI() == true) ){
            drawGoalReachedI();
        }else if( (p.getLevel() == 1) && (.getGoalRII() == true) ){
            drawGoalReachedII();
        }else if( (p.getLevel() == 2) && (.getGoalRIII() == true) ){
            drawGoalReachedIII();
        }
        
        
        
        
        for(Label l : labels){
            l.display();
        }
    }
    */
    
    
    
    
    
    public void handleMouseClicked(){
        
        if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
            p.changeScene(labels.get(0).getTargetScene(4));
            
        }else if(labels.get(1).isInside(p.mouseX, p.mouseY) == true){
            p.changeScene(labels.get(1).getTargetScene(2));
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