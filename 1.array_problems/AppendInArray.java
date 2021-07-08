// A java program for append data in array 

import java.util.Scanner;

class AppendInArray {
    int length = 0;
    int size = 10;
    int arr[] = new int[size];

    void initializeDataInArray(AppendInArray obj) {
        int value = 0;
        Scanner intValue = new Scanner(System.in);
        System.out.println("How many value you will enter");
        value = intValue.nextInt();
        if(value < obj.arr.length) {
            System.out.println("Enter array elements");
            for(int i = 0;i < value; i++) {
                obj.arr[i] = intValue.nextInt();
                obj.length++;
            }
        }else {
            System.out.println("Out of rang");
        }
        intValue.close();
       
    }

    void append(AppendInArray obj) {
        int value = 0;
        Scanner intValue = new Scanner(System.in);
        System.out.println("Enter value for append");
        value = intValue.nextInt();
        obj.arr[obj.length] = value;
        obj.length++;
        intValue.close();
    }

    void displayArray(AppendInArray obj) {
        System.out.println("Array Elements are");
        for(int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        } 
    }

    public static void main(String[] args) {
        AppendInArray obj = new AppendInArray();
        obj.initializeDataInArray(obj);
        obj.displayArray(obj);
        obj.append(obj);
        obj.displayArray(obj);
    }
}