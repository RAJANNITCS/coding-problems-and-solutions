// A java program for finding difference of two array

class DifferenceOfTwoArray {
    int arr_A[] = {3,6,9,12,15,19,24,10};
    int arr_B[] = {12,15,24,6,1,55,20};
    int temp[] = null;
    int tempLength = 0;

    public static void main(String[] args) {
        DifferenceOfTwoArray obj = new DifferenceOfTwoArray();
        obj.temp = obj.differenceOfTwoArray(obj);
        obj.displayOfArray(obj);
    }

    void displayOfArray(DifferenceOfTwoArray obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.tempLength; i++) {
            System.out.println(obj.temp[i]);
        }
    }

    int[] differenceOfTwoArray(DifferenceOfTwoArray obj) {
        int hashTable[] = new int[100];
        int temp[] = null;

        for (int i = 0; i < obj.arr_A.length; i++) {
            hashTable[obj.arr_A[i]] = 1;
        }

        for (int j = 0; j < obj.arr_B.length; j++) {
            if(hashTable[obj.arr_B[j]] == 1) {
                hashTable[obj.arr_B[j]] = 0;
            }
        }
        temp = new int[10];
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == 1) {
                temp[obj.tempLength] = i;
                obj.tempLength++;
            }
        }
        return temp;
    }
}