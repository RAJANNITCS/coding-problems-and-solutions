// A java program for showing RightShift and RightRotation

import java.util.Scanner;

class RightShiftAndRotation {
    int size = 0;
    int length = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        RightShiftAndRotation obj = new RightShiftAndRotation();
        obj.initailizeArray(obj);
        obj.displayOfArray(obj);
        // System.out.println("Right shift value is " + obj.rightShift(obj));
        obj.rightrotation(obj);
        obj.displayOfArray(obj);
    }

    void initailizeArray(RightShiftAndRotation obj) {
        System.out.println("Enter size of Array");
        obj.size = obj.intValue.nextInt();
        obj.arr = new int[obj.size];
        System.out.println("How many value you will enter");
        obj.length = obj.intValue.nextInt();
        System.out.println("Enter array element");
        for (int i = 0; i < obj.length; i++) {
            obj.arr[i] = obj.intValue.nextInt();
        }
    }

    void displayOfArray(RightShiftAndRotation obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    int rightShift(RightShiftAndRotation obj) {
        int temp = 0;
        if (obj.arr[obj.length - 1] != 0) {
            temp = obj.arr[obj.length - 1];
        }
        for (int i = obj.length - 1; i > 0; i--) {
            obj.arr[i] = obj.arr[i - 1];
        }
        obj.arr[0] = 0;
        return temp;
    }

    void rightrotation(RightShiftAndRotation obj) {
        int temp = 0;
        if (obj.arr[obj.length - 1] != 0) {
            temp = obj.arr[obj.length - 1];
        }
        for (int i = obj.length - 1; i > 0; i--) {
            obj.arr[i] = obj.arr[i - 1];
        }
        obj.arr[0] = temp;
    }
}