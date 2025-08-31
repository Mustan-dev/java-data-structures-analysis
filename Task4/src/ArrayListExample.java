import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(55);
        numbers.add(42);
        numbers.add(70);
        numbers.add(25);

        System.out.println("Values less than 50:");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num < 50) {
                System.out.println(num);
            }
        }
    }
}
