

/*
NOTES:

Sub-Classes and Inherientance
  How to make your project bigger and better managed


First Class: Person
  private variable
  Constructor
  optional function
  (accsessors)


Second Class: Main
  new object in Person/First class
  call function

  new object in Student class
  can call function in Person class

  can make an ArrayList of Person Objects
    can add Students and Person
    can iterate through and call a function
      will call the one for them, person or student hello function


Third Class: Student EXTENDS Person
  CANNOT ACCSESS PERSON PRIVATE VARIABLES
    public instead
  Constructor
    super(name);
    not this.name = name;
  functions in just Student



Student Extends Person

Student is a subclass of Person
Person is a superclass of Student

Student inherits from Person

Student "is a" Person
  Properties and Functions of a Person
  Can add stuff on too




Interfaces
  Interface instead of Class


First Interface: Shape
  public variable(s) or function(s)
    not being specified


Second Class: Rectangle
  Implements Shape instead of extends
  Constructor
  specifies the pulic variable(s) in functions
    induvidual to the class
  getName function for String name in Interface


Third Class: ShapeTest
  ArrayList of Interfeces
    Needs concrete objects to be added, Rectangle
  add them to the AL
  then print them out


Fourth Class: Circle
  Constructor
  implement the three functions in the interface
  can add new variablesm, such as radius


*/
