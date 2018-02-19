import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class sortAndRemove
    /*Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges
      the list’s elements into sorted ascending order, as well as removing all duplicate values from the list.
      For example,
      the list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become [–9, –5, 4, 7, 8, 11,
      15, 27, 32] after a call to your method. Use a Set as part of your solution.*/
{
    public static void main(String[] args) {

        // linkedListe med alle tallene (ikke sorteret)
        List<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(27);
        list.add(7);
        list.add(11);
        list.add(-5);
        list.add(32);
        list.add(-9);
        list.add(-9);

        // metode kaldet
        sortAndRemoveDuplicates(list);
        System.out.println(sortAndRemoveDuplicates(list));
    }
    // metode der sorterer linkedlisten
    public static Set sortAndRemoveDuplicates(List<Integer> sAndR) {
        return new TreeSet<>(sAndR);
    }
}


