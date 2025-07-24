// time complexity =O(logN)
// Space complexity =O(1)
import java.util.*;
public class SquareRoot {
    public static int squareRoot(int num) {
        int low=0,high;
        high = num;
        int result =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            long val = mid*mid;
            if(val== num){
                return mid;
            }
            else if ( val <num){
                result = mid;
                low = mid+1;
            }
            else {
                high= mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number for found square root");
        int num = sc.nextInt();
        int result = squareRoot(num);
        System.out.println("Squre Root is: "+result);
    } 
}
