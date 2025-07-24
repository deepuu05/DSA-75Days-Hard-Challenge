// factorial using recursion

class FactRec{
    private static int fact(int num) {
        // TODO Auto-generated method stub
      int result=0;
        if(num ==0|| num ==1){
            return 1;
        }
        else{
           result = num*fact(num-1);
        }
        return result;
    }

    public static void main(String[] args) {
        
        int num =5;
        int result = fact(num);
        System.out.println("factorial is:"+result);
    }

}