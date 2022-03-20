import java.util.Scanner;
import java.util.*;

public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(postfix(s));
    }

    static int postfix(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                stack.push(s.charAt(i) - '0');
            } else {
                int op2 = stack.peek();
                stack.pop();
                int op1 = stack.peek();
                stack.pop();

                if (s.charAt(i) == '+') {
                    stack.push(op1 + op2);
                } 
                else if (s.charAt(i) == '-') {
                    stack.push(op1 - op2);
                } 
                else if (s.charAt(i) == '*') {
                    stack.push(op1 * op2);
                } 
                else if (s.charAt(i) == '/') {
                    stack.push(op1 / op2);
                } 
                else if (s.charAt(i) == '^') {
                    stack.push(op1 ^ op2);
                }
            }
        }
        return stack.peek();

    }

}
