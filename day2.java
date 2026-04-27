//stac0k
import java.util.*;
class day2{
   //deque as LIFO
   public static void lifo()
   {
      Deque<Integer> qu=new ArrayDeque<>();
      qu.push(12);
      qu.push(34);
      qu.push(89);
      System.out.println("Peek:"+qu.peek());
      while(!qu.isEmpty()) {
         System.out.println(qu.pop());
      }
   }
   //deque as queue
   public static void fifo()
   {
      Deque<Integer> qu=new ArrayDeque<>();
      qu.offer(12);
      qu.offer(34);
      qu.offer(67);

      System.out.println(qu.peek());
      while(!qu.isEmpty())
      {
         System.out.println(qu.poll());
      }
   }
   //frequency count
   public static void freqcount()
   {
      int arr[]={1,2,3,1,2,3,2,4,2,3};
      HashMap<Integer,Integer> map=new HashMap<>();
       for(Integer i:arr)
       {
         map.put(i,map.getOrDefault(i, 0)+1);
       }
      

   }
   public static void main(String args[])
   {
     
      freqcount();
   }
}
