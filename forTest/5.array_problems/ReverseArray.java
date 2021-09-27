// A java program for revers Array

import java.util.Scanner;

class ReverseArray {
    int size = 0;
    int length = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.initailizeArry(obj);
        obj.displayArray(obj);
        obj.reverseArray(obj);
        // obj.reverseArrayUsingArray(obj);
        obj.displayArray(obj);
    }

    void initailizeArry(ReverseArray obj) {
        System.out.println("Enter size of Array");
        obj.size = obj.intValue.nextInt();
        obj.arr= new int[obj.size];
        System.out.println("How many value you will enter ?");
        obj.length = obj.intValue.nextInt();
        System.out.println("Enter Array elements");
        for (int i = 0; i < obj.length; i++) {
            obj.arr[i] = obj.intValue.nextInt();
        }
    }

    void displayArray(ReverseArray obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    void reverseArray(ReverseArray obj) {
        int startingAddress = 0;
        int endingAddress = obj.length - 1;

        while (startingAddress <= endingAddress) {
            int temp = obj.arr[startingAddress];
            obj.arr[startingAddress] = obj.arr[endingAddress];
            obj.arr[endingAddress] = temp;
            startingAddress++;
            endingAddress--; 
        }
    }

    void reverseArrayUsingArray(ReverseArray obj) {
        int tempArr[] = new int[obj.length];
        int startPoint = 0; 
        int endPoint = obj.length - 1;
        while (startPoint < obj.length) {
            tempArr[startPoint] = obj.arr[endPoint];
            startPoint++;
            endPoint--;
        }
        startPoint = 0;
        while (startPoint < obj.length) {
            obj.arr[startPoint] = tempArr[startPoint]; 
            startPoint++;
        }
    }
    
}
