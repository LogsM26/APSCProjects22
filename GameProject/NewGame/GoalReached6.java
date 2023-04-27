

import java.util.*;
import processing.core.*;
import java.lang.Math.*;

public class Goal6 extends MasterFile{
    
    //Variables
    private MasterFile p;
    
        //Integers
    
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
    
    
    
    public GoalReached6(MasterFile p, PFont liquid, PImage star){
        
        this.p = p;
        
        //Fonts
        this.liquid = liquid;
        
        //Images
        this.star = star;
        
        
        //ArrayList
        labels = new ArrayList<Label>();
        labels.add(new Label(p, p.width-200, p.height-200, p.width/6, p.height/18, "Return to Stars"));
        label.add(new Label(p, p.width-200, p.height-275, p.width/4, p.height/18, "Return to Constellations"));
    }
    
    
    
    
    public void drawGoalReachedI(){
        
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
            p.text("Who Names it?", p.width/2, p.height/8+200);
            p.text("Why this name?", p.width/2, p.height/400);
        
            //Body Text
            p.textSize(25);
            p.fill(103, 209, 214);
    }
    
    public void drawGoalReachedII(){
        
        liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);
        p.textFont(liquid);
        
        p.background(31, 57, 112);
        
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
        p.text("You collected a Star Fragment from Carina!", p.width/15, p.height/9-50);
        
            //Subheadings
            p.textSize(45);
            p.fill(209, 73, 19);
            p.text("What is Carina?", p.width/2, p.height/8);
            p.text("Who Names it?", p.width/2, p.height/8+200);
            p.text("Why this name?", p.width/2, p.height/400);
        
            //Body Text
            p.textSize(25);
            p.fill(103, 209, 214);
    }
    
    public void drawGoalReachedIII(){
        
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
            p.text("Who Names it?", p.width/2, p.height/8+200);
            p.text("Why this name?", p.width/2, p.height/400);
        
            //Body Text
            p.textSize(25);
            p.fill(103, 209, 214);
    }
    
    
    public void display(){
        
        //How to make the Reached Boolean/Int Variable
        //Correspond with each Level and not just One
        
        if(){
            drawGoalReachedI();
        }else if(){
            drawGoalReachedII();
        }else if(){
            drawGoalReachedIII();
        }
        
        
        for(Label l : labels){
            l.display();
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
    
    public void handleMouseDragged(){
      
    }

    public void handleMouseReleased(){
      
    }
    
    public void handleKeyPressed(){
      
    }
    
    public void handleKeyReleased(){
    
    }
    
}