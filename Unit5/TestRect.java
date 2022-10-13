

public class TestRect{

  //area
  //perimeter
  //diagonal length
  //Rect one, double b, double h, double wantedArea, double wantedPerim, double wantedLength


  public static void testRect(Rect one, double wantedArea, double wantedPerim, double wantedLength){


    double result1 = one.areaRect();
    double result2 = one.perimRect();
    double result3 = one.lengthRect();

    //" b: " + b + " h: " + h + " wantedArea: " + wantedArea + " wantedPerim: " +
    //wantedPerim + " wantedLength: " + wantedLength + " resultArea: " + resultArea +
    //" resultPerim: " + resultPerim + " resultLength: " + resultLength

    System.out.print(" area: " + result1 +
                    " perim: " + result2 + " length: " + result3);



    if((Math.abs(result1 - wantedArea) < 0.001) && (Math.abs(result2 - wantedPerim) < 0.001) && (Math.abs(result3 - wantedLength) < 0.001)){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }

  }




  public static void main(String[] args){

    Rect r1 = new Rect(5, 15);
    Rect r2 = new Rect(60, 373);
    Rect r3 = new Rect(2, 1);

    //r1.areaRect();
    //r2.perimRect();
    //r3.lengthRect();


    testRect(r1, 75, 40, 15.8113883008);
    testRect(r2, 22380, 866, 377.79491);
    testRect(r3, 2, 6, 2.2360);

  }
}
