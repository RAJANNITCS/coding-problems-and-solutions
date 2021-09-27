// A java program for finding Get Set Min Max Sum Avg

import java.util.Scanner;

class GetSetMinMaxSumAvg {
    int length = 0;
    int size = 0;
    int arr[] = null;
    Scanner intValue = new Scanner(System.in);

    public static void main(String[] args) {
        GetSetMinMaxSumAvg obj = new GetSetMinMaxSumAvg();
        obj.initailizeArray(obj);
        obj.display(obj);
        // System.out.println("Index is "+ obj.getValue(obj));
        // if (obj.setValue(obj) == 0) {
        //     System.out.println("Set value successfully");
        // }else {
        //     System.out.println("unsuccessfully set value");
        // }
        // obj.display(obj);

        // System.out.println("Max value is "+ obj.findMaxValueFromArray(obj));
        // System.out.println("Min value is "+ obj.findMinValueFromArray(obj));

        System.out.println("Sum of the value is " + obj.findSumOfArray(obj));
        System.out.println("Avg of the value is " + obj.findAvgOfArray(obj));

    }

    void initailizeArray(GetSetMinMaxSumAvg obj) {
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

    void display(GetSetMinMaxSumAvg obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.arr[i]);
        }
    }

    int getValue(GetSetMinMaxSumAvg obj) {
        int index = 0;
        System.out.println("Enter index for finding value");
        index = obj.intValue.nextInt();
        if (index < obj.length) {
            return obj.arr[index];
        }else {
            System.out.println("Out of range");
        }
        return -1;
    }

    int setValue(GetSetMinMaxSumAvg obj) {
        int index = 0;
        int value = 0;
        System.out.println("Enter index and value for set in array");
        index = obj.intValue.nextInt();
        value = obj.intValue.nextInt();
        if (index < obj.length) {
            obj.arr[index] = value;
            return 0;
        }
        return -1;
    }

    int findMaxValueFromArray(GetSetMinMaxSumAvg obj) {
        int max = obj.arr[0];
        for (int i = 0; i < obj.length; i++) {
            if (max < obj.arr[i]) {
                max = obj.arr[i];
            }
        }
        return max;
    }

    int findMinValueFromArray(GetSetMinMaxSumAvg obj) {
        int min = obj.arr[0];
        for (int i = 0; i < obj.length; i++) {
            if (min > obj.arr[i]) {
                min = obj.arr[i];
            }
        }

        return min;
    }

    int findSumOfArray(GetSetMinMaxSumAvg obj) {
        int sum = 0;
        for (int i = 0; i < obj.length; i++) {
            sum = sum + obj.arr[i];
        }
        return sum;
    }

    double findAvgOfArray(GetSetMinMaxSumAvg obj) {
        double sum = 0;
        for (int i = 0; i < obj.length; i++) {
            sum = sum + obj.arr[i];
        }

        return (sum/obj.length);
    }
}