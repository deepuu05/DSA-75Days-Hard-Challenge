public class PrintAllPermutations {
    
    public static String swap(String str,int i,int j){
          char[] charArray = str.toCharArray();
          char temp = charArray[i];
          charArray[i]=charArray[j];
          charArray[j]=temp;
         return String.valueOf(charArray);
    }


    public static void permute(String str,int left,int right){
        if(left==right){
            System.out.println(str);
        }
        else{
            for(int i=left;i<=right;i++){

                str = swap(str,left,i );
                permute(str,left+1,right);

                //bacttracking
                str = swap(str,left,i); 
            }
        }  
    }

    public static void main(String[] args) {
        String str1 = "XYZ";
        int n = str1.length();
        System.out.println("for String "+str1+" permutations are");
        permute(str1, 0, n-1 );
    }
}
