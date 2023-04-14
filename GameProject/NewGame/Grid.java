

import java.util.*;
import processing.core.*;

public class Grid{
    
    //ArrayList of rectangles
    //each translated to rectMode(CENTER)
    //closest to center is where it fixes    
    
    //Variables
    private PApplet p;
    
        //Integers
        private float x;
        private float y;
    
        private float width;
        private float height;
        
        //private color c;
    
    
    
    public Grid(PApplet p, float x, float y, float width, float height /*, color c*/){
        
        this.p = p;
        
        this.x = x;
        this.y = y;
        
        this.width = width;
        this.height = height;
        
        //this.c = c;
    }
    
    public float getCX() {return x;}
    public float getCY() {return y;}
    
    /*public void drawGrid(int i, int j){
        //draw using 2D Array
        //each box displays itself with own position
    */
    
    public boolean isInsideGrid(float a, float b){
        
        
        if( (x-width/2 < a && a < x+width/2) 
            && (y-height/2 < b && b < y+height/2) ){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    public void display(){
        
        //p.translate(100, 100);
        p.rectMode(p.CENTER);
        p.strokeWeight(2);
        p.stroke(255, 255, 255);
        p.fill(22, 52, 79);
        p.rect(x, y, width, height);
        
    }
    
}