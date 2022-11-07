

import java.util.*;

public class SumOfSquaresAL{



  public static double sumOfSquares(ArrayList<Double> values){

    double sS = 0;

    for(double value : values){

      sS += value * value;
    }

    return sS;
  }



  public static void testSumOfSquares(ArrayList<Double> values, double expected){

    double result = sumOfSquares(values);

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

    ArrayList<Double> values = new ArrayList<Double>();
    values.add(5.0);
    values.add(6.0);
    values.add(8.0);

    ArrayList<Double> values2 = new ArrayList<Double>();
    values2.add(9876.0);
    values2.add(2.0);
    values2.add(9.0);


    testSumOfSquares(values, 125);
    testSumOfSquares(values2, 97535461);
  }
}
