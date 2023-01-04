

import java.util.*;


public class MaxValue{



  public static double findMaxValue(ArrayList<Double> values){

    double result = 0.0;

    for(double value : values){

      if(value > result){
        result = value;
      }
    }

    return result;
  }



  public static void testFindMaxValue(ArrayList<Double> values, double expected){

    double result = findMaxValue(values);

    System.out.print("values: ");


    for(double value : values){
      System.out.println(values + " ");
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
    values.add(1.0);
    values.add(2.1);
    values.add(5.3);

    ArrayList<Double> values2 = new ArrayList<Double>();
    values2.add(0.0);
    values2.add(-35.0);
    values2.add(90.1);


    testFindMaxValue(values, 5.3);
    testFindMaxValue(values2, 90.1);
  }
}
