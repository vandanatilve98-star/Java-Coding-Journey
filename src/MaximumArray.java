public class MaximumArray {
    public static void main(String[] args) {
        int arr[]= {44,22,99,11,88,};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array: " + max);
    }
}
