

import java.util.*;
import processing.core.*;

public class Star{
    
    
    //Variables
    private PApplet p;
    
        //Integers
        
        //Floats
        public float sX;
        public float sY;
    
        public float sW;
        public float sH;
    
        //Strings
    
    
    //Fun Stuff/Aesthetics
        
        //Images
        PImage star;
        

    
    public Star(PApplet p, PImage star, float sX, float sY, float sW, float sH){
        
        this.p = p;
        
        //Images
        this.star = star;
        
        //Variables
        this.sX = sX;
        this.sY = sY;
        
        this.sW = sW;
        this.sH = sH;
        
    }
    
    
    
    
    //Custom Functions
    public boolean isNextStar(float x, float y){
        
        if( (x-sW/2 < x && x < x+sW/2) 
            && (y-sH/2 < y && y < y+sH/2) ){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    //Display Functions
    public void display(){
        
        //Images
        star = p.loadImage("starFragment.png");
        star.resize( (int) sW, (int) sH);
        p.image(star, (int) sX, (int) sY);
    }
}