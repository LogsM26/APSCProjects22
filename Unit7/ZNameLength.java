

class ZNameLength{



  public static int zNameLength(String[] words){

    int result = 0;

    for(String word : words){

      if((word.substring(0, 1).equals("z")) || (word.substring(0, 1).equals("Z"))){
        result += word.length();
      }
    }

    return result;
  }



  public static void testZNameLength(String[] words, int expected){

    int result = zNameLength(words);


    System.out.print("values: ");

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

    String[] words = new String[3];
    words[0] = "z";
    words[1] = "Hello";
    words[2] = "Zup";

    String[] words1 = new String[3];
    words1[0] = "zZzZz";
    words1[1] = "zzzzzzzgfdgdgzzz";
    words1[2] = "jfcnjhytrfcvbn";


    testZNameLength(words, 4);
    testZNameLength(words1, 21);
  }
}
