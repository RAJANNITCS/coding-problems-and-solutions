// A Java code for showing Tree Recursion

class TreeRecursion {

    static void fun(int number) {
        if(number > 0) {
            
            System.out.println("number is "+ number);
            fun(number - 1);
            fun(number - 1);
        }
    }

    public static void main(String[] args) {
        int number = 3;
        fun(number);
    }
}