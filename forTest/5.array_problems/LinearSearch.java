// A java program for showing linearSearch

import java.util.Scanner;

class LinearSearch {
    int length = 0;
    int size = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        int index = 0;
        LinearSearch obj = new LinearSearch();
        obj.initializeArray(obj);
        obj.display(obj);
        // index = obj.linearSearchLoop(obj);
        // index = obj.transposition(obj);
        index = obj.moveToFrontOrhead(obj);
        if (index < 0) {
            System.out.println("The key value is not found");
        } else {
            System.out.println("The index is " + index);
        }

        // index = obj.transposition(obj);
        index = obj.moveToFrontOrhead(obj);
        if (index < 0) {
            System.out.println("The key value is not found");
        } else {
            System.out.println("The index is " + index);
        }
    }

    void initializeArray(LinearSearch obj) {
        System.out.println("Enter size of array");
        obj.size = obj.intValue.nextInt();
        obj.arr = new int[obj.size];
        System.out.println("How many value you will enter");
        obj.length = obj.intValue.nextInt();
        System.out.println("Enter Array value");
        for (int i = 0; i < obj.length; i++) {
            obj.arr[i] = obj.intValue.nextInt();
        }
    }

    void display(LinearSearch obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    int linearSearchLoop(LinearSearch obj) {
        int keyValue = 0;
        System.out.println("Enter key value for search");
        keyValue = obj.intValue.nextInt();
        for (int i = 0; i < obj.length; i++) {
            if (obj.arr[i] == keyValue) {
                return i;
            }
        }
        return -1;

    }

    int transposition(LinearSearch obj) {
        int keyValue = 0;
        System.out.println("Enter value for serarching");
        keyValue = obj.intValue.nextInt();
        for (int i = 0; i < obj.length; i++) {
            if (obj.arr[i] == keyValue) {
                int temp = 0;
                temp = obj.arr[i];
                obj.arr[i] = obj.arr[i - 1];
                obj.arr[i - 1] = temp;
                return i;
            }
        }
        return -1;
    }

    int moveToFrontOrhead(LinearSearch obj) {
        int keyValue = 0;
        System.out.println("Enter value for searching");
        keyValue = obj.intValue.nextInt();
        for (int i = 0; i < obj.length; i++) {
            if (obj.arr[i] == keyValue) {
                int temp = obj.arr[i];
                obj.arr[i] = obj.arr[0];
                obj.arr[0] = temp;
                return i;
            }
        }
        return -1;
    }
}