import java.util.Stack;

public class InfixToPrefix{
    static int prec(Character ch){
        if(ch=='^'){
            return 3;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        else if(ch=='+' || ch=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    static String infixToPostfix(String s){
        
        String res;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                res=res+s.charAt(i);
            }
            else if(s.charAt(i)==')'){
                while(!stack.empty() && stack.peek()!='('){
                    res+=stack.peek();
                    stack.pop();
                }
                if(!stack.empty()){
                    stack.pop();
                }
            }
            else{
                while(!stack.empty() && prec(s.charAt(i))<=prec(stack.peek())){
                    res+=stack.pop();
                }
                stack.push(s.charAt(i));
            }
        }
        while(!stack.empty()){
            res+=stack.pop();
        }
        res=res.reverse();
        return res;

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(infixToPostfix(s));
    } 
}