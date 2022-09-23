

public class IsVampire{



  public static boolean isVampire(float hour, boolean awake){

    //normal waking and sleeping hours
    if(hour > 6 && hour < 22 && awake == true || hour < 6 && hour > 22 && awake == false){
      return false;

    //vampire time
    }else if(hour < 6 && hour > 22 && awake == true || hour > 6 && hour < 22 && awake == false){
      return true;
    }

  }



  public static void testIsVampire(float hour, boolean awake, boolean wanted){

    boolean result = isVampire(hour, awake);

    System.out.print("hour: " + hour + "awake: " + awake + "wanted: " + wanted + "result: " + result);

    if(result == wanted){
      System.out.println("ok");
    }else{
      System.out.println("yay we failed");
    }
  }



  public static void main(String[] args){

    testIsVampire(5, 23, true);
    testIsVampire(7, 12, false);
    testIsVampire(2, 3, true);
    testIsVampire(13, 14, false);
  }

}
