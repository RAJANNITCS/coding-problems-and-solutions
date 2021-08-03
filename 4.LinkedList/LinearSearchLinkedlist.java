// A java program for showing LinearSearch 

class LinearSearchLinkedlist {
    Node head = null;
    public int count = 0;

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
            return;
        }else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    Node linearSearchLinkedlist(int key) {
        if (head == null) {
            System.out.println("List is empty");
        }else {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.data == key) {
                    return currNode;
                }
                currNode = currNode.next;
            }
        }
        return null;
    }

    int linearSearchLinkedlistV2(int keyValue) {
        if (head == null) {
            System.out.println("List is empty");
        }else {
            Node currNode = head;
            int count = 0;
            while (currNode != null) {
                count++;
                if (currNode.data == keyValue) {
                    return count;
                }
                currNode = currNode.next;
            }
        }
        return 0;
    }

    Node linearSearchLinkedlistV3(Node currentNode, int keyValue) {
        if (currentNode == null) {
            return null;
        }else {
            if (currentNode.data == keyValue) {
                return currentNode;
            }
        }
        return linearSearchLinkedlistV3(currentNode.next, keyValue);
    }

    int linearSearchLinkedlistV4(Node currnetNode, int keyValue) {
        
        if (currnetNode == null) {
            return 0;
        }else {
            count++;
            if (currnetNode.data == keyValue) {
                int returnValue = count;
                count = 0;
                return returnValue;
            }
        }
        return linearSearchLinkedlistV4(currnetNode.next, keyValue);
    }

    public static void main(String[] args) {
        LinearSearchLinkedlist obj = new LinearSearchLinkedlist();
        obj.insertData(2);
        obj.insertData(4);
        obj.insertData(6);
        obj.insertData(8);
        obj.insertData(10);
        obj.display();
        // if (obj.linearSearchLinkedlist(8) == null) {
        //     System.out.println("Key value is not found in the list");
        // }else {
        //     System.out.println("key node is "+ obj.linearSearchLinkedlist(8));
        // }
        // if (obj.linearSearchLinkedlistV2(8) == 0) {
        //     System.out.println("KeyValue is not found in the list");
        // }else {
        //     System.out.println("key value position is " + obj.linearSearchLinkedlistV2(8));
        // }
        // if (obj.linearSearchLinkedlistV3(obj.head, 8) == null) {
        //     System.out.println("key value is not fount in the list");
        // }else {
        //     System.out.println("key value node is " + obj.linearSearchLinkedlistV3(obj.head, 8));
        // }
        if (obj.linearSearchLinkedlistV4(obj.head, 8) == 0) {
            System.out.println("key value is not there");
        }else {
            System.out.println("key value position is "+ obj.linearSearchLinkedlistV4(obj.head, 8));
        }
    }
}