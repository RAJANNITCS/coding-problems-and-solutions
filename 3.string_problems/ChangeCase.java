// A java program for Change upper case to lower case

class ChangeCase {
    char c1[] = {'W', 'E', 'L', 'C', 'O', 'M', 'E'};
    char temp[] = null;

    public static void main(String[] args) {
        ChangeCase obj = new ChangeCase();
        obj.temp = obj.changeCase(obj);
        obj.dispayOfArray(obj);
    }

    void dispayOfArray(ChangeCase obj) {
        System.out.println("Array elements are");
        System.out.println(obj.temp); 
    }

    char[] changeCase(ChangeCase obj) {
        char temp[] = new char[obj.c1.length];
        for (int i = 0; i < obj.c1.length; i++) {
            temp[i] = (char)(obj.c1[i] + 32);
        }
        return temp;
    }
}