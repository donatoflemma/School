package collections.Queues;

import java.util.*;

public class ListQueueDemo {
  public static void main(String args[]) {
    int numbers[]={34,22,10,60,30};
   List <Integer>list = new ArrayList<Integer>();
  try{
  for(int i=0; i<5; i++)
    list.add(numbers[i]);

  System.out.println("the List is: "+list);

  LinkedList <Integer> queue = new LinkedList<Integer>();

  for(int i=0; i<5; i++)
    queue.add(numbers[i]);

  queue.add(555);
  System.out.println("The Oueue is: "+ queue);

  Collections.sort(queue);

  System.out.println("The sorted Oueue is: "+ queue);

  queue.remove();
    System.out.println("After removing the header element the queue is: "+ queue);
  queue.removeFirst();
    System.out.println("After removing the first element the queue is: "+ queue);
  queue.removeLast();
    System.out.println("After removing the last element the queue is: "+ queue);

  }
  catch(Exception e){}
  }
}


