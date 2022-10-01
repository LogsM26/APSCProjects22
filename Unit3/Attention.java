

public class Attention{


  public static boolean attention(String h){

    if(h.substring(0,8) == "Hey you!"){
      return true;
    }else{
      return false;
    }
  }


  public static void testAttention(String h, boolean wanted){

    boolean result = attention(h);

    System.out.print("h: " + h + " wanted: " + wanted + " result: " + result);

    if(result == wanted){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }

  public static void main(String[] args){

    testAttention("Hello, my name is Inigo Montoya", false);
    testAttention("Excuse me, Dr. Kessner?", false);
    testAttention("Hey you! Give me a hug!", true);

  }
}
