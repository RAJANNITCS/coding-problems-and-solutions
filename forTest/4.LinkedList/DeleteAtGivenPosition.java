// A java program for delete Node at given position

class DeleteAtGivenPosition {
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

    void deleteAtGivenPosition(int position) {
        Node currNode = head;
        Node tailNode = null;
        if (position == 0) {
            head = head.next;
            currNode.next = null;
        }else {
            for (int i = 0; i < position - 1; i++) {
                tailNode = currNode;
                currNode = currNode.next;
            }
            tailNode.next = currNode.next;
            currNode.next = null;
        }
    }

    public static void main(String[] args) {
        DeleteAtGivenPosition obj = new DeleteAtGivenPosition();
        obj.insertData(2);
        obj.insertData(4);
        obj.insertData(6);
        obj.insertData(8);
        obj.insertData(10);
        obj.display();
        obj.deleteAtGivenPosition(5);
        obj.display();
    }
}