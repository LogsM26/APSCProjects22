

class SumofSquaresArray{



  public static double sumSquares(double[] values){

    double sS = 0;

    for(double value : values){

      sS += value * value;
    }

    return sS;
  }



  public static void testSumSquares(double[] values, double expected){

    double result = sumSquares(values);

    System.out.print("values: ");

    for(double value : values){
      System.out.print(value + " ");
    }

    System.out.println("expected: " + expected + " result: " + result);


    if(expected == result){
      System.out.println("W");
    }else{
      System.out.println("L");
    }

  }



  public static void main(String[] args){

    double[] values = new double[3];
    values[0] = 5;
    values[1] = 2;
    values[2] = 9;

    double[] values1 = new double[4];
    values1[0] = 7;
    values1[1] = 78;
    values1[2] = 4;
    values1[3] = 9482;

    testSumSquares(values, 110);
    testSumSquares(values1, 89914473);

  }
}
