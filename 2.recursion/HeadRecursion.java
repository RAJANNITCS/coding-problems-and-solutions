// A java program for showing Head Recursion

class HeadRecursion {

    static void fun(int number) {
        if(number > 0) {
            fun(number - 1);
            System.out.println("number is "+ number);
        }
    }

    public static void main(String [] args) {
        int number = 5;
        fun(number);
    }
}