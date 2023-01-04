

import java.util.*;


public class TransfromList{



  public static ArrayList<String> reverseAll(ArrayList<String> words){

    ArrayList<String> results = new ArrayList<String>();

    for(String w : words){

      String temp = "";

      for(int i = w.length()-1; i >= 0; i --){

        String t = w.substring(i, i+1);

        temp += t;
      }

      results.add(temp);
    }

    return results;
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
