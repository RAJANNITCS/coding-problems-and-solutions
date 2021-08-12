// A java program for showing loop in java


class LoopInJava {

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    void printNumber() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    void forLoop() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    void forLoopV2() {
        for(int i: this.arr) {
            System.out.println(i);
        }
    }

    void doWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i <=10);
    }

    void InfiniteLoop() {
        for ( ; ; ) {
            System.out.println("is it infinit loop");
        }
    }

    void MultipaleVariableInLoop() {
        int j = 10;
        int i = 0;
        for (i = 1, j = 10; i <= j; i ++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        LoopInJava obj = new LoopInJava();
        // obj.printNumber();
        // obj.forLoop();
        // obj.forLoopV2();
        // obj.doWhileLoop();
        // obj.InfiniteLoop();
        obj.MultipaleVariableInLoop();
    }
}