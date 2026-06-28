public class CommonElement {
    public static void main(String[] args) {
        int arr1 []= {11,22,33,44,55,66};
        int arr2 []={11,66,99,88,77,55};
        System.out.println("common element");
        for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
