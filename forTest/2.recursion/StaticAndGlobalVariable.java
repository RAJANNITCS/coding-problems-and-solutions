// A java program for showing static and global variable work in recusion

class StaticAndGlobalVariable {

    static int value = 0;

    // static int printValue(int number) {
    //     if(number > 0) {
    //         return printValue(number - 1) + number;
    //     }

    //     return 0;
    // }

    static int printValue(int number) {
       
        if(number > 0) {
            value ++;
            return printValue(number - 1) + value; 
        }

        return 0;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Value is "+ printValue(number));
    }
}