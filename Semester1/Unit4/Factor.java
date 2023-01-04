

public class Factor{



  public static int factor(int a){

    int result = 1;

    for(int i = 1; i <= a; i++){

      result = result * i;
    }

    return result;
  }



  public static void testFactor(int a, int wanted){

    int resultT = factor(a);

    System.out.print(" a: " + a + " wanted: " + wanted + " result: " + resultT);

    if(resultT == wanted){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    testFactor(0, 1);
    testFactor(1, 1);
    testFactor(2, 2);
    testFactor(3, 6);
    testFactor(4, 24);
    testFactor(5, 120);
    testFactor(6, 720);
    testFactor(7, 5040);
  }
}
