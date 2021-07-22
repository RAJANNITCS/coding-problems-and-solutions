// A java program for counting number of words in a string

class NumberOfWordsInString {
    String s1 = "How many words in a string ";

    public static void main(String[] args) {
        NumberOfWordsInString obj = new NumberOfWordsInString();
        System.out.println("Number of words in this given string "+ obj.numberOfWordsInString(obj));
    }

    int numberOfWordsInString(NumberOfWordsInString obj) {
        boolean state = true;
        int wordCount = 0;

        for (int i = 0; i < obj.s1.length(); i++) {
            if (obj.s1.charAt(i) == ' ' || obj.s1.charAt(i) == '\n' || obj.s1.charAt(i) == '\t') {
                state = true;
            }else if (state == true) {
                state = false;
                wordCount++;
            }
        }

        return wordCount;
    }
}