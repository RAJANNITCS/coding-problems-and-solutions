// A java program to print hello world

class PrintHelloWorld {

    static void fun(int number) {
        if(number > 0) {
            System.out.println("Hello World");
            fun(number -1);
        }
    }

    public static void main(String[] args) {
        int number = 4;
        fun(number);
    }
}