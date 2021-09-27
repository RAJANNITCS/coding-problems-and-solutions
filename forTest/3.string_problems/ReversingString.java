// A java program for reversing string

class ReversingString {
    String s1 = "rajan singh";

    public static void main(String[] args) {
        ReversingString obj = new ReversingString();
        obj.s1 = obj.reversingString(obj);
        System.out.println("reversing string "+ obj.s1);
    }

    String reversingString(ReversingString obj) {
        char c1[] = new char[obj.s1.length()];
        int i = 0;
        int j = obj.s1.length() - 1;

        for (; j >= 0; j--,i++) {
            c1[i] = obj.s1.charAt(j);
        }

        String s2 = String.valueOf(c1);
        return s2;
    }
}