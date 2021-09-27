// A java program for showing delete duplicate elements from list

class DeleteDuplicateElement {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void inisertData(int data) {
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

    void deleteDuplicateElement() {
        Node currNode = head;
        Node tailNode = currNode;
        while (currNode != null) {
            if (currNode.data == tailNode.data) {
                tailNode.next = currNode.next;
                currNode = currNode.next;
            }else {
                tailNode = currNode;
                currNode = currNode.next;
            }
        }
    }

    public static void main(String[] args) {
        DeleteDuplicateElement obj = new DeleteDuplicateElement();
        obj.inisertData(3);
        obj.inisertData(5);
        obj.inisertData(5);
        obj.inisertData(8);
        obj.inisertData(8);
        obj.inisertData(8);
        System.out.println("List are..");
        obj.display();
        System.out.println("Modifi list are...");
        obj.deleteDuplicateElement();
        obj.display();
    }
}