// A java program for reverse linkedlist 

class ReverseLinkedlist {
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

    void displayList() {
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

    void reverseLinkedlistUseingArray() {
        Node currNode = head;
        int i = 0;
        int arr_1[] = new int[5];
        while (currNode != null) {
            arr_1[i] = currNode.data;
            i++;
            currNode = currNode.next;
        }
        currNode = head;
        i--;
        while (currNode != null) {
            currNode.data = arr_1[i];
            i--;
            currNode = currNode.next;
        }
    }

    void reverseLinkedlistUsingSlidPointer() {
        Node p = head;
        Node  q = null;
        Node r = null;

        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
    }

    public static void main(String[] args) {
        ReverseLinkedlist obj = new ReverseLinkedlist();
        obj.insertData(2);
        obj.insertData(4);
        obj.insertData(6);
        obj.insertData(8);
        obj.insertData(10);
        obj.displayList();
        // obj.reverseLinkedlistUseingArray();
        obj.reverseLinkedlistUsingSlidPointer();
        System.out.println("Print list in reverse");
        obj.displayList();
    }
}