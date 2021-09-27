import java.util.StringTokenizer;

// A java program for counting number of words in a string

class NumberOfWordsInString {
    String s1 = "  How many words in a string ";

    public static void main(String[] args) {
        NumberOfWordsInString obj = new NumberOfWordsInString();
        // System.out.println("Number of words in this given string "+ obj.numberOfWordsInString(obj));
        // System.out.println("Number of words in this given string "+ obj.numberOfWordsInStringUsingSpit(obj));
        System.out.println("Number of words in this given string " + obj.numberOfWordsInStringUsingStringTokenizer(obj));
    }

    // without using any api or methods
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

    // By using split method
    int numberOfWordsInStringUsingSpit(NumberOfWordsInString obj) {
        if (obj.s1 == null && obj.s1.isEmpty()) {
            return 0;
        }

        String words[] = obj.s1.split("\\s+");

        return words.length;
    }

    // by using StringTokenizer
    int numberOfWordsInStringUsingStringTokenizer(NumberOfWordsInString obj) {
        if (obj.s1 == null && obj.s1.isEmpty()) {
            return 0;
        }

        StringTokenizer tokens = new StringTokenizer(obj.s1);
        return tokens.countTokens();
    }
    
}