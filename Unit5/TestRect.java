

public class TestRect{

  //area
  //perimeter
  //diagonal length

  public static void testRect(Rect one, double b, double h, double wantedArea,
                                double wantedPerim, double wantedLength){

    double resultArea = one.areaRect(b, h);
    double resultPerim = one.perimRect(b, h);
    double resultLength = one.lengthRect(b, h);

    System.out.print(" b: " + b + " h: " + h + " wantedArea: " + wantedArea + " wantedPerim: " +
                    wantedPerim + " wantedLength: " + wantedLength + " resultArea: " + resultArea +
                    " resultPerim: " + resultPerim + " resultLength: " + resultLength);

    if(resultArea == wantedArea && resultPerim == wantedPerim && resultLength == wantedLength){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }

  }



  public static void main(String[] args){

    Rect r1 = new Rect(5, 15);
    Rect r2 = new Rect(60, 373);
    Rect r3 = new Rect(2, 1);
    Rect r4 = new Rect(8, 5);

    testRect(r1, 75, 40, 26.024, true);
    testRect(r2, 22380, 866, 3601.0000, true);
    testRect(r3, 3393, 183, 383, false);
    testRect(r4, 4, 8, 9, false);
  }
}
