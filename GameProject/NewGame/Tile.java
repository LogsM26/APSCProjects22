

import java.util.*;
import processing.core.*;

public class Tile{
    
    
    //Variables
    private PApplet p;
    
        //Integers
        public float x;
        public float y;

        private float width;
        private float height;
        
        //Floats
        private float a = 0;
        
    
    
    
    public Tile(PApplet p, float x, float y, float width, float height){
        
        this.p = p;
        
        this.x = x;
        this.y = y;
        
        this.width = width;
        this.height = height;
    }
    
    public float getTX() {return x;}
    public float getTY() {return y;}
    
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
    
    
    //Character and Mouse
    public boolean isInsideTile(float a, float b){
        
        
        if( (x-width/2 < a && a < x+width/2) 
            && (y-height/2 < b && b < y+height/2) ){
            return true;
        }else{
            return false;
        }
    }
    
    public void setPositionTile(float o, float t){
        
        x = o;
        y = t;
    }
    
    
    public void isOutsideCharacter(){
        
        //Character Touches the border: velocity = 0
    }
    
    
    
    //Visual Stuff
    //REGULAR TEST
    public void display(){
        
        p.noStroke();
        p.fill(103, 209, 214);
        
        
        p.pushMatrix();
        
        p.translate(x, y);
        
        p.rotate(a);
        p.rectMode(p.CENTER);
        p.rect(0, 0, width, height);
        
        p.fill(209, 73, 19);
        p.rect(0, 0, width, height/2);
        
        p.popMatrix();
    }
    
    //STRAIGHT PATH
    public void displaySP(){
        
        p.noStroke();
        p.fill(159, 168, 98);
        
        p.pushMatrix();
        p.translate(x, y);
        p.rotate(a);
        p.rectMode(p.CENTER);
        
        p.rect(0, 0, width, height);
        
        p.fill(173, 110, 59);
        p.rect(0, 0, width, height/4);
        
        p.popMatrix();

    }
    
    //TURN
    public void displayT(){
        
        p.noStroke();
        p.fill(159, 168, 98);
        
        p.pushMatrix();
        p.translate(x, y);
        p.rotate(a);
        p.rectMode(p.CENTER);
        
        p.rect(0, 0, width, height);
        
        p.fill(173, 110, 59);
        p.translate(x-10, y+10);
        //p.rectMode(p.CORNER);
        p.rect(0, 0, 100, 100);
        //p.rect(0, 0, width/2, height/2);
        
        p.popMatrix();
    }
    
    //CROSS
    public void displayC(){
        
        p.noStroke();
        p.fill(159, 168, 98);
        
        p.pushMatrix();
        p.translate(x, y);
        p.rotate(a);
        p.rectMode(p.CENTER);
        
        p.rect(0, 0, width, height);
        
        p.fill(173, 110, 59);
        p.rect(0, 0, width, height/4);
        p.rect(0, 0, width/4, height);
        
        p.popMatrix();
    }
    
    //GRASS
    public void displayG(){
        
        p.noStroke();
        p.fill(159, 168, 98);
        
        p.pushMatrix();
        p.translate(x, y);
        p.rotate(a);
        p.rectMode(p.CENTER);
        
        p.rect(0, 0, width, height);
        
        p.popMatrix();
    }
    
    //WATER
    public void displayW(){
        
        p.noStroke();
        p.fill(101, 207, 202);
        
        p.pushMatrix();
        p.translate(x, y);
        p.rotate(a);
        p.rectMode(p.CENTER);
        
        p.rect(0, 0, width, height);
        
        p.popMatrix();
    }
    
    
    
    //Mouse Stuff
    public void keyPressedTile(){
        
        //p.pushMatrix();
        
        if(p.keyCode == p.RIGHT){
            a += p.PI/2;
            //System.out.println("irght");
        }else{
            a += 0;
        }
        
    }
    
    /*
    public void mouseClickedTile(){

        //a += p.PI/2;
        x = p.mouseX;
        y = p.mouseY;
        //return true;
    }
    
    public void mouseDraggedTile(){
      
        //center to the square in the grid
        //change to snap
        //has to relase at some point
        x = p.mouseX;
        y = p.mouseY;
    }
    
    public void mouseReleasedTile(){
        
    }
    */

    
}