import java.util.Scanner;
public class PersonisEligible {
    public static void main (String[]args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = SC.nextInt();
       if(age>=60 && age >=55){
              System.out.println("You are eligible for senior citizen benefits");
       }else if (age>=18 && age <60){
              System.out.println("You are eligible for adult benefits");
    }    else if (age>=0 && age <18){
              System.out.println("You are eligible for child benefits");
    }    else{
              System.out.println("Invalid age entered");
        }
    }
}
