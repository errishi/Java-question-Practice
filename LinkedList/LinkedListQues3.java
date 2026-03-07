// Ques 3 - Swapping Nodes in a Linked List We have a linked list and two keys in it,swap nodes for two given keys. Nodes should be swapped by changing links.Swapping data of nodes may be expensive in many situations when data contains many fields. It may be assumed that all keys in the linked list are distinct.

public class LinkedListQues3 {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void swapNodes(int x, int y) {
        if (x == y) {
            return;
        }

        Node prevX = null, currX = head;

        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListQues3 ll = new LinkedListQues3();

        ll.push(7);
        ll.push(6);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);

        System.out.println("Linked List before");
        ll.printList();

        ll.swapNodes(4, 3);
        ll.swapNodes(6, 2);

        System.out.println("\nLinked List after swap");
        ll.printList();
    }
}
