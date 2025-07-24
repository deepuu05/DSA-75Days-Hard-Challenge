public class LinearSearch {
    public static void main(String[] args) {
        int array[]= {3,4,5,1,7,6,8};
        int target = 4;
        for(int i=0;i<array.length;i++){

            if(array[i]==target){
                System.out.println(i);
            }
        }
    }
}
