import java.util.Scanner;
public class PositiveEvenMultipleofSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(num%2==0 && num%7==0 && num>0){
            System.out.println(num + " is a positive even multiple of 7.");
        } else {
            System.out.println(num + " is not a positive even multiple of 7.");
        }
    }
}
