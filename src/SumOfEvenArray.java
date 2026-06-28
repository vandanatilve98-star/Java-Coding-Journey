public class SumOfEvenArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10,20,30,40,50};
        int sum=0;
        System.out.println("Even numbers in the array:");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
