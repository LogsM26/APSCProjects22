

import java.util.*;
import processing.core.*;

public class Tile{
    
    
    //Variables
    private PApplet p;
    
        //Integers
        private int x;
        private int y;

        private int width;
        private int height;
        
        //Floats
        private float a = 0;
        
    
    
    
    public Tile(PApplet p, int x, int y, int width, int height){
        
        this.p = p;
        
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    
    
    //Things Needed
        //Rect
        //Shapes on Top
            //have IsInside/Boundaries for Character
            //edges are "open"
        //Rotate EVERYTHING Function
            //Key Pressed
        //Moving
            //MouseClicked and Not
        //Randomize
            //each tile has a number
            //different for each level
    
    
    //Visual Stuff
    public void display(){
        
        p.noStroke();
        p.fill(103, 209, 214);
        
        
        p.pushMatrix();
        
        p.translate(x, y);
        
        p.rotate(a);
        p.rectMode(p.CENTER);
        p.rect(x*0, y*0, width, height);
        
        p.fill(209, 73, 19);
        p.rect(0, 0, width, height/2);
        
        p.popMatrix();
    }
    
    
    
    //Character and Mouse
    public void isOutside(){
        
        //Character Touches the border: velocity = 0
    }
    
    public boolean isInsideTile(float a, float b){
        
        if( (x < a && a < x+width) && (y < b && b < y+height) ){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    public void keyPressed(){
        
        //p.pushMatrix();
        
        if(p.keyCode == p.RIGHT){
            a += p.PI/2;
            //System.out.println("irght");
        }else{
            a += 0;
        }
        
    }
    
    public void mouseClicked(){

        //a += p.PI/2;
    }
    
    public void mouseDragged(){
      
        //center to the square in the grid
        //change to snap
        //has to relase at some point
        x = p.mouseX;
        y = p.mouseY;
    }

    
}