// A java program for finding sum of pair (A + B = K);

class FindPairOfSum {
    int arr[] = {6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
    int value = 10;
    
    public static void main(String[] args) {
        FindPairOfSum obj = new FindPairOfSum();
        obj.findPairOfSum(obj, obj.value);
    }

    void findPairOfSum(FindPairOfSum obj,int value) {
        int maxValue = obj.arr[0];
        int hashTable[] = null;
        int b = 0;
        for (int i = 0; i < obj.arr.length; i++) {
            if (maxValue < obj.arr[i]) {
                maxValue = obj.arr[i];
            }
        }
        hashTable = new int[maxValue + 1];
        for (int i = 0; i < obj.arr.length; i++) {
            hashTable[obj.arr[i]] = 1;
        }
        for (int i = 0; i < obj.arr.length; i++) {
            b = value - obj.arr[i];
            if (b > 0 && hashTable[b] == 1) {
                System.out.printf("%d + %d = %d\n", obj.arr[i], b, obj.arr[i] + b);
            }
        }
    }
}