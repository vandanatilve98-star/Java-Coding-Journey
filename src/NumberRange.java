import java.util.Scanner; 
public class NumberRange {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a number :") ;
        int num = SC.nextInt();
        if(num>=1 && num<=100){
            System.out.println("number is in range");
        }else{
            System.out.println("number is out of range");
        }
    }
}