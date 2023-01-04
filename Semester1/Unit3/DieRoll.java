

public class DieRoll{



  public static int dieRoll(){

    int n = (int)(Math.random() * 6 + 1);

    return n;
  }



  public static void main(String[] args){

    System.out.print(dieRoll());
  }
}
