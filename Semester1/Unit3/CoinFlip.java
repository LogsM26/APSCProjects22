

import java.lang.Math;

public class CoinFlip{



  public static String coinFlip(){

    int c = (int)(Math.random() * 20 + 1);

    if(c > 10){
      return "Heads";
    }else{
      return "Tails";
    }
  }



  public static void main(String[] args){

    for(int i = 0; i < 20; i++){
      System.out.println(coinFlip());
    }
  }

}
