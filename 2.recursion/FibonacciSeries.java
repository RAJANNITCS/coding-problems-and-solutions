// A java for showing fabonacci Series till given value

class FibonacciSeries {

    // for recuraion global variable
    static int value_1 = 0;
    static int value_2 = 1;
    static int sum = 0;

    static void findFabonacciSeries(int number) {
        int value_1 = 0;
        int value_2 = 1;
        for(int i = 1; i <= number ; i++) {
            int sum = value_1 + value_2;
            System.out.println(sum);
            value_1 = value_2;
            value_2 = sum;
        }
    }

    static void findFabonacciSeriesRecursion(int number) {
       
        if(number > 0) {
            sum = value_1 + value_2;
            System.out.println(sum);
            value_1 = value_2;
            value_2 = sum;
            findFabonacciSeriesRecursion(number - 1);
        }
       
    }
    public static void main(String[] args) {
        int number = 10;
        // findFabonacciSeries(number);
        // findFabonacciSeriesRecursion(number);
    }
}