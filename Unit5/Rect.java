

public class Rect{



  public Rect(double bIn, double hIn){

    b = bIn;
    h = hIn;
  }



  public double areaRect(){

    return b * h;
  }

  public double perimRect(){

    return b + b + h + h;
  }

  public double lengthRect(){

    return Math.sqrt(b*b + h*h);
  }



  private double b;
  private double h;
}
