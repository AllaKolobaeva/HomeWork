public class Node {
private Object data;
private Node next;  
     public Node(Object data){
         data=data;
         next=null;
  }
    
   public void setData(Object d){
        data = d;
     }
     
    public Object getData(){
        return data;
    }
    public void setNext(Node n){
        next = n;
    }
   
    public Node getNext(){
        return next;
    }
    }
