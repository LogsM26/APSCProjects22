

public class StringTimes{



  public static String stringTimes(String str, int n){

    String result = "";

    for(int i = 0; i < n; i++){
      result = result + str;
    }

    return result;
  }



  public static void testStringTimes(String str, int n, String wanted){

    String resultT = stringTimes(str, n);

    System.out.print(" str: " + str + " n: " + n + " wanted: " + wanted + " resultT: " + resultT);

    if(resultT.equals(wanted)){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    testStringTimes("Hi", 2, "HiHi");
    testStringTimes("Hi", 3, "HiHiHi");
    testStringTimes("Boop", 4, "BoopBoopBoopBoop");
  }
}
