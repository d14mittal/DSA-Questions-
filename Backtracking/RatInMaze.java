public class RatInMaze {
    
    static boolean isSafe(int a[][],int i,int j){   
        if(i<n && j<n && a[i][j]==1){
            return true;
        }
        return false;
    }

    maze(int a[][],int i, int j,int solarr[][]){
        if(isSafe(a, i, j)){
            solarr[i][j]=1;
            if(maze(a,i+1,j,solvearr)){
                return true;
            }
        }
        if(isSafe(a, row, col+1)){
            return;
        }

    }
    
    
    public static void main(String[] args) {
        
    }
    
}
