// A java program for finding duplicate character from string

class FindDuplicateCharacter {
    String s1 = "Finding";

    public static void main(String[] args) {
        FindDuplicateCharacter obj = new FindDuplicateCharacter();
        // obj.findDuplicateCharacter(obj);
        obj.findDuplicateCharacterNew(obj);
    }

    // hash table size 150
    void findDuplicateCharacter(FindDuplicateCharacter obj) {
        int hashTable[] = new int[150];
        for (int i = 0; i < obj.s1.length(); i++) {
            hashTable[(int) obj.s1.charAt(i)] += 1;
        }
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] > 1) {
                System.out.println("Duplicate character is " + (char) i + " how many time " + hashTable[i]);
            }
        }
    }

    // has table size is reduce AMAP
    void findDuplicateCharacterNew(FindDuplicateCharacter obj) {
        int minValue = (int) obj.s1.charAt(0);
        int maxValue = (int) obj.s1.charAt(0);
        int hashTable[] = null;
        for (int i = 0; i < obj.s1.length(); i++) {
            if (maxValue < (int)obj.s1.charAt(i)) {
                maxValue = (int) obj.s1.charAt(i);
            }
            if (minValue > (int) obj.s1.charAt(i)) {
                minValue = (int) obj.s1.charAt(i);
            }
        }
        hashTable = new int[(maxValue - minValue) + 1];
        for (int i = 0; i < obj.s1.length(); i++) {
            hashTable[((int)obj.s1.charAt(i)) - minValue] += 1;
        }
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] > 1) {
                System.out.println("Duplicate character is " + (char)(i + minValue) + " Number of time " + hashTable[i]);
            }
        }
     }

}