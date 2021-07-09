// A java program for showing linearSearch

import java.util.Scanner;

class LinearSearch {
    int length = 0;
    int size = 0;
    int arr[] = null;

    void initializeArray(LinearSearch obj) {
        Scanner intValue = new Scanner(System.in);
        System.out.println("Enter size of array");
        obj.size = intValue.nextInt();
        obj.arr = new int[obj.size];
        System.out.println("How many value you will enter");
        obj.length = intValue.nextInt();
        System.out.println("Enter Array value");
        for(int i = 0; i < obj.length; i++) {
            obj.arr[i] = intValue.nextInt();
        }
        intValue.close();
    }

    void display(LinearSearch obj) {
        System.out.println("Array elements are");
        for(int i = 0 ; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    int linearSearchLoop(LinearSearch obj) {
        int keyValue = 0;
        Scanner intValueNew = new Scanner(System.in);
        System.out.println("Enter key value for search");
        keyValue = intValueNew.nextInt();
        intValueNew.close();
        for(int i = 0; i < obj.length; i++) {
            if (obj.arr[i] == keyValue) {
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int index = 0;
        LinearSearch obj = new LinearSearch();
        obj.initializeArray(obj);
        obj.display(obj);
        index = obj.linearSearchLoop(obj);
        if(index < 0) {
            System.out.println("The key value is not found");
        }else {
            System.out.println("The index is "+ index);
        }
    }
}