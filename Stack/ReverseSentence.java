import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> stack = new Stack<>();
        String temp = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                stack.push(temp);
                count++;
                temp = "";
            } else {
                temp = temp + s.charAt(i);
            }
        }
        stack.add(temp);
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                System.out.println(stack.pop());
            } else {
                System.out.print(stack.pop() + " ");
            }
        }

    }
}