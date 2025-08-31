import java.util.HashMap;

public class MaxExample {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        // Inserting key-value pairs
        students.put("ram", 50);
        students.put("ravi", 60);
        students.put("raju", 70);
        students.put("kumar", 80);

        // Retrieving value by key
        System.out.println("Marks of kumar: " + students.get("kumar")); // Output: 80

        // Removing a key-value pair
        System.out.println("Removing raju: " + students.remove("raju")); // Output: 70

        // Checking if a key exists
        boolean checkKey = students.containsKey("ram");
        System.out.println("Is 'ram' present? " + checkKey); // Output: true

        // Printing all key-value pairs
        System.out.println("All student records:");
        for (String key : students.keySet()) {
            System.out.println(key + ": " + students.get(key));
        }
    }
}
