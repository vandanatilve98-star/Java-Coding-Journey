public class OddNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10,20,30,40,50};
        int count=0;
        System.out.println("Odd numbers in the array:");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Count of odd numbers: " + count);
    }
}
