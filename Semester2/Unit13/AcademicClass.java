

import java.util.*;
import processing.core.*;

public class AcademicClass{

  private static String name;
  private static String teacher;

  private static ArrayList<Student> students = new ArrayList<Student>();

  public AcademicClass(String name, String teacher, ArrayList<Student> students){

    this.name = name;
    this.teacher = teacher;

    this.students = students;
  }



  public static void addStudent(Student s){

    students.add(s);
  }


  public static void info(String name, String teacher, ArrayList<Student> students){

    System.out.println("This class is: " + name + ", The teacher is: "
                      + teacher + " with students: ");

    for(Student s : students){
       System.out.print(s.getName() + ", ");
    }
  }


  public static ArrayList<String> favNum(int n){

    ArrayList<String> favNumNs = new ArrayList<String>();

    for(Student s : students){

      if(s.getFavNum() == n){
        favNumNs.add(s.getName());
      }
    }

    return favNumNs;
  }


  public static ArrayList<String> favNumOdd(ArrayList<Student> students){

    ArrayList<String> favNumOdds = new ArrayList<String>();

    for(Student s : students){

      if(s.getFavNum()%2 != 0){
        favNumOdds.add(s.getName());
      }
    }

    return favNumOdds;
  }



  public static void main(String[] args){

    addStudent(new Student("Logan", 0));
    addStudent(new Student("Nex", 18));
    addStudent(new Student("Nat", 5783));
    addStudent(new Student("Tata", 6));

    info("Draw & Paint", "Ms. d", students);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Students with the favorite number 18 are: " + favNum(18));
    System.out.println("These students have odd favorite numbers: " + favNumOdd(students));
  }
}
