

public class Unit2QuizPrograms{

  public static void main(String[] args){


    //FizzFizz
    for(int i = 0; i < 30; i++){

      if(i%9 == 0){
        System.out.println("FizzFizz");
      }else if(i%3 == 0){
        System.out.println("Fizz");
      }else{
        System.out.println(i);
      }

    }

  }
}
