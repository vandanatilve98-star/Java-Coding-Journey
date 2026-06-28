import java.util.Scanner;
public class LeepYearMultipleOfFive {
    public static void main(String[]args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year= SC.nextInt();
        if((year%4==0 && year%100!=0 || year%400==0) && year%5==0){
            System.out.println("The year is a leap year and a multiple of 5.");
        } else {
            System.out.println("The year is not a leap year or not a multiple of 5.");
        }
    }
}
