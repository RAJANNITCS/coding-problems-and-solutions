// A java program for showing move to front

class MoveToFront {
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
            while(currNode != null) {
                System.out.println(currNode.data);
                currNode = currNode.next;
            }
        }
    }

    int moveToFront(int keyValue) {
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        }
        int count = 0;
        if (head.data == keyValue) {
            count++;
            return count;
        }
        
        Node currentNode = head;
        Node tailNode = null;
        while (currentNode != null) {
            count++;
            if (currentNode.data == keyValue) {
                tailNode.next = currentNode.next;
                currentNode.next = head;
                head = currentNode;
                return count;
            }
            tailNode = currentNode;
            currentNode = currentNode.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        MoveToFront obj = new MoveToFront();
        obj.insertData(2);
        obj.insertData(4);
        obj.insertData(6);
        obj.insertData(8);
        obj.insertData(10);
        obj.display();
        System.out.println("key value position is " + obj.moveToFront(4));
        obj.display();
    }
}