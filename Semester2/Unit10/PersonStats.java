

import java.util.*;


public class PersonStats{


  //Test It!
  public static void testPersonStats(ArrayList<Person> people, int expected){

    int result = averageNumP(people);

    System.out.print(people);

    for(Person p : people){
      System.out.println(people + " ");
    }


    System.out.println("expected: " + expected + " result: " + result);

    if(expected == result){
      System.out.println("W");
    }else{
      System.out.println("L");
    }
  }



  //Average Num of Pets
  public static int averageNumP(ArrayList<Person> people){

    int av = 0;

    for(Person p : people){
      av += p.getNumP();
    }

    return av / people.size();
  }


  //Person With Most Pets
  public static String mostPets(ArrayList<Person> people){

    String mostPetPerson = " ";
    int amount = 0;

    for(Person p : people){
      if(p.getNumP() > amount){
        amount = p.getNumP();
      }

      mostPetPerson = p.getName();
    }

    return mostPetPerson;
  }


  //People With At Least 2 Pets
  public static ArrayList<String> least2(ArrayList<Person> people){

    ArrayList<String> least = new ArrayList<String>();

    for(Person p : people){
      if(p.getNumP() > 2){
        least.add(p.getName());
      }
    }

    return least;
  }



  public static void main(String[] args){

    ArrayList<Person> people = new ArrayList<Person>();

    people.add(new Person("Grey", 5));
    people.add(new Person("Kate", 11));
    people.add(new Person("Nora", 1));
    people.add(new Person("Jules", 1));

    testPersonStats(people, 9/2);
  }
}
