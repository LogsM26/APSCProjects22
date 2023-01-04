

import java.util.*;


public class FibSquence{



  public static ArrayList<Integer> genFibSquence(int n){

    ArrayList<Integer> results = new ArrayList<Integer>();

    int a = 1;
    int b = 1;
    int c = 0;

    for(int i = 0; i < n; i++){
        c = a+b;
        a = b;
        b = c;

        results.add(c);
    }

    return results;
  }



  public static void main(String[] args){

    ArrayList<Integer> fibResults = genFibSquence(20);

    System.out.println("fibResults: " + fibResults);
  }
}
