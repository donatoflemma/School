package collections.Queues;

import java.util.*;

public class PriorityQueueSort  {

    public static void main(String[] args) {
        int [] ia = {1,5,3,7,6,9,8};
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

        //--- fill queue
        for(int x : ia)
            pq1.offer(x);
        //--- print queue
        System.out.println(pq1);

        for(Integer x : ia)
            System.out.print(pq1.poll()+" ");
        System.out.println();

        // use the Comparator
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,new PComparator());

        // fill queue
        for(int x : ia)
            pq2.offer(x);


         System.out.println(pq2);
        for(int x : ia)
            System.out.print(pq2.poll()+" ");

        System.out.println();

        System.out.println("----------------");
        for(int x : ia)
            pq2.offer(x);
        System.out.println(pq2);
        System.out.println("----------------");
        
        
        // use different Queue methods
        System.out.println("size "+ pq2.size());
        System.out.println("peek "+ pq2.peek());
        System.out.println("size "+ pq2.size());
        System.out.println("poll "+ pq2.poll());
        System.out.println("size "+ pq2.size());

        //--- print queue
        for(int x : ia)
            System.out.print(pq2.poll()+" "); //poll return null if queue empty

    }


    //--- the comparator class ------------
    static class PComparator implements Comparator <Integer> {

        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }
    //-------------------------------------

}