// A java program for finding Exponent function

class ExponentFunction {

    static int findExponent(int number, int power) {
        int sum = 1;
        for(int i = 1; i <= power ; i++) {
            sum = sum * number;
        }

        return sum;
    }

    static int findExponentUsingRecursion(int number, int power) {
        if(power > 0) {
            return findExponentUsingRecursion(number, power -1) * number;
        }
        return 1;
    }

    public static void main(String[] args) {
        int number = 2;
        int power = 4;
        System.out.println("Result of the function is " + findExponent(number,power));
        System.out.println("Result of the recursion function is " + findExponentUsingRecursion(number, power));
    }
}