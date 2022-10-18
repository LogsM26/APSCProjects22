

public class StringMirror{



  public static String mirror(String input){


    String result = "";


    for(int i = input.length()-1; i >= 0; i--){

      String r = input.substring(i, i+1);

      result = result + r;
    }

    return result;
  }


  public static void main(String[] args){

    System.out.println(mirror("Hello"));
    System.out.println(mirror("ara"));
    System.out.println(mirror("shb"));
  }
}
