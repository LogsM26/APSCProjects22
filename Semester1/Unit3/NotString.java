

public class NotString{



  public static String notString(String str){

    if(str.length() >= 3 && str.substring(0,3).equals("not")){
      return str;
    }

    return "not" + str;
  }



  public static boolean testNotString(String str, boolean wanted){

    boolean result = testNotString(str, wanted);

    System.out.print("str: " + str + "wanted: " + wanted + "result: " + result);

    if(result == wanted){
      return true;
    }else{
      return false;
    }
  }



  public static void main(String[] args){

    testNotString("not candy", true);
    testNotString("x", false);
    testNotString("not bad", true);
  }
}
