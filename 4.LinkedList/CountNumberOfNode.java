// A java program for geating number of node

class CountNumberOfNode {
    Node head = null;
    int count = 0;

    class Node {
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

    void displayLinkedlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    int countNumberOfNode() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    int countNumberOfNodeV2(Node current) {
        if (current != null) {
            count++;
            countNumberOfNodeV2(current.next);
        }
        return count;
    }

    int countNumberOfNodeV3(Node current) {
        if (current == null) {
            return 0;
        }else {
            return 1 + countNumberOfNodeV3(current.next);
        }
    }

    public static void main(String[] args) {
        CountNumberOfNode obj = new CountNumberOfNode();
        obj.insertDataInLinkedlist(2);
        obj.insertDataInLinkedlist(4);
        obj.insertDataInLinkedlist(6);
        obj.insertDataInLinkedlist(8);
        obj.insertDataInLinkedlist(10);

        // obj.displayLinkedlist();
        // System.out.println("Number of node is " + obj.countNumberOfNode());
        // System.out.println("Number of node is "+ obj.countNumberOfNodeV2(obj.head));
        System.out.println("number of node is " + obj.countNumberOfNodeV3(obj.head));
    }
}     