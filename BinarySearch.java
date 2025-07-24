class BinarySearch{

    public static void main(String[] args) {
        
        int arr[] = {2,3,4,5,6,7,8};
        int target =7;
         int low = 0;
         int high =arr.length;
         while (low<=high) {

            int mid = (low+high)/2;

            if(arr[mid] ==target){

                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target)
            {
                low =mid+1;
            }
            else{
                high =mid-1;
            }
            
         }

    }
}