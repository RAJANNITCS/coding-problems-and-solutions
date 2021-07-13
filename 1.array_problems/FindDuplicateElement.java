// A java program for finding duplicate element

class FindDuplicateElement {
    int arr[] = { 2, 4, 6, 6, 9, 3, 5, 5, 2, 10, 10 };
    int temp[] = null;
    int tempLength = 0;

    public static void main(String[] args) {
        FindDuplicateElement obj = new FindDuplicateElement();
        obj.temp = obj.findDuplicateElement(obj);
        obj.displayOfArray(obj);
    }

    void displayOfArray(FindDuplicateElement obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.tempLength; i++) {
            System.out.println(obj.temp[i]);
        }
    }

    int[] findDuplicateElement(FindDuplicateElement obj) {
        int temp[] = null;
        int hashtable[] = null;
        int maxValue = obj.arr[0];

        for (int i = 0; i < obj.arr.length; i++) {
            if (obj.arr[i] > maxValue) {
                maxValue = obj.arr[i];
            }
        }
        hashtable = new int[maxValue + 1];
        for (int i = 0; i < obj.arr.length; i++) {
            hashtable[obj.arr[i]] += 1;
        }
        temp = new int[10];
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] > 1) {
                temp[obj.tempLength] = i;
                obj.tempLength++;
            }
        }
        return temp;
    }
}