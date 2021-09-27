// A java program for showing binary search

import java.util.Scanner;

class BinarySearch {
    int length = 0;
    int size = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        int keyValue = 0;
        BinarySearch obj = new BinarySearch();
        obj.initializeArray(obj);
        obj.display(obj);
        // System.out.println("index is "+obj.binarySearchItrative(obj));
        System.out.println("Enter key value for search");
        keyValue = obj.intValue.nextInt();
        System.out.println("index is "+ obj.binarySearchRecursive(obj, 0, obj.length, keyValue));

    }

    void initializeArray(BinarySearch obj) {
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

    void display(BinarySearch obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    int binarySearchItrative(BinarySearch obj) {
        int low = 0;
        int high = obj.length;
        int keyValue = 0;
        int mid = 0;
        System.out.println("Enter key value for search");
        keyValue = obj.intValue.nextInt();
        while (low <= high) {
            mid = (low + high) / 2;
            if (obj.arr[mid] == keyValue) {
                return mid;
            } else if (obj.arr[mid] < keyValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    int binarySearchRecursive(BinarySearch obj, int low, int high, int keyValue) {
        int mid = 0;
        if (low <= high) {
            mid = (low + high) / 2;
            if (obj.arr[mid] == keyValue) {
                return mid;
            }else if (obj.arr[mid] < keyValue) {
                return binarySearchRecursive(obj,mid + 1,high,keyValue);
            }else {
                return binarySearchRecursive(obj, low, mid - 1, keyValue);
            }
        }
        return -1;
    }
}
