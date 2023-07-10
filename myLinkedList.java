public class myLinkedList {

    Node head;
    public class Node{
        int data;
        Node next;
    
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        } 
    }

    public void insertAtFirst(int d) 
    {
        Node n = new Node(d);

       if(head == null ) {
            n.data = d;
            head = n;     
        } 
        else {
            n.data = d;
            n.next = head;
            head = n;
        }
    }

    public void printNode()
    {
        Node currentNode = head;
        while(currentNode.next != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
           
        }
        System.out.println(currentNode.data);
    }

    public void insertAtLast(int data)
    {
        Node newNode  = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node currentNode = head;
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }

    public void removeAtFirst(){
        //Node curr = head;
        if(head.next != null)
        {
            head = head.next;
            //head = null;
        }
    }

    public void removeAtEnd(){
        Node curr = head;
        while(curr.next.next != null)
        {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void countNodes(){
        int count = 0;

        Node current = head;
        while(current.next != null)
        {
            count++;
            System.out.println(current.data);
            current = current.next;
           
        }
        count = count+1;
        System.out.println(current.data);
        System.out.println("Number of Nodes: " + count);

    }

    public static void main(String args[]){
        myLinkedList list = new myLinkedList();
        // list.insertAtFirst(10);
        // list.insertAtFirst(20);
        // list.insertAtFirst(30);
        // list.insertAtFirst(40);
        // list.insertAtFirst(50);

        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        

        //list.printNode();

        //list.removeAtFirst();
        //list.removeAtEnd();
        //list.printNode();
        list.countNodes();
    }

}    