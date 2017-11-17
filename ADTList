
public class ADTList
{
    int numItems=0;
    Node head=null;
    Node tail=null;
    
    public boolean isEmpty(){
        return numItems==0;
    }
    
    public int size(){
        return this.numItems;
    }
    
    public void add(int index,Node node){
        Node prev=get(index-1);
        if(prev!=null){
            node.next=prev.next;
            prev.next=node;
            if(node.next==null){
                tail=node;
            }
        }else{
            add(node);
        }
        numItems++;
    }
    
    public Node remove(int index){
        return null;
    }
    
    public Node get(int index){
        if(index==0){
            return head;
        }
        int i=0;
        Node curr=null;
        for(curr=head;curr!=null;curr=curr.next,i++){
            if(i==index){
                return curr;
            }
        }
        return null;
    }
    
    public void add(Node node){
        if(numItems==0){
            head=tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
    
    public void removeAll(){
        head=tail=null;
        numItems=0;
    }
    
}
