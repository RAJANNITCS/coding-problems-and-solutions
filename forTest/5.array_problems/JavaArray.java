// A java program for showing java Array 

class JavaArray {

    static void printArray(int arr[]) {
        for(int i: arr) {
            System.out.println(i);
        }
    }

    static int[] returnArray(int size) {
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // int arr[] = {1,2,3,4,5};
        // printArray(new int[]{1,2,3,4,5,6});
        // for(int i= 0; i < arr.length; i++) {
        //     arr[i] = i;
        // }
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // for(int i : arr) {
        //     System.out.println(i);
        // }

        // int size = 6;
        // int arr[] = returnArray(size);
        // for(int i : arr) {
        //     System.out.println(i);
        // }

        // int[][] arr
        // int [][]arr
        // int arr[][]
        // int []arr[]

        // int arr[][] = new int[3][3];
        // int number = 1;
        // for(int i= 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length ; j ++) {
        //         arr[i][j] = number;
        //         number++;
        //     }
        // }
        
        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length;j++) {
        //         System.out.println(arr[i][j]);
        //     }
        // }

        // int arr[][] = new int[3][];

        // arr[0] = new int[3];
        // arr[1] = new int[4];
        // arr[2] = new int[5];

        // int number = 0;
        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = number;
        //         number++;
        //     }
        // }

        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         System.out.println(arr[i][j]);
        //     }
        // }

        // int arr[] = {1,2,3,4,5,6};
        
        // System.out.println(arr.getClass());

        char copyFrom[] = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char copyTo[] = new char[7];

        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(String.valueOf(copyTo));
    }
}