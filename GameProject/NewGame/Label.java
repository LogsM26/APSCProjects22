

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

      //Strings
      private String s;



  public Label(PApplet p, int x, int y, int width, int height, String s){

    this.p = p;

    this.x = x;
    this.y = y;

    this.width = width;
    this.height = height;

    this.s = s;

  }



  public void display(){
    //shape then text
    p.rect(x, y, width, height);
    p.text(s, x, y);

    /*
    p.textSize(75);
    p.fill(235, 198, 99);
    p.textFont(liquid);
    p.text("Hunt for Stars", p.width/20, p.height/6+75);
    */
  }


}
