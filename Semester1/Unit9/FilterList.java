

import java.util.*;


public class FilterList{



  public static ArrayList<Integer> filterList(ArrayList<Integer> scores){

    ArrayList<Integer> result = new ArrayList<Integer>();

    for(int score : scores){

      if(score > 90){
        result.add(score);
      }
    }

    return result;
  }



  public static void main(String[] args){

    ArrayList<Integer> scores = new ArrayList<Integer>();
    scores.add(100);
    scores.add(5);
    scores.add(98);


    ArrayList<Integer> goodScores = filterList(scores);

    System.out.println("goodScores: ");

    for(int score : goodScores){
      System.out.println(score);
    }
  }
}
