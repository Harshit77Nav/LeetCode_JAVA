// import java.util.*;

public class ReverseLL {
    Node head;
    private int size;

    ReverseLL(){
        size = 0;
    }
    
    public class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
            System.out.println(size);
        }
        
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public void revLL(){
        if(head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            //update
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.revLL();
        list.printList();
    }
}
