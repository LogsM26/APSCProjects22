

import processing.core.*;


public class AnimatedCode extends PApplet{




  private int x, y;
  private int vx, vy;

  private int sphere;


  public AnimatedCode(PApplet PAppletIn, int xIn, int yIn, int vxIn, int vyIn, int sphereIn){

    PApplet = PAppletIn;

    x = xIn;
    y = yIn;

    vx = vxIn;
    vy = vyIn;

    sphere = sphereIn;
  }




  public void settings(){

    size(600, 600);
  }

  public void setup(){

    sphere = width/2;

    x = width/2;
    y = height/2;

    vx = 3;
    vy = 2;
  }

  public void draw(){

    x = x + vx;
    y = y + vy;

    sphere = sphere + vx;
  }




  public void checkEdges(){

    if(x > width || x < 0){
      vx = vx * -1;
    }else if(y > height || y < 0){
      vy = vy * -1;
    }else if(sphere > width || sphere < 0){
      vx = vx * -1;
    }
  }

  public void display(){

    ellipse(x, y, 10, 10);
  }




  public static void main(String[] args){

    PApplet.main("AnimatedCode");
  }
}
