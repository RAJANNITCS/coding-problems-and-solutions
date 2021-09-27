// A java code for showing Tail recursion into loop


class TailRecursionLoop{

    static void fun(int number) {

        while(number > 0) {
            System.out.println("number is " + number);
            number --;  
        }
    }

    public static void main(String[] args) {
        int number = 5;
        fun(number);
    }
}