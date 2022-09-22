

public class IcyHot{



  //TEST
  public static void testIcyHot(int t1, int t2, boolean wanted){

    boolean result = icyHot(t1, t2);

    System.out.print("t1: " + t1 + "t2: " + t2
                      + "wanted: " + wanted + "result: " + result);


    if(result == wanted){
      System.out.println("Woop Woop!!!");
    }else{
      System.out.println("Bruh");
    }

  }



  //RETURN TRUE or FALSE
  public static boolean icyHot(int t1, int t2){

    if(t1 < 0 && t2 > 100){
      return true;
    }else if(t1 > 100 && t2 < 0){
      return true;
    }else{
      return false;
    }
  }



  //MAIN
  public static void main(String[] args){

    testIcyHot(120, -1, true);
    testIcyHot(-1, 120, true);
    testIcyHot(2, 120, false);
  }

}
