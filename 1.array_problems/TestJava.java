// A java program for using testing perpose

class TestJava {
    int value = 0;

    void changeValue(TestJava obj) {
        obj.value = 10;
    }

    public static void main(String[] args) {
        TestJava test = new TestJava();
        test.changeValue(test);
        System.out.println(test.value);
    }
}