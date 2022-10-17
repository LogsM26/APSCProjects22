

public class StringMirror{



  public static String mirror(String input){

    String result = "";

    for(int i = input.length(); i <= 0; i--){

      String r = input.substring(i, i+1);

      result = result + input + r;
    }

    return result;
  }


  public static void main(String[] args){

    mirror("Hello");
    mirror("ara");
    mirror("gfjdd");
  }
}
