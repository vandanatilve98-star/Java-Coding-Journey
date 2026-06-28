import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle :");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if(side1==side2 && side2==side3){
            System.out.println("The triangle is an equilateral triangle");
        }else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("The triangle is an isosceles triangle");
        }else{
            System.out.println("The triangle is a scalene triangle");
        }
    }
}