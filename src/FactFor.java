import java.util.Scanner;

public class FactFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   // input number अलग variable में

        int fact = 1;             // factorial result store करने के लिए अलग variable

        for (int i = 1; i <= num; i++) {
            fact = fact * i;      // factorial calculation
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
