public class MissingElement {
    
    public static void main(String[] args) {
        
        int array[]= {3,0,1,2,7,5,6};
        int len = array.length;
        int SumOfNaturalNum = (len*(len+1))/2;
  int sum =0;
        for(int i=0;i<len;i++){
            sum += array[i];


        }

        int MissingElement = SumOfNaturalNum- sum;
        System.out.println(MissingElement);
    }
}
