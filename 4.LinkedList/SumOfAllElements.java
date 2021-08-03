// A java program for add all elements in the list

class SumOfAllElements {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertNode(int data) {
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
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // using itrative version
    int sumOfAllElements() {
        int sumValue = 0;
        Node currNode = head;
        while (currNode != null) {
            sumValue += currNode.data;
            currNode = currNode.next;
        }
        return sumValue;
    }

    // using recursive version
    int sumOfAllElementsRec(Node current) {
        if (current == null) {
            return 0;
        }else {
            return sumOfAllElementsRec(current.next) + current.data;
        }
    }


    public static void main(String[] args) {
        SumOfAllElements obj = new SumOfAllElements();
        obj.insertNode(2);
        obj.insertNode(4);
        obj.insertNode(6);
        obj.insertNode(8);
        obj.insertNode(10);

        obj.display();
        // System.out.println("Sum of all elements is " + obj.sumOfAllElements());
        System.out.println("Sum of all elements is " + obj.sumOfAllElementsRec(obj.head));
    }
}