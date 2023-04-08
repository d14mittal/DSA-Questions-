public class QueueUsingArrays{

    int size=5;
    int a[]=new int[size];
    int front=0,rear=0;
    int count=0;
    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue Full");
            return;
        }
        a[rear%size]=data;
        rear++;
        count++;

    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return;
        }
        // front=(front+1)%size;
        a[front%size]=-1;
        front++;
        count--;

    }
    void top(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return;
        }
        System.out.println(a[front%size]);
    }
    boolean isFull(){
        return count==size;
    }
    boolean isEmpty(){
        return count==0;
    }
    void printQueue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return;
        }
        for(int i=front;i<rear;i++){
            System.out.print(a[i%size]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingArrays q=new QueueUsingArrays();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(60);
        q.enqueue(70);
        q.printQueue();

        System.out.println(q.count);

    }
}