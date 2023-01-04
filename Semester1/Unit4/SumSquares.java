

public class SumSquares{



  public static int sumSquares(int a){

    int result = 0;

    for(int i = 0; i <= a; i++){

      result = result + i*i;
    }

    return result;
  }



  public static void testSumSquares(int a, int wanted){

    int result = sumSquares(a);

    System.out.print(" a: " + a + " wanted: " + wanted + " result: " + result);

    if(result == wanted){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    testSumSquares(1, 1);
    testSumSquares(2, 5);
    testSumSquares(3, 14);
    testSumSquares(4, 30);
    testSumSquares(5, 55);
  }
}
