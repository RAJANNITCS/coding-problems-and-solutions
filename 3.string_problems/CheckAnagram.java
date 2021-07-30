// A java program for checking given staring is anagram or not

class CheckAnagram {
    String s1 = "decimal";
    String s2 = "medical";

    public static void main(String[] args) {
        CheckAnagram obj = new CheckAnagram();
        if (obj.checkAnagramOrNot(obj)) {
            System.out.println("String is anagram");
        }else {
            System.out.println("String is not anagram");
        }
    }

    boolean checkAnagramOrNot(CheckAnagram obj) {
        if (obj.s1.length() != obj.s2.length()) {
            return false;
        }
        boolean isAnagram = false;
        int hashTable[] = new int[150];
        for (int i = 0; i < obj.s1.length(); i++) {
            hashTable[(int) obj.s1.charAt(i)] = 1;
        }
        for (int i = 0; i < obj.s2.length(); i++) {
            if (hashTable[obj.s2.charAt(i)] == 1) {
                isAnagram = true;
            }else {
                isAnagram = false;
            }
        }
        return isAnagram;
    }
}