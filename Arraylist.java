
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("The Original list : "+ list);

        System.out.println(list.get(0));

        list.set(4, 60);
        System.out.println("Updated list: " + list);

        list.remove(4);
        System.out.println("List after remove : "+list);

        list.remove(Integer.valueOf(40));
        System.out.println("One more remove(by value) : "+list);

        list.add(3,40);
        System.out.println("Add once more : "+list);

        list.add(1,50);
        System.out.println("Add once more : "+list);

        System.out.println("Contains 40 ? : "+ list.contains(40));
        System.out.println("Size of new list : "+list.size());

        // list.clear();
        // System.out.println("Clear list : "+list);

        // System.out.println(list);

        // Sorting

        Collections.sort(list);
        System.out.println("Sorted list : "+list);
    }
}
