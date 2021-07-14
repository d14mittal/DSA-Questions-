import java.util.*;

public class ReverseSentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<String> stack=new Stack<>();
        String temp="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                stack.push(temp);
                temp="";
            }
            else{
                temp=temp+s.charAt(i);
            }
        }
        stack.add(temp);
        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }

    }
}