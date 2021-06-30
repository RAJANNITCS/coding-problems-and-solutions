// A java program for finding factoral of number

class FactorialOfNumber {

    static int findFactorial(int number) {
        if(number > 0) {
            return findFactorial(number - 1) * number;
        }

        return 1;
    }

    static int findfactorialUsingLoop(int number) {
        int sum = 1;
        for(; number > 0; number--) {
            sum = sum * number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println("Factorial of Given number " + findFactorial(number));
        System.out.println("Factorial of Given number using loop " + findfactorialUsingLoop(number));
    }
}