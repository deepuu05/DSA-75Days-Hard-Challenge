
import java.util.Scanner;
public class Staircase{
    private static int countWays(int n) {
        // TODO Auto-generated method stub
      int result=0;
        if(n==0||n==1){
            return n;
        }else{
            result = countWays(n-1)+countWays(n-2);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int num = s.nextInt();

        int result = countWays(num+1);
        System.out.println("Number of Ways"+result);
        

    }

}