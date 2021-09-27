// A java program for showing lift shift and lift rotation.

import java.util.Scanner;

class LiftShiftAndRotation {
    int size = 0;
    int length = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        LiftShiftAndRotation obj = new LiftShiftAndRotation();
        obj.initailizeArray(obj);
        obj.displayArray(obj);
        // System.out.println("The shift value is "+ obj.shiftLift(obj));
        obj.rotateLift(obj);
        obj.displayArray(obj);
    }

    void initailizeArray(LiftShiftAndRotation obj) {
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

    void displayArray(LiftShiftAndRotation obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    int shiftLift(LiftShiftAndRotation obj) {
        int temp = 0;
        if (obj.arr[0] != 0) {
            temp = obj.arr[0];
        }
        for (int i = 0; i < obj.length; i++) {
            obj.arr[i] = obj.arr[i + 1];
        }
        obj.length--;
        return temp;
    }

    void rotateLift(LiftShiftAndRotation obj) {
        int temp = 0;
        if (obj.arr[0] != 0) {
            temp = obj.arr[0];
        }

        for (int i = 0; i < obj.length - 1; i++) {
            obj.arr[i] = obj.arr[i + 1];
        }
        obj.arr[obj.length - 1] = temp;
    }
}