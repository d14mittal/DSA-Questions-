import java.util.*;
public class ReverseWordsInString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<String> list=new ArrayList<>();
        for (String retval: s.split("-")) {
            list.add(retval);
        }
        String res="";
        for(int i=0;i<list.size();i++){
            if(i!=0){
                res=res+list.get(i)+".";
            }
            else{
                res=res+list.get(i);
            }
        }
        System.out.println(res);
    }
}