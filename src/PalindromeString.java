import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Convert to lowercase (case ignore)
        String str = input.toLowerCase();

        // Step 2: Remove spaces and punctuation (keep only letters and digits)
        str = str.replaceAll("[^a-z0-9]", "");

        // Step 3: Reverse the string
        String rev = new StringBuilder(str).reverse().toString();

        // Step 4: Compare
        if (str.equals(rev)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not Palindrome ❌");
        }
    }
}
 