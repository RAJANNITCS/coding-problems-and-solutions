// A java program for showing array is shorted or not

class CheckArrayShorted {
    int arr[] = {2,4,6,8,10,12,14};

    public static void main(String[] args) {
        CheckArrayShorted obj = new CheckArrayShorted();
        if (obj.checkArrayShorted(obj)) {
            System.out.println("Array is shorted");
        }else {
            System.out.println("Array is not shorted");
        }

    }

    boolean checkArrayShorted(CheckArrayShorted obj) {
        for (int i = 1; i < obj.arr.length; i++) {
            if (obj.arr[i] < obj.arr[i - 1]) {
               return false;
            }
        }
        return true;
    }
}