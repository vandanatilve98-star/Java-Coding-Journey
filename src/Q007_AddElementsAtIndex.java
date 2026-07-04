import java.util.ArrayList;

public class Q007_AddElementsAtIndex {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        // Insert Banana at index 1
        fruits.add(1, "Banana");

        // Print all fruits
        System.out.println("Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Print total number of fruits
        System.out.println("Total Fruits: " + fruits.size());
    }
}