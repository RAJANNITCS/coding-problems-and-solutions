// A java program for finding maxmum value form list

class FindMinMaxAve {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node (int data) {
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
        if (head == null) {
            System.out.println("List is empty");
        }else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    int findMax() {
        Node current = head;
        int maxValue = head.data;
        while (current != null) {
            if (current.data > maxValue) {
                maxValue = current.data;
            }
            current = current.next;
        }
        return maxValue;
    }

    int findMin() {
        Node current = head ;
        int minValue = head.data;
        while (current != null) {
            if (current.data < minValue) {
                minValue = current.data;
            }
            current = current.next;
        }
        return minValue;
    }

    double findAve() {
        Node current = head;
        int count = 0;
        double sum = 0;
        while (current != null) {
            sum += current.data;
            count++;
            current = current.next;
        }
        return (sum / count);
    }

    public static void main(String[] args) {
        FindMinMaxAve obj = new FindMinMaxAve();
        obj.insertNode(2);
        obj.insertNode(4);
        obj.insertNode(6);
        obj.insertNode(8);
        obj.insertNode(10);
        obj.display();
        // System.out.println("Max value is "+ obj.findMax());
        // System.out.println("Min value is " + obj.findMin());
        System.out.println("Average of the list is "+ obj.findAve());
    } 
}