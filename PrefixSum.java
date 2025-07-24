import java.util.Scanner;

public class PrefixSum {
    static int preSum(int [][] arr,int r1, int c1, int r2, int c2){
         int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j= c1;j<=c2;j++){
             sum+=arr[i][j];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();
        System.out.println("Enter Number Of column");
        int n = sc.nextInt();
        int arr[][]= new int[m][n];

        System.out.println("Enter Elements of Array");
        for(int i= 0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter r1 cordinates");
        int r1 = sc.nextInt();
        System.out.println("Enter c1 cordinates");
        int c1 = sc.nextInt();
       System.out.println("Enter r2 cordinates");
        int r2 = sc.nextInt();
        System.out.println("Enter r2 cordinates");
        int c2 = sc.nextInt();
       
       int result= preSum(arr,r1,c1,r2,c2);
       System.out.println("Sum is : "+result);

    }
    
}
