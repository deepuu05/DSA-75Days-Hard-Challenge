class Palindrome{
    public static void main(String[] args) {
        int arr []={1,2,3,2,1};
        int len = arr.length;
        int flag = 0;
        for(int i = 0;i<len/2;i++){
          if(arr[i]!=arr[len-i-1]){
            System.out.println(" not a palindromic array");
            flag =1;


          }

        }
        if(flag == 0){
          System.out.println("palindromic array");
        }

    }
}