public class TilingProblem{
    static int tilingways(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return tilingways(n-1)+tilingways(n-2);
    }
    public static void main(String[] args) {    
        System.out.println(tilingways(4));
    }
}