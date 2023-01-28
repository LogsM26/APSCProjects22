

import java.util.*;
import processing.core.*;

public class TwoDArrays{


  public static void main(String[] args){

    //setting the size
    int n = 10;

    //2D array
    int[][] cells = new int[n][n];


    //i is the x-axis
    for(int i = 0; i < n; i++){

      //j is the y-axis
      for(int j = 0; j < n; j++){

        //set 10x10 pattern
        //if i+j = 9, cells[i][j] = 1
        if(i+j == 9){
          cells[i][j] = 1;
        }

      }
    }

    //Print It by row
    System.out.println("Cells: ");


    for(int[] row : cells){

      for(int value : row){

        System.out.print(value + " ");
      }

      System.out.println();
    }




    //Second String Array
    String[][] cells2 = new String[2][2];

    cells2[0][0] = "fskjsbf";
    cells2[0][1] = "wertyu";
    cells2[1][0] = "bhisd";
    cells2[1][1] = "ioqhc";


    System.out.println(" ");
    System.out.println("Cells 2: ");

    for(String[] row : cells2){

      for(String value : row){

        System.out.print(value + " ");
      }

      System.out.println();
    }




    //Third Doubles Array Loop Thingy
    int n3 = 5;
    double[][] cells3 = new double[n3][n3];

    for(int i = 0; i < n3; i++){

      for(int j = 0; j < n3; j++){

        //i/y increases by 1
        //j/x increases by 10
        cells3[i][j] = ((i+1)*10)+(j+1);
        //i = 4, j = 1
      }
    }

    System.out.println(" ");
    System.out.println("Cells 3: ");


    for(double[] row : cells3){

      for(double value : row){

        System.out.print(value + " ");
      }

      System.out.println();
    }



    //Fourth Int Array
    int n4 = 5;
    int[][] cells4 = new int[n4+1][n4];

    for(int i = 0; i < n4+1; i++){

      for(int j = 0; j < n4; j++){

        //i = y
        //j = x
          //just +1 no change per colum
          //+1 every row
        cells4[i][j] = (i+1)+(j*0);
      }
    }

    System.out.println(" ");
    System.out.println("Cells 4: ");


    for(int[] row : cells4){

      for(int value : row){

        System.out.print(value + " ");
      }

      System.out.println();
    }


  }

}
