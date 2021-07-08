// A java program for inserting value at given position 

import java.util.Scanner;

class InisertInArray {
    int length = 0;
    int arr[] = null;

    void initializeArray(InisertInArray obj) {
        int length = 0;
        System.out.println("Enter size of array");
        Scanner intValue = new Scanner(System.in);
        obj.arr = new int[intValue.nextInt()];
        System.out.println("How many value you will enter");
        length = intValue.nextInt();
        System.out.println("Enter array elements");
        for(int i = 0; i < length; i++) {
            obj.arr[i] = intValue.nextInt();
            obj.length++;
        }
    }

    void display(InisertInArray obj) {
        System.out.println("Array elements are");
        for(int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    void insert(InisertInArray obj) {
        int index = 0;
        int value = 0;
        Scanner intValue = new Scanner(System.in);
        System.out.println("Enter index and value for insert in array");
        index = intValue.nextInt();
        value = intValue.nextInt();
        for(int i = obj.length; i > index; i--) {
            obj.arr[i] = obj.arr[i - 1];
        }
        obj.arr[index] = value;
        obj.length++;
    }

    public static void main(String[] args) {
        InisertInArray obj = new InisertInArray();
        obj.initializeArray(obj);
        obj.display(obj);
        obj.insert(obj);
        obj.display(obj);
    }
}