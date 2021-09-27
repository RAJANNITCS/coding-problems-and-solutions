// A java program for checking two string are same or not

class ComparingTwoString {
    String s1 = "painter";
    String s2 = "paintere";

    public static void main(String[] args) {
        ComparingTwoString obj = new ComparingTwoString();
        if (obj.comparingTwoString(obj)) {
            System.out.println("String is same");
        }else {
            System.out.println("String is not same");
        }
    }

    boolean comparingTwoString(ComparingTwoString obj) {
        boolean isSame = false;
        if (obj.s1.length() != obj.s2.length()) {
            return isSame;
        }
        for (int i = 0; i < obj.s1.length(); i++) {
            if ((int)obj.s1.charAt(i) == (int)obj.s2.charAt(i)) {
                isSame = true;
            }else {
                isSame = false;
                break;
            }
        }
        return isSame;
    }
}