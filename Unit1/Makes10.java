

//BOOLEANS AREN'T MIXING WITH INTS

//static names makes10()

//function named testMakes10()
  //test the function on multiple inputs in main()


  public class Makes10{


    //TEST
    public static void testMakes10(int a, int b, boolean wanted){

      //new boolean for the given variables
      boolean result = makes10(a, b);

      //check what's happening and if correct kinda
      System.out.print("a: " + a + "b: " + b +
                        "wanted: " + wanted + "result: " + result);

      //see if it's what we want
      if(result == wanted){
        System.out.println("Yay!!");
      }else{
        System.out.println("Uh Oh");
      }

    }


    //RETURN VARIABLES (?)
    public static boolean makes10(int a, int b){

      if(a == 10 || b == 10 || a + b == 10){
        return true;
      } else {
        return false;
      }
    }


    //MAIN, TEST WANTED OUTCOMES FROM CB
    public static void main(String[] args){

      testMakes10(9, 10, true);
      testMakes10(9, 9, false);
      testMakes10(1, 9, true);
    }

  }
