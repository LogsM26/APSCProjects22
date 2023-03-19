

import java.util.*;
import processing.core.*;

public class Grid{
    
    //ArrayList of rectangles
    //each translated to rectMode(CENTER)
    //closest to center is where it fixes    
    
    //Variables
    private PApplet p;
    
        //Integers
        private int x;
        private int y;
    
        private int width;
        private int height;
        
        //private color c;
    
    
    
    public Grid(PApplet p, int x, int y, int width, int height /*, color c*/){
        
        this.p = p;
        
        this.x = x;
        this.y = y;
        
        this.width = width;
        this.height = height;
        
        //this.c = c;
    }
    
    //public int getCenter() {return ;}
    
    public void drawGrid(int i, int j){
        
    }
    
    public void display(){
        
        //p.translate(100, 100);
        
        p.strokeWeight(2);
        p.stroke(255, 255, 255);
        p.fill(22, 52, 79);
        p.rect(x, y, width, height);
    }
}