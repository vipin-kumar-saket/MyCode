package DSA;

import org.w3c.dom.Node;
import java.util.*;

class LL{
    Node head;
    class Node {
        String data;
        Node next;

         Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

//    add first  new string using linked list
    public  void addFirst(String data){
        Node newNode= new Node(data);
        if(head ==null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

//    add in last new string  using linked list

    public void addLast(String data) {
        Node newNode = new Node(data);


        if(head == null) {
            head = newNode;
            return;
        }


        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }


        lastNode.next = newNode;
    }


    //    This code for print the string
    public void print_list(){
        if(head== null)
        {
            System.out.println("List is empty");
            return;

        }
        Node CNode=head;
        while (CNode != null)
        {
            System.out.print(CNode.data + "->");
            CNode=CNode.next;
        }
        System.out.println("Null");

    }
        }
public class linked_list_s {
    public static void main(String[] args) {
        LL list= new LL();
        list.addFirst("may name");
        list.addFirst("is");
        list.print_list();


        list.addLast("vipin");
        list.addFirst("kumar");
        list.print_list();

    }
}
