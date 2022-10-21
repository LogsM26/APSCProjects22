

import processing.core.*;


public class SnowClass{


  private PApplet p;

  private PVector position;
  private PVector v;

  private float radius;



  public SnowClass(PApplet p, PVector position, PVector v, float radius){

    this.p = p;

    this.position = position;
    this.v = v;

    this.radius = radius;
  }



  public void display(){

    p.fill(255, 255, 255);
    p.ellipse(position.x, position.y, radius*2, radius*2);

    position.add(v);


    if(position.y < 600){

      position.y = 0;
    }
  }

}
