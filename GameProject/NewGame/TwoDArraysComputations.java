

import java.util.*;
import processing.core.*;

public class TwoDArraysComputations{


  public static int smallest(int[][] values){

    int result = values[0][0];

    for(int[] row : values){

      for(int value : row){

        if(value <= result){
          result = value;
        }
      }

    }

    return result;
  }



  public static float sum(float[][] values){

    float result = 0;

    for(float[] row : values){

      for(float value : row){

        result += value;
      }
    }

    return result;
  }



  public static int amountA(String[][] words){

    int amount = 0;

    for(String[] row : words){

      for(String word : row){

        if(word.substring(0, 1).equals("A")){
          amount++;
        }

      }
    }

    return amount;
  }



  public static void main(String[] args){

    int[][] values = { {6, 65, 9}, {73, 38, 29} };
    System.out.println(smallest(values));

    float[][] values2 = { {1, 1, 1}, {2, 2, 2} };
    System.out.println(sum(values2));

    String[][] words = new String[2][2];
    words[0][0] = "A";
    words[0][1] = "Alligator";
    words[1][0] = "Animal";
    words[1][1] = "accelerate";
    System.out.println(amountA(words));
  }
}
