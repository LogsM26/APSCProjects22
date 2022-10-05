

public class StringSplosion{



  public static String stringSplosion(String str){

    String result = "";

    for(int i = 0; i < str.length(); i++){

      //if it's less than the full word it'll keep printing
      //going onto the next index until its as long as the first length
      result = result + str.substring(0, i+1);
    }

    return result;
  }



  public static void testStringSplosion(String str, String wanted){

    String result = stringSplosion(str);

    System.out.print(" str: " + str + " wanted: " + wanted + " result: " + result);

    if(result.equals(wanted)){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    testStringSplosion("Code", "CCoCodCode");
    testStringSplosion("abc", "aababc");
    testStringSplosion("ab", "aab");
  }
}
