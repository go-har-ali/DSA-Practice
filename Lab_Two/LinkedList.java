package Lab_Two;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class LinkedList {
    Node head, tail;
    public class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            System.out.print("List is Empty \n");
        }
        else{
            System.out.print("\nList is not Empty");
        }
        return true;
    }

    public void addAtFirst(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            tail = n;
        }
        else if(head.next == null){
            n.next = head;
            //n.next = tail;
            head = n;
        }
        else{
            n.next = head;
            head = n;
        }
    }

    int size = 0;
    public void sizeOfList(){
        Node counter = head;
        while(counter.next != null){
            size ++;
            counter = counter.next;
        }
        size = size+1;
        System.out.print("\nSize of LinkedList is : " + size);
    }

    public int firstNodeData(){
        System.out.print("\nFirst Node's Data : " + head.data + "\n");
        return head.data;
    }

    public void addAtPosition(int data){
        Node temp = head;
        Node n = new Node(data);
        while(temp.next.data != 5){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    public void addAtLast(int data){
        Node n = new Node(data);
        //Node temp = head;
        System.out.println();
        if(tail.next == null){
            tail.next = n;
            tail = n;
        }
    }

    public void removeFirst(){
        if(head == null){
            System.out.print("List is Empty");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            head = head.next;
        }
    } 
    
    public int lastNodeData(){
        System.out.println("\nLast Node's Data : " + tail.data);
        return tail.data;
    }

    public void printList(){
        Node temp = head;
        if(head == null){
            System.out.print("List is Empty");
        }
        else{
            while(temp.next != null){
                System.out.print(temp.data);
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.isEmpty();
        list.addAtFirst(1);
        list.addAtFirst(2);
        list.addAtFirst(3);
        //list.addAtFirst(4);
        list.addAtFirst(5);
        list.addAtFirst(6);
        list.printList();
        list.isEmpty();
        list.sizeOfList();

        list.addAtPosition(4);

        list.firstNodeData();
        //list.removeFirst();

        //System.out.println();
        list.printList();

        list.addAtLast(7);
        list.printList();
        //System.out.print(value);

        list.lastNodeData();
    }
}
