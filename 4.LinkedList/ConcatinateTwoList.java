// A java program for concatinate two linkedlist 


class ConcatinateTwoList {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node (int data) {
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

    void concatinateTwoList(ConcatinateTwoList obj_1, ConcatinateTwoList obj_2) {
        Node currNode = obj_1.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = obj_2.head;
    }

    public static void main(String[] args) {
        ConcatinateTwoList obj_1 = new ConcatinateTwoList();
        ConcatinateTwoList obj_2 = new ConcatinateTwoList();
        obj_1.insertData(2);
        obj_1.insertData(4);
        obj_1.insertData(6);
        obj_1.insertData(8);
        obj_1.insertData(10);
        obj_1.display();
        obj_2.insertData(3);
        obj_2.insertData(9);
        obj_2.insertData(12);
        obj_2.insertData(15);
        obj_2.insertData(18);
        obj_2.display();
        obj_1.concatinateTwoList(obj_1, obj_2);
        System.out.println("Print list one");
        obj_1.display();
    }
}