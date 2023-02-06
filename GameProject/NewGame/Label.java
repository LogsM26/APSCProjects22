

/*
NOTES:

For the buttons, will be a boolean in masterfile

apply to all text or buttons people anything images the works

x, y, width, height, string s (text)
  PApplet reference

display

list of label objects in each file
  each scene has it's own list

call in draw masterFile
*/


import java.util.*;
import processing.core.*;

public class Label{


  //Variables
  private PApplet p;

      //Integers
      private int x;
      private int y;

      private int width;
      private int height;

      private int targetScene;

      //Strings
      private String s;


  public Label(PApplet p, int x, int y, int width, int height, String s /*int c*/){

    this.p = p;

    this.x = x;
    this.y = y;

    this.width = width;
    this.height = height;

    this.s = s;

  //  this.c = c;
  }


        //Colors
        //private int c = p.color(0);



  public int getTargetScene(int targetScene) {return targetScene;}


  public void display(){

    p.textAlign(p.LEFT, p.TOP);
    //shape then text

    //p.fill(34, 42, 24);
    //p.rect(x, y, width, height);
    p.text(s, x, y);

    /*
    if(isInside(p.mouseX, p.mouseY) == true){
      p.fill(0, 0, 255);
    }else{
      p.fill(255);
      //System.out.println("sghv");
    }

    p.text(s, x, y);
    */




    /*
    p.textSize(75);
    p.fill(235, 198, 99);
    p.textFont(liquid);
    p.text("Hunt for Stars", p.width/20, p.height/6+75);
    */
  }


  public boolean isInside(float a, float b){

    if( (x < a && a < x+width) && (y < b && b < y+height) ){
      return true;
    }else{
      return false;
    }

  }


}
