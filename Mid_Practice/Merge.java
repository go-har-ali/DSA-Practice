package Mid_Practice;

public class Merge {
    Node head;
    public class Node{
        Node next;
        int data;

        Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    public void addAtFirst(int data){
        Node n = new Node(data);
        if(head == null){
            n.data = data;
            head = n;
        }
        else{
            n.data = data;
            n.next = head;
            head = n;
        }
    }


    public void mergeLinkedLists(Node head1, Node head2){
        Node temp = head1;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head2; 
    }

    public void traverseList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        Merge l1 = new Merge();
        Merge l2 = new Merge();
        l1.addAtFirst(1);
        l1.addAtFirst(2);
        l1.addAtFirst(3);
        l1.addAtFirst(4);

        l2.addAtFirst(5);
        l2.addAtFirst(6);
        l2.addAtFirst(7);
        l2.addAtFirst(8);
        l2.addAtFirst(9);

        
        l2.mergeLinkedLists(l1.head, l2.head);
        l1.traverseList();

    }
}
