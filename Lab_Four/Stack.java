package Lab_Four;

public class Stack {
    
    Node head = null;
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        Node n = new Node(data);
        if (isEmpty()) {
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public int pop() {
         if (isEmpty()) {
             return -1;
         }
        int top = head.data;
        head = head.next;
        return top;
       
    }

    public int peek(){
        if (isEmpty()) {
            return -1;
        }
     
       
        return head.data;
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
           
        }
       
    }
}
