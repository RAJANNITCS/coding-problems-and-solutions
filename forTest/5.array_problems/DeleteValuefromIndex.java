// A java progarm from delete value from given index

import java.util.Scanner;

class DeleteValuefromIndex {
    int length = 0;
    int arr[] = null;
    int size = 0;

    void initializeArray(DeleteValuefromIndex obj) {
        Scanner intValue = new Scanner(System.in);
        System.out.println("Enter size of Array");
        obj.arr = new int[intValue.nextInt()];
        System.out.println("How many value you will enter");
        obj.length = intValue.nextInt();
        System.out.println("Enter array elements");
        for(int i = 0; i < obj.length; i++) {
            obj.arr[i] = intValue.nextInt();
        }
        intValue.close();
    }

    void display(DeleteValuefromIndex obj) {
        System.out.println("Array elements are");
        for(int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    void deleteValue(DeleteValuefromIndex obj) {
        int index = 0;
        Scanner intValue = new Scanner(System.in);
        System.out.println("Enter index for delete value from array");
        index = intValue.nextInt();

        if(index < obj.length) {
            for(int i = index; i < obj.length; i++) {
                obj.arr[i] = obj.arr[i + 1];
            }
            obj.length--;
        }else {
            System.out.println("Out of range");
        }
        
        intValue.close();
    }

    public static void main(String[] args) {
        DeleteValuefromIndex obj = new DeleteValuefromIndex();
        obj.initializeArray(obj);
        obj.display(obj);
        obj.deleteValue(obj);
        obj.display(obj);
    }
}