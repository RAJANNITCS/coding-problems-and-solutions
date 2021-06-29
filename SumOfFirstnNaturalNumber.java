// A java programa for showing sum of first 'n' Natural number

class SumOfFirstnNaturalNumber {

    static int sumOfNaturalNumber(int number) {
        if(number > 0) {
            return sumOfNaturalNumber(number - 1) + number; 
        }

        return 0;
    }

    static int sumOfNaturalNumberUsingFormula(int number) {
        return  number * (number + 1) / 2;
    }

    static int sumOfNaturalNumberUsingLoop(int number) {
        int sum = 0;
        for(int i = 1; i <= number ; i++) {
            sum = sum + i;
        } 
        return sum;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Sum of first n natural number "+sumOfNaturalNumber(number));
        System.out.println("Sum of first n natural number using formula "+ sumOfNaturalNumberUsingFormula(number));
        System.out.println("Sum of first n natural number using loop "+ sumOfNaturalNumberUsingLoop(number));
    }
}