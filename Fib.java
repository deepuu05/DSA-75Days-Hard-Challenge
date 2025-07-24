public class Fib {
    private static int fib(int num) {
        // TODO Auto-generated method stub
      int result=0;
         if(num ==0||num==1){
            return num;
         }
         else{
            result = fib(num-1)+fib(num-2);

         }
         return result;

    }


    public static void main(String[] args) {
         int num =7;

         int result = fib(num);
         System.out.println("fibonacci series is:"+result);
    }

    
}
