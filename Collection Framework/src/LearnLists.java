import java.util.*;
public class LearnLists{
    public static void main(String[] args) {

        //ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Remove items
        list.remove(1);
        list.remove(Integer.valueOf(10));

        System.out.println(list);
        //Add a Index
        list.add(0, 10);
        list.add(1, 20);

        //set value
        list.set(1,2);
        System.out.println(list.contains(10)); 
        //Constains

        
        Iterator<Integer> itr=list.iterator();
        //Clear List//remove all elements
        // list.clear();

        System.out.println(list);
        System.out.println(list.get(4));
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}