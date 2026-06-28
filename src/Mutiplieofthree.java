import java.util.Scanner;
public class Mutiplieofthree {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = SC.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println(num+" number is even and multiple of three");
        }else{
            System.out.println(num+" number is not even and multiple of three");
        }
    }
}
