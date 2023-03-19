

import java.util.*;
import processing.core.*;

public class GamePlay5 implements SceneInterface{
    
    
    //Variables
    private MasterFile p;
        //Integers
        int a = 580;
        int d = 425;

    //Array
        //ArrayLists
        ArrayList<Label> labels;
        ArrayList<Tile> tiles;
            private Tile active = null;
        ArrayList<Grid> grids;
        
        //2DArrays
        //int[][] cells = new int[n][n];


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
    tiles.add(new Tile(p, 0, 0, 140, 140));
    //tiles.add(new Tile(p, 0, 0, 100, 50));
      
    grids = new ArrayList<Grid>();
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
    //call grid function
    
    /*
    p.pushMatrix();
    p.translate(100, 100);
      
    
    //i is the x-axis
    for(int i = 0; i < n; i+=75){
            
        //j is the y-axis
        for(int j = 0; j < n; j+=75){
            
            //draw a line down from first i value
            //draw a line left from first j value
            //p.strokeWeight(8);
            //p.stroke(255, 255, 255);
            
            
            //down, x-axis
            p.line(i+i, 0, i+i, 750);
            //labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
            //p.rect(i, j, i, j);
            grids.add(new Grid(p, i+i, i+i, 140, 140));
            
            //across, y-axis
            p.line(0, j+j, 1050, j+j);
            grids.add(new Grid(p, j+j, j+j, 140, 140));
            
            
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
    */
    
    //p.pushMatrix();
    //p.translate(50, 50);
      
    for(int i = 50; i < a; i+=65){
        for(int j = 50; j < d; j+=65){
            
            //down, x-axis
            grids.add(new Grid(p, i+i, j+j, 140, 140));
            
            //across, y-axis
            //grids.add(new Grid(p, i, j, 140, 140));
        }
    }
    //p.popMatrix();
    
      
    
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

    
    //p.pushMatrix();
    for(Grid grid : grids){
        grid.display();
    }
    //p.popMatrix();
      
      
    for(Label label : labels){
      p.fill(209, 73, 19);
      label.display();
    }
      
      
    p.pushMatrix();
    for(Tile tile : tiles){
        tile.display();
        
        if(tile.isInsideTile(p.mouseX, p.mouseY) == true){
            //handleMouseDragged();
        }else{
            //handleMouseReleased();
        }
    }
    p.popMatrix();
      
      
    
  }
    
    

    
  public void handleMouseClicked(){
      
    //System.out.println(

    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
      p.changeScene(labels.get(0).getTargetScene(4));
    }
    
      
    //Tile Stuff
    active = null;
    for(Tile tile : tiles){
        
        if(tile.isInsideTile(p.mouseX, p.mouseY) == true){
            active = tile;
        }
    }

  }
    
  public void handleMouseDragged(){
      
      System.out.println("Dragging");
      
      for(Tile tile : tiles){
          
          if(active != null){
              tile.x = p.mouseX;
              tile.y = p.mouseY;
              System.out.println("Not Null");
          }
      }
  }

  public void handleMouseReleased(){
      
        active = null;
        System.out.println("Null");
  }
    
  public void handleKeyPressed(){
      
    //use mouse to decide which one rotate
    //if insde call keyPressed
    for(Tile tile : tiles){
        
        if(tile.isInsideTile(p.mouseX, p.mouseY) == true){
            tile.keyPressedTile();
            //tile.mouseClicked();
        }
    }
  }
   
    
}