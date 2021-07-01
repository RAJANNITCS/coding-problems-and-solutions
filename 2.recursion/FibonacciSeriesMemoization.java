// A java program for finding fibonacci number using memoization

class FibonacciSeriesMemoization {

    static int arr[] = new int[10];

    static int findFabonacciNumber(int number) {

        for(int i = 0; i < arr.length;i++) {
            arr[i] = -1;
        }

        if (number <= 1) {
            return number;
        }

        if (arr[number] != -1) {
            return arr[number];
        }else {
            arr[number] = findFabonacciNumber(number - 1) + findFabonacciNumber(number - 2);
            return arr[number];
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Fibonacci number is " + findFabonacciNumber(number));
    }
}