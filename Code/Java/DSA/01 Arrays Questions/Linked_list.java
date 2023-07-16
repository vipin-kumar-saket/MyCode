public class Linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;

        public void addFirst(int data) {
            // Step 1 --> Create a new node
            Node newNode = new Node(data);
            // Here we check the node id empty or not
            if (head == null) {
                head = tail = newNode;
                return;
            }
            // Step 2 --> assign the head in the new Node
            // like this  newNode  next= head

            newNode.next = head;

            // Step 3 -->  head = newNode
            head = newNode;
        }

        public void addLast(int data) {
            // Step 1 --> Create a new node
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            // Step 2 -->  tail.next=newNode
            tail.next = newNode;
            // Step 3 --> Change the tail
            tail = newNode;

        }
        public void print (){
            if(head==null){
                System.out.print("Linked list is empty");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data +"=>");
                temp=temp.next;
            }
            System.out.println("Null");

        }


    public static void main(String[] args) {
        Linked_list ll = new Linked_list();
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addFirst(6);
        ll.print();
        ll.addLast(1);
        ll.print();

    }
}
