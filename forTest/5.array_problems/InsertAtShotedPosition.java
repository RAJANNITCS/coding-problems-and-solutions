// A java progarm insert value at shorted position

import java.util.Scanner;

class InsertAtShotedPosition {
    int size = 0;
    int length = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        InsertAtShotedPosition obj = new InsertAtShotedPosition();
        obj.initailizeArray(obj);
        obj.display(obj);
        // obj.insertAtShortedPosition(obj);
        // obj.insertAtShotedPositionNewApproch(obj);
        obj.insertAtShotedPositionNewApprochTwo(obj);
        obj.display(obj);
    }

    void initailizeArray(InsertAtShotedPosition obj) {
        System.out.println("Enter size of array");
        obj.size = obj.intValue.nextInt();
        obj.arr = new int[obj.size];
        System.out.println("How many value you will enter");
        obj.length = obj.intValue.nextInt();
        System.out.println("Enter array elements");
        for (int i = 0; i < obj.length; i++) {
            obj.arr[i] = obj.intValue.nextInt();
        }
    }

    void display(InsertAtShotedPosition obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    void insertAtShortedPosition(InsertAtShotedPosition obj) {
        int value = 0;
        int index = 0;
        System.out.println("Enter value for insert at shorted position");
        value = obj.intValue.nextInt();
        for (int i = 0; i < obj.length; i++) {
            if (obj.arr[i] < value && obj.arr[i + 1] > value) {
                index = i;
                break;
            }
        }

        for (int j = obj.length; j > index; j--) {
            obj.arr[j] = obj.arr[j - 1];
        }
        obj.arr[index + 1] = value;
        obj.length++;
    }

    void insertAtShotedPositionNewApproch(InsertAtShotedPosition obj) {
        int value = 0;
        System.out.println("Enter value for inserting at shoted positon");
        value = obj.intValue.nextInt();
        for(int i = obj.length - 1; i > 0; i--) {
            if (obj.arr[i] > value) {
                obj.arr[i + 1] = obj.arr[i];
            }else {
                obj.arr[i + 1] = value;
                break;
            }
        }
        obj.length++;
    }

    void insertAtShotedPositionNewApprochTwo(InsertAtShotedPosition obj) {
        int value = 0;
        int i = obj.length - 1;
        System.out.println("Enter value for inserting at shoted position");
        value = obj.intValue.nextInt();
        while (obj.arr[i] > value) {
            obj.arr[i + 1] = obj.arr[i];
            i--;
        }
        obj.arr[i + 1] = value;
        obj.length++;
    }
}