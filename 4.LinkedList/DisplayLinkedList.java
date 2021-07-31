// A java program for showing display Linkedlist


public class DisplayLinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertDataINLinkedList(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }else {
            Node tailNode = head;
            while (tailNode.next != null) {
                tailNode = tailNode.next;
            }

            tailNode.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("list is empty");
        }else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {
        DisplayLinkedList obj = new DisplayLinkedList();
        obj.insertDataINLinkedList(1);
        obj.insertDataINLinkedList(2);
        obj.insertDataINLinkedList(3);
        obj.insertDataINLinkedList(4);
        obj.insertDataINLinkedList(5);
        obj.display();
    }
}