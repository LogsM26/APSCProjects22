

import java.util.*;


public class TransfromList{



  public static ArrayList<String> reverseAll(ArrayList<String> words){

    ArrayList<String> result = new ArrayList<String>();

    for(String result : results){


    }

    for(String i = word.length()-1; i >= 0; i--){

      String r = word.substring(i, i+1);

      result = result + r;
    }

    return result;
  }



  public static void main(String[] args){

    ArrayList<String> words = new ArrayList<String>();
    words.add("potato");
    words.add("poo");
    words.add("municipal");


    ArrayList<String> reverses = reverseAll(words);

    System.out.println("reverse: ");

    for(String word : reverses){
      System.out.println(word);
    }
  }
}
