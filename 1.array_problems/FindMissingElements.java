// A java progarm for finding missing element from array

class FindMissingElements {
    int arr[] = {2,4,6,8,10,12,14,16,18,20};
    int temp[] = null;
    int tempLength = 0;

    public static void main(String[] args) {
        FindMissingElements obj = new FindMissingElements();
        obj.temp = obj.findMissingElements(obj);
        obj.displayOfArray(obj);
    }

    void displayOfArray(FindMissingElements obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.tempLength; i++) {
            System.out.println(obj.temp[i]);
        }
    }

    int[] findMissingElements(FindMissingElements obj) {
        int minValue = obj.arr[0];
        int maxValue = obj.arr[0];
        int hashTable[] = null;
        int temp[] = null;
        int numberOfElements = 0;

        for (int i = 0; i < obj.arr.length; i++) {
            if (obj.arr[i] < minValue) {
                minValue = obj.arr[i];
            }

            if (obj.arr[i] > maxValue) {
                maxValue = obj.arr[i];
            }
        }

        hashTable = new int[maxValue + 1];
        for (int i = 0; i < obj.arr.length; i++) {
            hashTable[obj.arr[i]] = 1;
        }
        for (int i = minValue; i <= maxValue; i++) {
            if (hashTable[i] == 0) {
                numberOfElements++;
            }
        }
        temp = new int[numberOfElements];
        for (int i = minValue; i <= maxValue; i++) {
            if (hashTable[i] == 0) {
                temp[obj.tempLength] = i;
                obj.tempLength++;
            }
        }
        return temp;
    }
}
