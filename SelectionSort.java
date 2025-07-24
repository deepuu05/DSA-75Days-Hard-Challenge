import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        // TODO Auto-generated method stub

        for(int i =0 ;i<arr.length;i++){
         int min_idx= i;
         for(int j=i+1;j<arr.length;j++){
             if(arr[j]<arr[min_idx]){
                min_idx=j;
             }
         }
         if(min_idx!=i){
            //swap
            int temp = arr[min_idx];
            arr[min_idx]= arr[i];
            arr[i]=temp;
         }
        }
       
    }
    public static void main(String[] args) {
        int arr[]= {20,50,10,15,17,25,65};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }}
