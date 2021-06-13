import java.util.*;
public class LearnArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offerFirst(20);
        adq.offerLast(30);
        System.out.println(adq);
        adq.peek();
        adq.peekFirst();
        adq.peekLast();
        adq.poll();
        adq.pollFirst();
        adq.pollLast();
    }
}
