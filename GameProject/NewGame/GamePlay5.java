

import java.util.*;
import processing.core.*;

public class GamePlay5 implements SceneInterface{
    
    
    //Variables
    private MasterFile p;
        //Integers
        int n = 600;

    //Array
        //ArrayLists
        ArrayList<Label> labels;
        ArrayList<Tile> tiles;
        
        //2DArrays
        int[][] cells = new int[n][n];


  //Fun Stuff/Aesthetics
    //Images
    

    //Fonts
    PFont liquid;



  public GamePlay5(MasterFile p, PFont liquid){

    //Variables
    this.p = p;

    //Images

    //Fonts
    this.liquid = liquid;

    labels = new ArrayList<Label>();
    //1400, 800 
    //28, 800, 100, 40
    labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
    //labels.add(new Label(p, 28, 800, 100, 40, "Return"));
      
    tiles = new ArrayList<Tile>();
    tiles.add(new Tile(p, 100, 100, 100, 100));
  }





  //Custom Functions
  public void drawGamePlay5(){

    liquid = p.createFont("DkLiquidEmbrace-YBvv.ttf", 75);

    p.background(22, 52, 79);


    //Images


    //Text
    p.textFont(liquid);
    p.textSize(30);
    p.fill(209, 73, 19);
      
      
    
    //2D Array Things
    //Lines as Labels? Or make own isInside for Tiles?
      
    p.pushMatrix();
    p.translate(100, 100);
    
    //i is the x-axis
    for(int i = 0; i < n; i+=75){
            
        //j is the y-axis
        for(int j = 0; j < n; j+=75){
            
            //draw a line down from first i value
            //draw a line left from first j value
            p.strokeWeight(8);
            p.stroke(255, 255, 255);
            
            
            //down, x-axis
            p.line(i+i, 0, i+i, 750);
            //labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
            //p.rect(i, j, i, j);
            
            //across, y-axis
            p.line(0, j+j, 1050, j+j);
            
            
            if(i == j){
                
                //cells[i][j] = 1;
            }
            
            //p.fill(209, 73, 19);
            //p.rect(i, j, i, j);
            
        }
    }
      
    
    for(int[] row : cells){
        
        for(int value : row){
            
        }
    }
    
    p.popMatrix();
    
      
    
    /*
    for(int i = 0; i < 10; i++){
        
        p.strokeWeight(10);
        p.stroke(255);
        p.line(i, 0, p.width, 0);
        
        for(int j = 0; j < 10; j++){
            
            p.strokeWeight(10);
            p.stroke(255);
            p.line(0, j, 0, p.height);
        }
    }
    */
      
      
  }




  //Functions from the Interface
  public void display(){

    //Calling Custom Functions
    drawGamePlay5();

      
    for(Label label : labels){
      label.display();
    }
      
    p.pushMatrix();
    for(Tile tile : tiles){
        tile.display();
    }
    p.popMatrix();
    
    
  }
    
    
  
  public void mouseDragged(){
      
    //center to the square in the grid
    //change to snap
      
      
  }

  public void handleKeyPressed(){

    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
      p.changeScene(labels.get(0).getTargetScene(4));
    }
      
      
    //use mouse to decide which one rotate
    //if insde call keyPressed
    for(Tile tile : tiles){
        
        if(tile.isInsideTile(p.mouseX, p.mouseY) == true){
              tile.keyPressed();
              System.out.println("gshg");
        }
    }
      
  }
    
}