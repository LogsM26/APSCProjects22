

public class QuizSumofEvents{


  public static int sumOfEvents(int n){

    int result = 0;

    for(int i = 0; i%2 == 0; i++){

      result = i + result;
    }

    return result;
  }


  public static void main(String[] args){

    sumOfEvents(10);
  }
}
