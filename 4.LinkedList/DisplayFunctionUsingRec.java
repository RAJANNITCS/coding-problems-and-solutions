// A java program for display linkedlist

class DisplayFunctionUsingRec {
    Node head = null;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertDataInLinkedlist(int data) {
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

    void display(Node currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode.data);
            display(currentNode.next);
        }
    }

    public static void main(String[] args) {
        DisplayFunctionUsingRec obj = new DisplayFunctionUsingRec();
        obj.insertDataInLinkedlist(1);
        obj.insertDataInLinkedlist(2);
        obj.insertDataInLinkedlist(3);
        obj.insertDataInLinkedlist(4);
        obj.insertDataInLinkedlist(5);
        obj.display(obj.head);
    }
}