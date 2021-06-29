// A java for showing NestedRecursion

class NestedRecursion {

    static int fun(int number) {
        if(number > 100) {
            return number - 10;
        }else {
            return fun(fun(number + 11));
        }
    }
    
    public static void main(String[] args) {
        int number = 95;
        System.out.println("Function return "+ fun(number));
    }
}