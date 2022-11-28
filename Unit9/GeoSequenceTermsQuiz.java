

import java.util.*;


public class GeoSequenceTermsQuiz{



  public static ArrayList<Double> geoSequence(int n){

    ArrayList<Double> values = new ArrayList<Double>();

    double value = 1;


    for(int i = 0; i < n; i++){

      value*=0.5;
      values.add(value);

    }

    return values;
  }



  public static void main(String[] args){
    System.out.println(geoSequence(4));
  }
}
