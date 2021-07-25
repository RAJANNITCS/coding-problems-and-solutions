// A java program for checking given string is Palindrome or not


class Palindrome {
    String s1 = "madam";

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        // if (obj.checkPalindrom(obj)) {
        //     System.out.println("String is palindrome");
        // }else {
        //     System.out.println("String is not palindrom");
        // }
        if (obj.checkPalindromNew(obj)) {
            System.out.println("String is parlindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }

    boolean checkPalindrom(Palindrome obj) {
        boolean isPalindrome = false;
        char c1[] = new char[obj.s1.length()];
        int i = 0;
        int j = obj.s1.length() - 1;
        while(i < obj.s1.length()) {
            c1[i] = obj.s1.charAt(j);
            i++;
            j--;
        }
        for(int k = 0; k < obj.s1.length(); k++) {
            if ((int)c1[k] == (int)obj.s1.charAt(k)) {
                isPalindrome = true;
            }else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
     }

     boolean checkPalindromNew(Palindrome obj) {
        boolean isPalindrome = false;
        int i = 0; 
        int j = obj.s1.length() - 1;
        while (i <= j) {
            if ((int)obj.s1.charAt(i) == (int)obj.s1.charAt(j)) {
                isPalindrome = true;
            }else {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
     }
}