


import java.util.*;


public class TotalZNameLengthAL{



  public static int totalZNameLength(ArrayList<String> words){

    int length = 0;

    for(String word : words){

      if( (word.substring(0, 1).equals("z")) || (word.substring(0, 1).equals("Z")) ){
        length += word.length();
      }
    }

    return length;
  }



  public static void testTotalZNameLength(ArrayList<String> words, int expected){

    int result = totalZNameLength(words);


    System.out.print("words: ");

    for(String word : words){
      System.out.print(word + " ");
    }

    System.out.println("expected: " + expected + " result: " + result);


    if(expected == result){
      System.out.println("W");
    }else{
      System.out.println("L");
    }
  }



  public static void main(String[] args){

    ArrayList<String> words = new ArrayList<String>();
    words.add("Zoreaux");
    words.add("zebra");
    words.add("ihbdh");

    ArrayList<String> words2 = new ArrayList<String>();
    words2.add("rtyu");
    words2.add("z z z z");
    words2.add("z");


    testTotalZNameLength(words, 12);
    testTotalZNameLength(words2, 8);
  }
}
