public class RatInMaze {
    
    static boolean isSafe(int a[][],int i,int j, int n){   
        if(i<n && j<n && i>=0 && j>=0 && a[i][j]==1){
            return true;
        }
        return false;
    }

    maze(int a[][],int i, int j,int solvearr[][]){

        if(i==n-1 && j==n-1){
            solvearr[i][j]=1;
            return true;
        }
        if(isSafe(a, i, j, n)){
            solvearr[i][j]=1;
            if(maze(a,i+1,j,solvearr)){
                return true;
            }
            if(maze(a,i,j+1,solvearr)){
                return true;
            }
            sovlearr[i][j]=0; //backtrack
            return fasle;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
