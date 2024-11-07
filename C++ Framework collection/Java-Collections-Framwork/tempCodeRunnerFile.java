import java.util.HashSet;
import java.util.Set;
public class LearnSet {
        public static void main(String args[]) {
                Set<Student> StudentSet = new HashSet<>();
                StudentSet.add(new Student("alone", 34));
                StudentSet.add(new Student("hack", 36));
                StudentSet.add(new Student("asus", 38));
                StudentSet.add(new Student("asus", 38));
          System.out.println(StudentSet);
        }
}