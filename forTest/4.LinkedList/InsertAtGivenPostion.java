// A java prostion for showing insert node at 
// given position

class InsertAtGivenPosition {
    Node head = null;
    int length = 0;

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
            length++;
        }else {
            Node tailNode = head;
            while (tailNode.next != null)  {
                tailNode = tailNode.next;
            }
            tailNode.next = newNode;
            length++;
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

    void insertAtGivenPosition(int position, int dataValue) {
        if (position > length || position < 0) {
            System.out.println("Enter valid position");
        }
        Node newNode = new Node(dataValue);
        Node currNode = head;
        int count = 0;
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }else {
            while (currNode != null) {
                count++;
                if (count == position) {
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                }
                currNode = currNode.next;
            }
        }
    }

    void insertAtGivenPositionV2(int position, int dataValue) {
        if (position > length || position < 0) {
            System.out.println("Enter valid positions");
        }
        Node newNode = new Node(dataValue);
        Node currNode = head;
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }else {
            for (int i = 0; i < position - 1; i++) {
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
    }

    public static void main(String[] args) {
        InsertAtGivenPosition obj = new InsertAtGivenPosition();
        obj.insertData(2);
        obj.insertData(4);
        obj.insertData(6);
        obj.insertData(8);
        obj.insertData(10);
        obj.display();
        // obj.insertAtGivenPosition(5, 12);
        obj.insertAtGivenPositionV2(0, 12);
        obj.display();
    }
}