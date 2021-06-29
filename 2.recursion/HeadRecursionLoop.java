// A java code for convert head recursion into loop 

class HeadRecursionLoop {

    static void fun(int number) {
        int temp = 1;
        while(temp <= number) {
           
            System.out.println("temp is "+ temp);
            temp++;
        }
    }

    public static void main(String[] args) {
        int number = 3;
        fun(number);
    }
}