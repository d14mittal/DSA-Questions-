package Queues;

public class QueueUsingArrays{
    int rear;
    int size;
    int front;
    int a[];

    public QueueUsingArrays(int capacity){
        front=rear=0;
        size=capacity;
        a=new int[size];
    }

    public boolean isFull(){
        return size==a.length;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        int idx=(front + size) % a.length;
        a[idx]=data;
        size++;
    }
    public static void main(String[] args) {
        
    }
}