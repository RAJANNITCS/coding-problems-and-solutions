// A java porgram for showing insert a at shorted 
//position

class InsertAtShortedPosition {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertData(int data) {
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
            System.out.println("List is empty");
        }else {
            Node currNode = head;
            while (currNode != null) {
                System.out.println(currNode.data);
                currNode = currNode.next;
            }
        }
    }

    void insertAtShortedPosition(int dataValue) {
        Node currNode = head;
        Node newNode = new Node(dataValue);
        Node tailNode = null;

        if (currNode.data > dataValue) {
            newNode.next = currNode;
            head = newNode;
        }else {
            while (currNode!= null && currNode.data < dataValue) {
                tailNode = currNode;
                currNode = currNode.next;
            }
            newNode.next = tailNode.next;
            tailNode.next = newNode;
        }
    }

    public static void main(String[] args) {
        InsertAtShortedPosition obj = new InsertAtShortedPosition();
        obj.insertData(2);
        obj.insertData(4);
        obj.insertData(6);
        obj.insertData(8);
        obj.insertData(10);
        obj.display();
        obj.insertAtShortedPosition(12);
        obj.display();
    }
}