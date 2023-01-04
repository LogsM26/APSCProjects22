

public class CountOccurr{



  public static int countOccurr(String str, String r){

    int x = 0;

    for(int i = 0; i < str.length()-r.length()+1; i++){

      String o = str.substring(i, i+r.length());

      if(o.equals(r)){
        x = x + 1;
      }
    }

    return x;
  }



  public static void testCountOccurr(String str, String r, int wanted){

    int resultT = countOccurr(str, r);

    System.out.print(" str: " + str + " r: " + r + " wanted: " + wanted + " result: " + resultT);

    if(resultT == wanted){
      System.out.println(" W");
    }else{
      System.out.println(" L");
    }
  }



  public static void main(String[] args){

    testCountOccurr("Mississippi", "iss", 2);
    testCountOccurr("bananananan", "an", 5);
    testCountOccurr("rootrootrootroot", "root", 4);
    testCountOccurr("bbgsjbbsjbskbb", "bb", 3);
  }
}
