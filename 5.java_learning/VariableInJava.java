// A java program for showing variable

public class VariableInJava {
    static int x = 11;
    private int y = 33;

    public void variableChange(int x) {
        VariableInJava obj = new VariableInJava();
        VariableInJava.x = 22;
        this.y = 44;

        // System.out.println("VariableInJava.x " + VariableInJava.x);
        // System.out.println("obj.x " + obj.x);
        System.out.println("obj.y " + obj.y);
        System.out.println("y" + this.y);
    }


    public static void main(String[] args) {
        VariableInJava obj = new VariableInJava();
        obj.variableChange(22);
    }
}