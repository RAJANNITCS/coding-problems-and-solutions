// A java program for showing is 
// required forward declaration in java


class ForwardDeclarations {
    public static void main(String[] args) {
       Test obj = new Test();
       obj.printValue(5);
    }   
}

class Test{
        
    void printValue(int data) {
        System.out.println(data);
    }
}