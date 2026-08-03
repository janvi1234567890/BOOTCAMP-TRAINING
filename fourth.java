import java.util.HashMap;

public class fourth {
    public static void main(String[] args) {

        HashMap<String, Integer> student = new HashMap<>();

        // Adding elements
        student.put("Janvi", 101);
        student.put("Rahul", 102);
        student.put("Aman", 103);

        // Printing HashMap
        System.out.println(student);

        // Accessing a value
        System.out.println("Janvi's ID: " + student.get("Janvi"));

        // Checking if a key exists
        System.out.println(student.containsKey("Rahul"));

        // Checking if a value exists
        System.out.println(student.containsValue(103));

        // Updating a value
        student.put("Janvi", 110);
        System.out.println(student);

        // Removing an entry
        student.remove("Aman");
        System.out.println(student);

        // Size of HashMap
        System.out.println("Size: " + student.size());

        // Iterating over keys
        System.out.println("Keys:");
        for (String key : student.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        System.out.println("Values:");
        for (Integer value : student.values()) {
            System.out.println(value);
        }

        // Iterating over key-value pairs
        System.out.println("Key-Value Pairs:");
        for (String key : student.keySet()) {
            System.out.println(key + " -> " + student.get(key));
        }

        // Clearing the HashMap
        student.clear();
        System.out.println("After clear: " + student);
    }
}