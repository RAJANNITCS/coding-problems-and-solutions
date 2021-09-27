// java code showing Tail Recuresion

class TailRecursion {

    static void fun(int number) {
        if(number > 0) {
            System.out.println("number is "+ number);
            fun(number - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        fun(number);
    }
}