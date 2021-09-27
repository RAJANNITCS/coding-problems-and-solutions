// A java program for print finbonacci number of given number

class FibonacciSeriesOfGivenValue {

    static int findFibonacciNumber(int number) {
        if(number <= 1) {
            return number;
        }else {
            return findFibonacciNumber(number - 2) + findFibonacciNumber(number - 1);
        }
    }

    static int findFibonacciNumberItrativefun(int number) {
        int value_1 = 0;
        int value_2 = 1;
        int sum = 0;
        for(int i = 1; i < number; i++) {
            sum = value_1 + value_2;
            value_1 = value_2;
            value_2 = sum;
        }
        return sum;

    }
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Fibonacci number is "+findFibonacciNumber(number)); 
        System.out.println("Fibonacci number is "+findFibonacciNumberItrativefun(number));
    }
}