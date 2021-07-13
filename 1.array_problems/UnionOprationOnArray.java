// A java program for perform union opration on array


class UnionOprationOnArray {
    int arr_1[] = {2,4,6,8,10,12,14};
    int arr_2[] = {3,6,9,12,15,18,21,24,27,30};
    int temp_arr[] = null;
    int tempLength = 0;

    public static void main(String[] args){
        UnionOprationOnArray obj = new UnionOprationOnArray();
        // obj.temp_arr = obj.unionOprationOnArray(obj);
        // obj.temp_arr = obj.unionOprationOnArrayNew(obj);
        obj.temp_arr = obj.unionOprationOnArrayThiredApp(obj);
        obj.displayOfArray(obj);
    }

    void displayOfArray(UnionOprationOnArray obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.tempLength; i++) {
            System.out.println(obj.temp_arr[i]);
        }
    }

    // if array is unshoted

    int[] unionOprationOnArray(UnionOprationOnArray obj) {
        int temp_arr[] = new int[obj.arr_1.length + obj.arr_2.length];
        for (int i = 0; i < obj.arr_1.length; i++) {
            temp_arr[obj.tempLength] = obj.arr_1[i];
            obj.tempLength++;
        }

        for (int i = 0; i < obj.arr_2.length; i++) {
            int value = 0;
            for (int j = 0; j < obj.tempLength; j++) {
                if (obj.arr_2[i] != temp_arr[j]) {
                    value = 0;
                }else {
                    value = 1;
                    break;
                }
            }
            if (value == 0) {
                temp_arr[obj.tempLength] = obj.arr_2[i];
                obj.tempLength++;
            }
        }
        return temp_arr;
    }

    // if array is unshoted

    int[] unionOprationOnArrayNew(UnionOprationOnArray obj) {
        int hashLength = 0;
        int hashTable[] = new int[100];
        int temp[] = null;
        for (int i = 0; i < obj.arr_1.length; i++) {
            if(hashTable[obj.arr_1[i]] != 1) {
                hashTable[obj.arr_1[i]] = 1;
                hashLength++;
            }
        }
        for (int i = 0; i < obj.arr_2.length; i++) {
            if (hashTable[obj.arr_2[i]] != 1) {
                hashTable[obj.arr_2[i]] = 1;
                hashLength++;
            }
        }
        temp = new int[hashLength];
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == 1) {
                temp[obj.tempLength] = i;
                obj.tempLength++;
            }
        }
        return temp;
    }

    // if array is shorted

    int[] unionOprationOnArrayThiredApp(UnionOprationOnArray obj) {
        int temp[] = new int[obj.arr_1.length + obj.arr_2.length];
        int i = 0;
        int j = 0;
        while (i < obj.arr_1.length) {
            if (obj.arr_1[i] < obj.arr_2[j]) {
                temp[obj.tempLength] = obj.arr_1[i];
                i++;
                obj.tempLength++;
            }else if (obj.arr_2[j] < obj.arr_1[i]) {
                temp[obj.tempLength] = obj.arr_2[j];
                j++;
                obj.tempLength++;
            }else {
                temp[obj.tempLength] = obj.arr_1[i];
                obj.tempLength++;
                j++;
                i++;
            }
        }
        while (i < obj.arr_1.length) {
            temp[obj.tempLength] = obj.arr_1[i];
            i++;
            obj.tempLength++;
        }
        while (j < obj.arr_2.length) {
            temp[obj.tempLength] = obj.arr_2[j];
            j++;
            obj.tempLength++;
        }
        return temp;
    }
}