// A java program for toggle alphabate

class ToggleAlphabate {
    char c1[] = {'w', 'E', 'l', 'C', 'o', 'M', 'e'};
    char temp[] = null;

    public static void main(String[] args) {
        ToggleAlphabate obj = new ToggleAlphabate();
        obj.temp = obj.toggleAlphabate(obj);
        obj.displayOfArray(obj);
    }

    void displayOfArray(ToggleAlphabate obj) {
        System.out.println("Array elements are");
        for (int i = 0; i < obj.temp.length; i++) {
            System.out.println(obj.temp[i]);
        }
    }

    char[] toggleAlphabate(ToggleAlphabate obj) {
        char temp[] = new char[obj.c1.length];
        for (int i = 0; i < obj.c1.length; i++) {
            if (((int)c1[i]) >= 65 && ((int)c1[i]) <= 90) {
                temp[i] = (char)((int)c1[i] + 32);
            }else if (((int)c1[i] >= 97 && (int)c1[i] <= 122)) {
                temp[i] = (char)((int)c1[i] - 32);
            }
        }
        return temp;
    }
}