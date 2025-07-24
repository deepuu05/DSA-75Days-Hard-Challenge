import java.util.Scanner;
public class TilingProblem {
    private static int getWays(int num) {

        int res=0;
        if(num<=3){
            return num;
        }
        else{
            res= getWays(num-1)+getWays(num-2);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int No_Of_Ways = getWays(num);
        System.out.println(" Number of ways "+No_Of_Ways);
    }
}
