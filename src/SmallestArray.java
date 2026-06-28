public class SmallestArray {
    public static void main(String[]args){
        int arr[]={44,22,99,11,88};
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element in array: " + smallest);
    }
}
