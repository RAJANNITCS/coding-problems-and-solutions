import jdk.internal.org.objectweb.asm.tree.analysis.Value;

// A java program for showing final variable 

class FinalVariable {
    final int value;
    value = 10;

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        System.out.println(obj.value);
    }
}