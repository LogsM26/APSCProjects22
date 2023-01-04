

public class GoodDeal{



  public static boolean goodDeal(double originalPrice, double salePrice){

    if(salePrice < (originalPrice*=0.75)){
      return true;
    }else{
      return false;
    }

  }


  public static void testGoodDeal(double originalPrice, double salePrice, boolean wanted){

    boolean result = goodDeal(originalPrice, salePrice);

    System.out.print("originalPrice: " + originalPrice + "salePrice: " + salePrice
                    + "wanted: " + wanted + "result: " + result);

    if(result == wanted){
      System.out.println("W");
    }else{
      System.out.println("L");
    }

  }



  public static void main(String[] args){

    testGoodDeal(100, 74, true);
    testGoodDeal(25, 24, false);
    testGoodDeal(50, 37.4, true);

  }
}
