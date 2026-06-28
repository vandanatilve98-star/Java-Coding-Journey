public class Vowel {
 public static void main(String[] args) {
     String str = "Hello World";
     for (int i=0;i<=str.length()-1;i++){
         char ch = str.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
             System.out.println(ch);
         }
     }
 }   
}
