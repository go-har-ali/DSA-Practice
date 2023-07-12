package Mid_Practice;

public class mergeLists {

    Node head;
    Node head2;
    public class Node{
        Node next;
        int data;

        Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    public void firstList(int data){
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

    public void secondList(int data){
        Node n2 = new Node(data);

        //Node secondHead = head;
        if(head2 == null){
            n2.data = data;
            head2 = n2;
        }
        else{
            n2.data = data;
            n2.next = head2;
            head2 = n2;
        }
    }

    public void mergeLinkedLists(){
        Node temp = head;
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
        mergeLists l = new mergeLists();
        
        l.firstList(1);
        l.firstList(2);
        l.firstList(3);
        l.firstList(4);

        l.secondList(5);
        l.secondList(6);
        l.secondList(7);
        l.secondList(8);

        l.mergeLinkedLists();

        l.traverseList();

    }
}
