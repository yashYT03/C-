public class Student implements Comparable<Student> {
    String name;
    int age;
    
    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{"+
            "name = " + name + '\'' +
            ",age = " + age +   
        '}';

      
    }
      public int compareTo(Student that) {
            return this.age - that.age;
        }
}


