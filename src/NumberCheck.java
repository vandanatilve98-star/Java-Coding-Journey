public class NumberCheck {
    public static void main(String[] args) {
        int num1=1;
        int num2=-1;
        int num3=0;
        if(num1>num3){
            System.out.println(num1 + "Number is positve");
        }else if(num2<num3){
            System.out.println(num2 + "Number is negative");
        }else{
            System.out.println(num3 + "Number is zero");
        }
    }
}