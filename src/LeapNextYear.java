import java.util.Scanner;

public class LeapNextYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Check current year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        // Find next leap year
        year++;
        while (!((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            year++;
        }

        System.out.println("The next leap year is: " + year);
    }
}