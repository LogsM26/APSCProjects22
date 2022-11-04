

public class CountLucky{



  //multiple of 7
  //ends in 7
  //increase count by 1

  public static int count7(int[] values){

    int count = 0;

    for(int value : values){

      if((value%7 == 0) || (value%10 == 7)){
        count++;
      }
    }

    return count;
  }



  public static void testCount7(int[] values, int expected){

    int result = count7(values);


    //print the array's values
    System.out.print("values: ");

    for(int value : values){
      System.out.print(value + " ");
    }

    //print expected and result
    System.out.println("expected: " + expected + " result: " + result);


    //if statement
    if(expected == result){
      System.out.println("W");
    }else{
      System.out.println("L");
    }

  }



  public static void main(String[] args){

    //create new values to make each value for the array
    int[] values = new int[3];
    values[0] = 7;
    values[1] = 14;
    values[2] = 21;

    int[] values1 = new int[3];
    values1[0] = 37;
    values1[1] = 2;
    values1[2] = 9;


    testCount7(values, 3);
    testCount7(values1, 1);
  }
}
