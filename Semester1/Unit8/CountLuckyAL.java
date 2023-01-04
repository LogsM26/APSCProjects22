

import java.util.*;

public class CountLuckyAL{



  public static int countLuckyAL(ArrayList<Integer> nums){

    int count = 0;

    for(int num : nums){

      if((num%7 == 0) || (num%10 == 7)){
        count++;
      }
    }

    return count;
  }



  public static void testCountLuckyAL(ArrayList<Integer> nums, int expected){

    int result = countLuckyAL(nums);

    System.out.print("nums: ");


    for(int num : nums){
      System.out.print(nums + " ");
    }

    System.out.println("expected: " + expected + "result: " + result);


    if(expected == result){
      System.out.println("W");
    }else{
      System.out.println("L");
    }
  }



  public static void main(String[] args){

    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(7);
    nums.add(14);
    nums.add(210);

    ArrayList<Integer> nums2 = new ArrayList<Integer>();
    nums2.add(2);
    nums2.add(87);
    nums2.add(47);


    testCountLuckyAL(nums, 3);
    testCountLuckyAL(nums2, 2);
  }
}
