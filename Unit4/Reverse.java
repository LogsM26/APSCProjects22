

public class Reverse{



  public static String reverse(String str){

    String result = "";

    //iterate backwards instead of forwards like normal
    //dont get boundary errors and grab the last
    //same but w/-1 and >=0
    for(int i = str.length()-1; i >= 0 ; i--){

      String c = str.substring(i, i+1);

      result = result + c;
    }

    return result;
  }



  public static void testReverse(String str, String wanted){

    String resultT = reverse(str);

    System.out.print(" str: " + str + " wanted: " + wanted + " result: " + resultT);

    if(resultT.equals(wanted)){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    testReverse("bad", "dab");
    testReverse("Hello, world", "dlrow ,olleH");
    testReverse("tacocat", "tacocat");
    testReverse("hum", "muh");
    testReverse("backwards", "sdrawkcab");

    String t = "hello";
    System.out.print(t.substring(3, 5));
  }
}
