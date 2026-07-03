import java.util.ArrayList;

public class Q006_StoreBookNames {

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        books.add("Master Your Emotions");
        books.add("The Power of Your Subconscious Mind");
        books.add("The Secret");

        System.out.println("Book Names:");

        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("Total Books: " + books.size());
    }
}