package Mid_Practice;

import javax.swing.text.StyledEditorKit;

//import java.util.*;

public class insertAfterSearch {
    
    Node head;
    //Node head2;
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
            //n.data = data;
            head = n;
        }
        else{
            //n.data = data;
            n.next = head;
            head = n;
        }
    }

    public void insertAtEnd(int data){
        Node curr = head;
        Node n = new Node(data);
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
    }

    public void insertAfter(int data){
        Node temp = head;

        Node n = new Node(data);
        while(temp.data != 4){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    int count = 0;
    public void traverseList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            count = count+1;
        }
    }

    
    int mid ;
    
    public void insertAtMiddle(int data){
        mid = count/2;
        //int counter = 1;
        System.out.print(mid);
        Node n = new Node(data);
        Node curr = head;
        // while(curr != null){
        //     if(counter == mid){
        //         n.data = data;
        //         n.next = curr.next;
        //         curr.next = n;
        //     }
        //     counter ++;
        //     curr = curr.next;
        // }
        for(int i=1; i<mid; i++){
            curr = curr.next;
        }
        n.next = curr.next;
        curr.next = n;
    }
    public void printReverse(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        printReverse(head.next);
        System.out.println(head.data);
    }
    public static void main(String args[]){
        insertAfterSearch l = new insertAfterSearch();

         
        // l.firstList(3);
        // l.firstList(4);
        // l.firstList(6);
        // l.firstList(7);
        
        //l.insertAtEnd(2);
        l.firstList(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.insertAtEnd(6);
        l.insertAtEnd(7);
        l.insertAtEnd(8);

        //l.insertAfter(5);

        //l.traverseList();
        l.traverseList();
       l.insertAtMiddle(1);
       //System.out.println("count ==");
        System.out.println(l.mid);
       l.traverseList();
    //    l.printReverse(l.head);
       
        
    }
}
