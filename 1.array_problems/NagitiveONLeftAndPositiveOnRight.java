// A java program for showing all nagitive element value on 
// left side and 
// positive on right side

import java.util.Scanner;

class NagitiveONLeftAndPositiveOnRight {
    int size = 0;
    int length = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        NagitiveONLeftAndPositiveOnRight obj = new NagitiveONLeftAndPositiveOnRight();
        obj.initailizeOfArray(obj);
        obj.display(obj);
        obj.changeValue(obj);
        obj.display(obj);
    }

    void initailizeOfArray(NagitiveONLeftAndPositiveOnRight obj) {
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

    void display(NagitiveONLeftAndPositiveOnRight obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    void changeValue(NagitiveONLeftAndPositiveOnRight obj) {
        int i = 0;
        int j = obj.length - 1;
        while (i < j) {
            if (obj.arr[i] < 0) {
                i++;
            }else if (obj.arr[j] > 0) {
                j--;
            }else if (obj.arr[i] > 0 && obj.arr[j] < 0) {
                int temp = obj.arr[i];
                obj.arr[i] = obj.arr[j];
                obj.arr[j] = temp;
            }
        }
    }
}