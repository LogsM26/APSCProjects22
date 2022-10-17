

public class QuizCountx{



  public static int countX(String input){

    int result = 0;

    for(int i = 0; i < input.length(); i++){

      if((input.substring(i, i+1)).equals("x")){

        result = result + 1;
      }else{

        result = result + 0;
      }
    }

    return result;
  }



  public static void main(String[] args){

    countX("uiwghfskfbfhf");
    countX("xxxxxxxx");
    countX("sughksrghkrgzzzhvdahbcxxzgc");
  }
}
