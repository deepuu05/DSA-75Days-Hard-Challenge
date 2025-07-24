public class NQueenProblem {

    public static void printSolution(int [][] board ,int n){

     for(int i=0;i<n;i++){
        for(int j= 0; j<n;j++){
            System.out.println(board[i][j]+" ");
        }
        System.out.println();
     }
 }
    public static boolean isSafe(int[][] board , int row ,int col, int n){

        int i, j;
        // check on the left row
        for(i= 0;i<col;i++){
            if(board[row][i]==1){
                return false;

            }
        }
         // check for the upper diognal in left direction
         for(i= row, j=col ;i>=0 && j>=0;i--,j--){

            if(board[i][j]==1){
                return false;
            }

         }
        
         // check for lower diognal
          for(i= row, j=col ;i<n && j>=0;i--,j--){

            if(board[i][j]==1){
                return false;
            }

         }
 return true;
    
    }


    public static boolean solveQueen(int [][] board ,int col,int n){

        if(col>=n){
            return true;
        }

        for(int i=0;i<n;i++){

            if(isSafe(board, i, col, n)==true){

                board[i][col]=1;
            }

            if(solveQueen(board, col+1, n)== true){
                return true;
            }

            board[i][col]=0;

        }
        return false;
    }
    

    public static void main(String[] args) {

        int[][] board ={{0,0,0,0},
                          {0,0,0,0},
                        {0,0,0,0},
                    {0,0,0,0}};
        
                ;
        
    }


}
