import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int num = sc.nextInt();
        if(num>=90){
            System.err.println("Grade A");
        }else if (num>=85){
            System.out.println("Grade B");
        }else if (num>=75){
            System.out.println("Grade c");
        }else if(num>=65){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
}
