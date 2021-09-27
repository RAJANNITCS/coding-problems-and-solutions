// A java code for showing Indirect recursion

class IndirectRecursion {

    static void funA(int number) {
        if(number > 0) {
            System.out.println("number is "+ number);
            funB(number - 1);
        }
    }

    static void funB(int number) {
        if(number > 0) {
            System.out.println("number is "+ number);
            funA(number/2);
        }
    }
        
 
    public static void main(String[] args) {
        int number = 20;
        funA(number);
    }
}