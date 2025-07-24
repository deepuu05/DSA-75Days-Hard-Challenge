public class ReverseArray {

    public static void main(String[] args) {
        
        int arr []= {3,4,23,2,5,6,78};
        int len = arr.length;
        for(int i = 0;i<len/2;i++){

            int temp = arr[i];
            arr[i]= arr[len-i-1];
            arr[len-i-1]= temp;
        }
        System.out.println("Reverse array is");{
            for(int i=0;i<len;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
