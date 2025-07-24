public class TwoSum {
    public static void main(String[] args) {
        
        int array[]={2,4,5,6,7,8};
        int target= 3;
        int len =array.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){

                if(array[i]+array[j]==target){
                    System.out.println("["+array[i]+","+array[j]+"]");
                }
                
            }
        }
         

    }
}
