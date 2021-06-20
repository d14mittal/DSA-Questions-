import java.util.*;
class ThirdMaxNumber{
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(Integer i:a){
            set.add(i);
        }
        int want=0;
        for(Integer i:set){
            if(set.size()>=3){
                if(want==set.size()-3){
                    System.out.println(i);
                    break;
                }
            }
            else{
                System.out.println(((TreeSet<Integer>) set).last());
                break;
            }
            want++;
        }
    }
}