
import java.util.ArrayList;


// public class LearnPriorityDeque {
// public static void main(String args[]) {
//         ArrayDeque<Integer> adq = new ArrayDeque<>();
//          adq.offer(38);
//          adq.offerFirst(36);          // add element in first 
//          adq.offerLast(34);           // add element in last
//          adq.offer(76);

//          System.out.println(adq);

        //  System.out.println(adq.peek());
        //  System.out.println("peek()" + adq);
        //  System.out.println(adq.peekFirst());
        //  System.out.println(adq.peekLast());
        //  System.out.println(adq.poll());
        //  System.out.println("poll()" + adq);
        //  System.out.println(adq.pollFirst());
        //  System.out.println("pollFirst()" + adq);
        //  System.out.println(adq.pollLast());
        //  System.out.println("pollLast" + adq);   
//         }
// }

// HashSet

// import java.util.HashSet;
// import java.util.Set;
// public class LearnSet {
//         public static void main(String args[]){
//         Set<Integer> set = new HashSet<>();
//         // HashSet do not print  any repeat number
//         set.add(38);
//         set.add(36);
//         set.add(34);
//         set.add(30);
//         set.add(30);
//         System.out.println(set);

//         // // remove
//         //  set.remove(30);
//         //  System.out.println(set);     
         
//         //   contains give boolean value true or false
//          System.out.println(set.contains(34));
//         //  if my set is empty they give me value false otherwise give me true
//         //  System.out.println(set.isEmpty());

//          System.out.println(set.size());

//          set.clear();
//          System.out.println(set);
// }
// }


// LinkedHashSet

// import java.util.LinkedHashSet;
// import java.util.Set;
// public class LearnSet {
//         public static void main(String args[]){
//         Set<Integer> set = new LinkedHashSet<>();
        // HashSet do not print  any repeat number
        // set.add(38);
        // set.add(36);
        // set.add(34);
        // set.add(30);
        // set.add(30);
        // System.out.println(set);

        // // remove
        //  set.remove(30);
        //  System.out.println(set);     
         
        //   contains give boolean value true or false
        //  System.out.println(set.contains(34));
        //  if my set is empty they give me value false otherwise give me true
        //  System.out.println(set.isEmpty());
        //  System.out.println(set.size());
        //  set.clear();
        //  System.out.println(set);
// }
// }

// TreeSet
// import java.util.Set;
// import java.util.TreeSet;
// public class LearnSet{
// public static void main(String[] args) {
//     Set<Integer> set = new TreeSet<>();

//     set.add(38);
//     set.add(40);
//     set.add(34);
//     System.out.println(set);

// }

// }

// import java.util.HashSet;
// import java.util.Set;
// public class LearnSet {
//         public static void main(String args[]) {
//                 Set<Student> StudentSet = new HashSet<>();
//                 StudentSet.add(new Student("alone", 34));
//                 StudentSet.add(new Student("hack", 36));
//                 StudentSet.add(new Student("asus", 38));
//                 StudentSet.add(new Student("asus", 38));
//           System.out.println(StudentSet);
//         }
// }




// Collections Map 
// import java.util.Map;
// public class LearnMap {
//         public static void main(String argss[]){
//         Map<String , Integer> numbers = new HashMap<>();

//         numbers.put("one", 1);
//         numbers.put("two", 2);
//         numbers.put("three", 3);
//         System.out.println(numbers);
        
//      for (Map.Entry<String, Integer> e:numbers.entrySet()){
//         System.out.println(e);
//      System.out.println(e.getKey());
// }

// for (String key:numbers.keySet()) {
//         System.out.println(key);
// }
//         }
// }

// TreeMap

// import java.util.Map;
// import  java.util.TreeMap;
// public class LearnMap {
//         public static void main(String argss[]){
//         Map<String , Integer> numbers = new TreeMap<>();

//         numbers.put("one", 1);
//         numbers.put("two", 2);
//         numbers.put("three", 3);
//         numbers.put("Four", 4);
//         numbers.put("Five", 5);
//         numbers.put("six", 6);
//         numbers.put("sevem", 7);
//         numbers.put("eight", 8);
//         numbers.put("nine", 9);
//         System.out.println(numbers);

//         numbers.remove("six");
//         System.out.println(numbers);
//         }
// }
// import java.util.Arrays;
// public class LearnArrayClass {
// public static void main(String []args) {

//         int[] numbers = {7,5,9,2,5,6,7,8,3,1};
//         // int index = Arrays.binarySearch(numbers, 3);
//         // System.out.println(index);
//         Arrays.sort(numbers);

//         Arrays.fill(numbers, 38);

//         for (int i : numbers) {
//                 System.out.println(i + " ");

//         }
// }
        
// }

// CollectionsClass

// import java.util.ArrayList;

// public class CollectionsClass {
//         public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(34);
//         list.add(32);
//         list.add(36);
//         list.add(37);
//         list.add(38);
//         list.add(39);
//         list.add(40);
//         list.add(41);
//         list.add(24);
//         list.add(74);

        // show element in min or max
        // System.out.println("min element" + Collections.min(list));
        // System.out.println("max element" + Collections.max(list));

        // sorting
//        Collections.sort(list);
//        System.out.println(list); 

//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);       
// }
        
// }

public class CollectionsClass {

        public static void main(String[] args) {
            ArrayList<Student> array = new ArrayList<>();
            array.add(new Student( "logo", 20));
            array.add(new Student( "hack", 30));
            array.add(new Student( "button", 40));
            array.add(new Student( "book", 50));
            array.add(new Student( "asus", 90));
            array.add(new Student( "alo", 70));
            
        //     Student s1  =new Student("keyborad", 34);
        //     Student s2  =new Student("asus", 38);


        //     System.out.println(s1.compareTo(s2));
      System.out.println(array);    
          
}

}