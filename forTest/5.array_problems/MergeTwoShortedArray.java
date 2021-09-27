// A java program for mergeing two shorted array

class MergeTwoShortedArray {
    int arr_1[] = {2,4,6,8,10,12,14};
    int arr_2[] = {3,6,9,12,15,18,21,24,27,30};
    int temp_arr[] = null;

    public static void main(String[] args) {
        MergeTwoShortedArray obj = new MergeTwoShortedArray();
        obj.temp_arr = obj.mergeTwoShortedArray(obj);
        obj.displayOfArray(obj);
    }

    void displayOfArray(MergeTwoShortedArray obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.temp_arr.length; i++) {
            System.out.println(obj.temp_arr[i]);
        }
    }

    int[] mergeTwoShortedArray(MergeTwoShortedArray obj) {
        int temp_arr[] = new int[obj.arr_1.length + obj.arr_2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < obj.arr_1.length) {
            if (obj.arr_1[i] < obj.arr_2[j]) {
                temp_arr[k] = obj.arr_1[i];
                k++;
                i++;
            }else if (obj.arr_2[j] < obj.arr_1[i]) {
                temp_arr[k] = obj.arr_2[j];
                k++;
                j++;
            }else {
                temp_arr[k] = obj.arr_1[i];
                k++;
                temp_arr[k] = obj.arr_2[j];
                j++;
            }
        }
        while (i < obj.arr_1.length) {
            temp_arr[k] = obj.arr_1[i];
            k++;
            i++;
        }
        while (j < obj.arr_2.length) {
            temp_arr[k] = obj.arr_2[j];
            k++;
            j++;
        }
        return temp_arr;
    }
}
