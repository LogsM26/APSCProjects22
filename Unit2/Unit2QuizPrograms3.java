

public class Unit2QuizPrograms3{

  public static void main(String[] args){

    for(int i = 0; i < 30; i+=3){
      if(i%3 == 0 && i%5 == 0){
        System.out.println("FizzBuzz");
      }else{
        System.out.println(i);
      }
    }
  }
}
