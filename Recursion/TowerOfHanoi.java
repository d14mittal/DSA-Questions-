public class TowerOfHanoi {

    static void hanoi(int n, char src, char dest, char help){
        if(n==0){
            return;
        }
        hanoi(n-1, src, help, dest);
        System.out.println("Move from "+src+" to "+dest);
        hanoi(n-1, help, dest, src);
    }

    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
}
