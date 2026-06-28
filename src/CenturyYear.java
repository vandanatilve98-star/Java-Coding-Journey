import java.util.Scanner;
public class CenturyYear {
    public static void main(String[]args){
        Scanner SC = new Scanner( System.in);
        System.out.println("Enter a Year :");
        int year = SC.nextInt();
        if(year%100==0){
            System.out.println("This is a century year");
        }else{
            System.out.println("This is not a century year");
        }
    } 
}
