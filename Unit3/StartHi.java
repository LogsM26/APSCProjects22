

public class StartHi{



  public static boolean startHi(String str){

    if(str.length() < 2){
      return false;
    }

    String f2 = str.substring(0,2);

    if(f2.equals("hi")){
      return true;
    }else{
      return false;
    }
  }


  public static boolean testStartHi(String str, boolean wanted){

    boolean result = testStartHi(str, wanted);

    if(wanted == result){
      return true;
    }else{
      return false;
    }
  }


  public static void main(String[] args){

    testStartHi("hi there", true);
    testStartHi("hi", true);
    testStartHi("hello hi", false);
  }
}
