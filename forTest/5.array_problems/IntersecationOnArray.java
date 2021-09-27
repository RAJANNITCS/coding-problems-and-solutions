// A java program for perform intersecation on array 
// if array is shorted or not

class IntersecationOnArray {
    int arr_1[] = {12,35,2,4,5,19};
    int arr_2[] = {21,2,19,5,10,20,30};
    int temp[] = null;
    int tempLength = 0;

    public static void main(String[] args) {
        IntersecationOnArray obj = new IntersecationOnArray();
        obj.temp = obj.intersecationOnArray(obj);
        obj.displayOfArray(obj);
    }

    void displayOfArray(IntersecationOnArray obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.tempLength; i++) {
            System.out.println(obj.temp[i]);
        }
    }

    int[] intersecationOnArray(IntersecationOnArray obj) {
        int hashTable[] = new int[100];
        int hashTableLength = 0;
        int temp[] = null;
        for (int i = 0; i < obj.arr_1.length; i++) {
            hashTable[obj.arr_1[i]] = 1;
        }
        for (int i = 0; i < obj.arr_2.length; i++) {
            if (hashTable[obj.arr_2[i]] == 1) {
                hashTable[obj.arr_2[i]] +=1;
                hashTableLength++;
            }
        }
        temp = new int[hashTableLength];
        for(int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] > 1) {
                temp[obj.tempLength] = i;
                obj.tempLength++;
            }
        }
        return temp;
    }
}