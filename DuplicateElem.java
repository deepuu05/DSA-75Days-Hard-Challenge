public class DuplicateElem {
    public static void main(String[] args) {
        
        int array[] = {1,2,3,3,4,5,5,6};
        int len = array.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(array[i]==array[j]){

                    System.out.println(array[i]);
                }


            }

        }
    }
    
}
