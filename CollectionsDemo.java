import java.io.*;
import java.util.*;
public class CollectionsDemo{
    public static void main(String ar[])
    {
        List a=new ArrayList();
        a.add("DHRV");
        a.add("Ravi");
        System.out.println("array elements");
        System.out.print(" "+a);

        List l1=new LinkedList();
        l1.add("Zara");
        l1.add("2");
        System.out.println(" "+l1);

        Set s=new HashSet();
        s.add("fhurv");
        s.add("3");
        System.out.println("set elements");
        System.out.print(" "+s);

        Map m=new HashMap();
        m.put("zara","1");
        m.put("dhruv","2");

        m.put("2","3");
        System.out.println("Map elements");
        System.out.println(" "+m);


    }
}
// import java.util.*;
// public class CollectionsDemo {

//    public static void main(String[] args) {
//       // ArrayList 
//       List a1 = new ArrayList();
//       a1.add("Zara");
//       a1.add("Mahnaz");
//       a1.add("Ayan");
//       System.out.println(" ArrayList Elements");
//       System.out.print("\t" + a1);

//       // LinkedList
//       List l1 = new LinkedList();
//       l1.add("Zara");
//       l1.add("Mahnaz");
//       l1.add("Ayan");
//       System.out.println();
//       System.out.println(" LinkedList Elements");
//       System.out.print("\t" + l1);

//       // HashSet
//       Set s1 = new HashSet(); 
//       s1.add("Zara");
//       s1.add("Mahnaz");
//       s1.add("Ayan");
//       System.out.println();
//       System.out.println(" Set Elements");
//       System.out.print("\t" + s1);

//       // HashMap
//       Map m1 = new HashMap(); 
//       m1.put("Zara", "8");
//       m1.put("Mahnaz", "31");
//       m1.put("Ayan", "12");
//       m1.put("Daisy", "14");
//       System.out.println();
//       System.out.println(" Map Elements");
//       System.out.print("\t" + m1);
//    }
// }