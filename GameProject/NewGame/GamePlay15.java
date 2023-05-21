

import java.util.*;
import processing.core.*;

public class GamePlay15 implements SceneInterface{
    
    
    //Variables
    private MasterFile p;
        //Integers
        int a = 65*9;
        int d = 65*6;
        private int numTiles = 1;
        

    //Arrays
        //ArrayLists
        ArrayList<Label> labels;
        ArrayList<Label> labelsS;
    
        //Tiles
        ArrayList<Tile> tiles;
            private Tile active = null;
        ArrayList<Tile> tiles2;
        ArrayList<Tile> tiles3;
    
        //Grids
        ArrayList<Grid> grids;
        
        //2DArrays
        //int[][] cells = new int[n][n];


  //Fun Stuff/Aesthetics
    //Images
        //Character
        PImage face;
        PImage right;
        PImage left;
        PImage front;
    
        //Goals
        PImage star;
    

    //Fonts
    PFont liquid;
    
 
    //Character
    Character link;
    
    
    //Goals
    //Star star;



  public GamePlay5(MasterFile p, PFont liquid){

    //Variables
    this.p = p;
      
    //Fonts
    this.liquid = liquid;

      
    //ArrayLists
      
        //Labels
        labels = new ArrayList<Label>();
        //1400, 800 
        //28, 800, 100, 40
        labels.add(new Label(p, p.width/50, p.height-p.height/12, p.width/14, p.height/20, "Return"));
        //labels.add(new Label(p, 28, 800, 100, 40, "Return"));
      
        labels2 = new ArrayList<Label>();
        labels2.add(new Label(p, star, p.width/2+200, p.height-200, p.width/16, p.height/15));
      
      
      
        //Tiles
        tiles = new ArrayList<Tile>();
        for(int i = 0; i < numTiles; i++){
            Tile t = new Tile(p, 0, (float) p.width-100, (float) p.height-200, (float) 140, (float) 140);
            tiles.add(t);
        }
      
            //Starting
            tiles2 = new ArrayList<Tile>();

            if(level == 1){
                tiles2.add(new Tile(p, 0, (float) p.width/7+21, (float) p.height/2-90, (float) 140, (float) 140));

            }else if(level == 2){
                tiles2.add(new Tile(p, 0, (float) p.width/2, (float)
                p.height/2, (float) 140, (float) 140));

            }else if(level == 3){
                tiles2.add(new Tile(p, 0, (float) p.width/4, (float) p.height/4, (float) 140, (float) 140));
            }

            //Ending
            tiles3 = new ArrayList<Tile>();

            if(level == 1){
                tiles3.add(new Tile(p, 0, (float) p.width/2, (float) p.height/2, (float) 140, (float) 140));

            }else if(level == 2){
                tiles3.add(new Tile(p, 0, (float) p,width/2, (float) p.height/2, (float) 140, (float) 140));

            }else if(level == 3){
                tiles3.add(new Tiles(p, 0, (float) p.width/4, (float) p.height/4, (float) 140, (float) 140));
            }

      
      
        //Grid
        grids = new ArrayList<Grid>();
      
      
    //Character
    //PApplet p, float x, float y, float vx, float vy, PImage face, PImage right, PImage left, PImage front
    link = new Character(p, p.width/7+21, p.height/2-86, 10, 10);
      
      
    //Goal
    //PApplet p, PImage star, float sX, float sY, float sW, float sH
    //star = new Star(p, star, p.width/2+100, p.height-200, 50, 50);
  }


    

  public void resetGame(){
      
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
      
      //j is scolum
      //i is row
      
    for(int i = 50; i < a; i+=65){
        for(int j = 50; j < d; j+=65){
            
            //down, x-axis
            grids.add(new Grid(p, i+i, j+j, 132, 129));
            
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


//int ce = (int) rcolro(randim(255), )

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
      
    for(Label label : labels2){
        label.displayS();
    }
      
     
    p.pushMatrix();
    for(Tile tile : tiles){
                
        tile.displayT();
        
    }
    p.popMatrix();
      
      
    p.pushMatrix();
    for(Tile tile : tiles2){
        
        tile.displayBP();
    }
    p.popMatrix();
    
    
    p.pushMatrix();
    for(Tile tile : tiles3){
        
        tile.displayEP();
    }
    p.popMatrix();
      
    
      
    //Character
    link.displayChara(tiles, tiles2, tiles3);
      
    //Goal
    //star.display();
    
  }
    
    

    
  public void handleMouseClicked(){
      
    //System.out.println(

    if(labels.get(0).isInside(p.mouseX, p.mouseY) == true){
      p.changeScene(labels.get(0).getTargetScene(4));
    }
      
    if( (labels2.get(0).isInside(p.mouseX, p.mouseY) == true) && 
        (link.isInside(link.getCX(), link.getCY()) == true) ) {
        p.changeScene(labels2.get(0).getTargetScene(6));
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
      
      //System.out.println("Dragging"); 

      if(active != null){
            active.x = p.mouseX;
            active.y = p.mouseY;
            //System.out.println("Not Null");
      }
  }

  public void handleMouseReleased(){
      
        //active postition to target x, y = center of a grid bock  
      
       //System.out.println("Null"); 
      
        
        for(Grid g : grids){

            if( (active != null) && (g.isInsideGrid(p.mouseX, p.mouseY) == true)){
                active.setPositionTile(g.getCX(), g.getCY());
                //active.x = g.getCX();
                //active.y = g.getCY();
                    
                //System.out.println("In");
            } 
        }
      
        active = null;
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
      
    link.handleKeyPressedChara();
  }
    

  public void handleKeyReleased(){
    
      link.handleKeyReleasedChara();
  }
   
    
}