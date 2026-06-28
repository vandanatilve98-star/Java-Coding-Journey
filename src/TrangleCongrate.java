import java.util.Scanner;
public class TrangleCongrate {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the triangle");
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
    int c1 = sc.nextInt();
    System.out .println("enter the second triangle");
    int a2 = sc.nextInt();
    int b2 = sc.nextInt();
    int c3 = sc.nextInt();
    if(a1==a2 && b1==b2 && c1==c3){
        System.out.println("both traingle are congrate");
    }else{
        System.out.println("both traingle are not congrate");
    }
}
    
}
