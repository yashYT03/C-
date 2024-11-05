// constructor 

// class  pen {
//     String color;
//     String type;
//     void write()
//      {
//         System.out.println("write something here ");
//      }

//     void printcolor()
//     {
//         System.out.println(this.color);
//     }
// }


// class Student {
//     String name;
//     int age;

//     void printInfo() {
//     //    System.out.println("Student Information");
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student(Student s2) {
//          this.name = s2.name;
//          this.age = s2.age;
//     }
// Student () {
    
// }
// }




// public class Oops {
//     public static void main(String args[]) {

//         // Student s1 = new Student("anonymous ", 19);
//        Student s1 = new Student();
//         s1.name= "anonymous";
//         s1.age = 20;

//         Student s2 = new Student(s1);
//         s2.printInfo();
//         // pen pen1 = new pen();
//         // pen1.color = "pink";
//         // pen1.type = "gel";

//         //  pen pen2  = new pen();
//         //  pen2.color = "black";
//         //  pen2.type = "ballpointpen";

//         // // pen1.write();
//         // // pen2.printcolor();

//         //  pen1.printcolor();
//         //  pen2.printcolor();

//     }
// }

// polymorphism 

// class Student {

//     String name;
//     int age;

//    public  void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo (int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name , int age) {
//         System.out.println(name + " " + age);
//     }
// }

// public  class  Oops{
//     public static void main (String[] args) {
//         Student s1 = new Student();
//         s1.name= "anonymous";
//         s1.age = 38;

    
//         s1.printInfo(s1.name, s1.age);
//     }
// }







//  Single inheritance


// class Circle {
// String color;  
// }
// class Square extends  Circle {
// }
// class  Oops {
//     public static void main(String[]args) {
//      Square s1 = new Square();
//      s1.color="red";  
//     }
// }

//  inheritance  Multilevel 

// class Shape {
//  public void area() {
//         System.out.println("displays area");
        
//      }  
// }

// class  Triangle extends  Shape {
//     public void area (int l , int h)
//     {
//       System.out.println(1/2*l*h);
//     }
// }

// class  Circle extends  Triangle {
//     public void area(int r) {
//     System.out.println(3.14*r*r);
//     }
// }

// Hierarchial inheritance

// class College { // Renamed from Collage to College
//     int a = 5;
//     int b = 5;
//     int c;

//     public void profileInfo() {
//         System.out.println("THIS IS ABOUT STUDENT INFORMATION");
//     }
// }

// class Professor extends College {
//     public void profileInfo(int w, int r) {
//         System.out.println("Professor profile: " + w + ", " + r);
//     }
// }

// class Student extends College {
//     public void profileInfo(String anonymous) {
//         // This will not override the parent method, but is a separate overload
//         System.out.println("Student profile: " + anonymous);
//     }

//     public void profileInfo() {
//         super.profileInfo(); // Call the parent method
//         System.out.println(a * b); // Print product of a and b
//     }
// }

// class Pro {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.profileInfo(); // Calls the overridden method in Student
//         s1.a = 7;
//         s1.b = 8;
//         s1.c = s1.a * s1.b;
//         System.out.println(s1.c);
//     }
// }

// package


// class  Account {
// public String name;
// protected String email;
// private  String  password;

// // private key not access hence we use getters and setters methods

// public String getPassword() {
//     setPassword("anonymous@321");
//     return this.password;
// }

// public void setPassword(String pass) {
//     this.password = pass;
// }
// }
// public class Oops {

//     public static void main(String args[]) {
//     Account account1 = new Account();
//     account1.name = "Anonymous";
//     account1.email = "heaventomyworld@gmail.com";
//     account1.setPassword("Abcd");
//     System.out.println(account1.getPassword());

//  }
// }


// Abstraction

// class Animal {
//     Animal() {
//         System.out.println("You are crating new animal ");
//     }
//  public void  eat() {
//     System.out.println("THIS IS ALL ANIMAL");
//  }
// }

// class Horse extends  Animal{

//     Horse() {
//         System.out.println("You are crating horse ");
//     }
//     public void walk(){
//         System.out.println("horse walk on 4 legs");
//     }
// }

// class  duck extends  Animal{
//     public void walk() {
//         System.out.println("duck walk on 2 legs");
//     }
// }

// public class  Oops
//  {
//     public static void main(String args[]) {
//         Horse horse = new Horse();
//         // horse.eat();
//         // horse.walk();
        
//     }
//  }



