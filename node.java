
public class Node
{
   public int value;
   public Node next=null;
    
   public static void main(String []args)throws Exception{
       Node n1 = new Node();
       n1.value=20;
       Node n2 = new Node();
       n2.value=80;
       n1.next=n2;
       
       Node n3 = new Node();
       n3.value=50;
       n3.next=n1.next;
       n1.next=n3;
       
       for(Node curr=n1; curr!=null;curr=curr.next){
           System.out.println(curr.value);
        }
       
   }
}
