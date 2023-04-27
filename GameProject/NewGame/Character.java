

import java.util.*;
import processing.core.*;

public class Character{
    
    
    //Variables
    private PApplet p;
        
        //Integers
        //Float
        float x;
        float y;
        
        float vx;
        float vy;
    
    //Images
        
        //Character
        PImage face;
        PImage right;
        PImage left;
        PImage front;
    
        PImage current;
        
        
    
    
    public Character(PApplet p, float x, float y, float vx, float vy){
        
        this.p = p;
        
        this.x = x;
        this.y = y;
        
        this.vx = vx;
        this.vy = vy;
        
                

            face = p.loadImage("faceyouloz.png");
            face.resize(50, 50);
            //p.image(front, x, y);
        
            right = p.loadImage("facerightloz.png");
            right.resize(50, 50);
            //p.image(right, x, y);
        
            left = p.loadImage("faceleftloz.png");
            left.resize(50, 50);
            //p.image(left, x, y);
        
            front = p.loadImage("facefrontloz.png");
            front.resize(50, 50);
            //p.image(face, x, y);
        
        current = face;
    }
    
    
    
    
    //Move with WASD
    public void handleKeyPressedChara(){
        
        if(p.key == 'w'){
            
            current = front;
            y -= vy;
            
        }else if(p.key == 'd'){

            current = right;
            x += vx;
            
        }else if(p.key == 'a'){
    
            current = left;
            x -= vx;
            
        }else if(p.key == 's'){

            current = face;
            y += vy;
        }
    }
    
    public void handleKeyReleasedChara(){
        
        vx = 0;
        vy = 0;
    }
    
    
    public void displayChara(ArrayList<Tile> tiles, ArrayList<Tile> tiles2, ArrayList<Tile> tiles3){
        
        p.image(current, x, y);
        
        
        float tempX = x + vx;
        
        for(Tile t : tiles){
            
            if(  (t.isBlockedTile(x, y) == true) || 
                 (t.isOutsideTile((float) x, (float) y)) == true ){
                tempX = 0;
            }else{
                x = tempX;
            }
        }
        
        
        for(Tile t2 : tiles2){
            
            if(  (t2.isBlockedTile(x, y) == true) || 
                 (t2.isOutsideTile((float) x, (float) y)) == true ){
                tempX = 0;
            }else{
                x = tempX;
            }
        }
        
        
        for(Tile t3 : tiles3){
            
            if(  (t3.isBlockedTile(x, y) == true) || 
                 (t3.isOutsideTile((float) x, (float) y)) == true ){
                tempX = 0;
            }else{
                x = tempX;
            }
        }
       
    }
}