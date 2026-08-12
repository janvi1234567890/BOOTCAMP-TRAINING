import java.util.HashMap;
public class hashmap {
    
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Access values using keys
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Two': " + map.get("Two"));

        // Check if a key exists
        if (map.containsKey("Three")) {
            System.out.println("Key 'Three' exists");
        }

        // Remove a key-value pair
        map.remove("Two");
        System.out.println(map);

        // Iterate through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}