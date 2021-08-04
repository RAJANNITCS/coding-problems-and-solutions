// A java program for checklist is shoted or not

class CheckListIsShoted {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
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

    boolean checkListIsShoted() {
        int dataValue = head.data;
        Node currNode = head;
        while(currNode != null) {
            if (currNode.data < dataValue) {
                return false;
            }
            dataValue = currNode.data;
            currNode = currNode.next;
           
        }
        return true;
    }

    public static void main(String[] args) {
        CheckListIsShoted obj = new CheckListIsShoted();
        obj.inisertData(2);
        obj.inisertData(4);
        obj.inisertData(16);
        obj.inisertData(8);
        obj.inisertData(10);
        if (obj.checkListIsShoted()) {
            System.out.println("List is shorted");
        }else {
            System.out.println("List is not shorted");
        }
    }
}