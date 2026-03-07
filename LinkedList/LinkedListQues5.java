// Ques 5 - Odd Even Linked List - We have a Linked List of integers,write a function to modify the linked list such that all even numbers appear before all the odd numbers in the modified linked list. Also, keep the order of even and odd numbers same

public class LinkedListQues5 {

    Node head;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null) {
            end = end.next;
        }

        Node new_end = end;

        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else {
            prev = curr;
        }

        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    void push(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQues5 ll = new LinkedListQues5();

        ll.push(11);
        ll.push(10);
        ll.push(9);
        ll.push(8);
        ll.push(6);
        ll.push(4);
        ll.push(13);
        ll.push(3);
        ll.push(2);
        ll.push(0);

        System.out.println("Linked List");
        ll.printList();

        ll.segregateEvenOdd();

        System.out.println("updated Linked List");
        ll.printList();
    }
}
