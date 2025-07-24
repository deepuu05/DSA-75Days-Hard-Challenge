public class InsertionSort {

    public static void main(String[] args) {
        
        int arr[] ={3,1,4,5,7,6};
        for(int i=0;i<arr.length;i++){
          int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;

            }
        }
        System.out.println("sorted Array is:");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        
    }
    
}
