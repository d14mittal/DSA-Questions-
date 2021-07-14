import java.util.*;
public class ReverseStack {
    
    static void reverse(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }
        int element=stack.pop();
        reverse(stack);
        insertAtBottom(stack,element);
    }
    
    static void insertAtBottom(Stack<Integer> stack, int element){
        if(stack.empty()){
             stack.push(element);
             return;
        }
        int top=stack.pop();
        insertAtBottom(stack, element);

        stack.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        
        stack.push(50);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        reverse(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    
}
