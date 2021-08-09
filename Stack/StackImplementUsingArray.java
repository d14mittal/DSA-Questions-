// import java.util.Scanner;
// import java.util.Stack;

public class StackImplementUsingArray {
    static int max = 5;
    static int a[] = new int[max];
    static int top=-1;
    static void push(int data) {
        if (top == max - 1) {
            System.out.println("Satck Overflow");
        } else {
            a[++top] = data;
            System.out.println(a[top]+" pushd into stack");
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Top Item is: " + a[top]);
        }
    }
    static void print(){
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    static void empty(){
        System.out.println(top==-1); 
    }
    static void search(int data){
        for(int i=0;i<=top;i++){
            if(a[i]==data){
                System.out.println("Data found at index "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        print(); 
        search(50);
        pop();
        pop();
        pop();
        pop();
        pop();
        print();     
        empty(); 
    }
}