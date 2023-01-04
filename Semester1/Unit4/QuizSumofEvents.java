

public class QuizSumofEvents{


  public static int sumOfEvents(int n){

    int result = 0;

    for(int i = 0; i <=n; i++){

      result = i*2 + result;
    }

    System.out.println(result);

    return result;
  }


  public static void main(String[] args){

    sumOfEvents(10);
    sumOfEvents(40);
  }
}
