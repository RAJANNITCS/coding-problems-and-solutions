// A java program for counting vowel and consonents

class CountVowelAndConsonents {
    String s1 = "How many words are consonents and vowels";
    int vowels = 0;
    int consonents = 0;

    public static void main(String[] args) {
        CountVowelAndConsonents obj = new CountVowelAndConsonents();
        obj.countVowelAndConsonents(obj);
        System.out.println("vowels are " + obj.vowels + " consonent are " + obj.consonents);
    }

    void countVowelAndConsonents(CountVowelAndConsonents obj) {
        for (int i = 0; i < obj.s1.length(); i++) {
            if (((int) obj.s1.charAt(i) == 97 || (int) obj.s1.charAt(i) == 101 || (int) obj.s1.charAt(i) == 105
                    || (int) obj.s1.charAt(i) == 111 || (int) obj.s1.charAt(i) == 117)
                    || ((int) obj.s1.charAt(i) == 65 || (int) obj.s1.charAt(i) == 69 || (int) obj.s1.charAt(i) == 73
                            || (int) obj.s1.charAt(i) == 79 || (int) obj.s1.charAt(i) == 85)) {
                obj.vowels++;
            } else {
                if (((int) obj.s1.charAt(i) >= 65 && (int) obj.s1.charAt(i) <= 97)
                        || ((int) obj.s1.charAt(i) >= 90 && (int) obj.s1.charAt(i) <= 122)) {
                    obj.consonents++;
                }
            }
        }
    }
}