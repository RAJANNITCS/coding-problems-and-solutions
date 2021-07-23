// A java program for checking string is valid
// for password or not


class ValidateString {
    String s1 = "rajan12@45";

    public static void main(String[] args) {
        ValidateString obj = new ValidateString();
        if (obj.validateString(obj)) {
            System.out.println("String valid");
        }else {
            System.out.println("String is not valid");
        }
    }

    boolean validateString(ValidateString obj) {
        boolean valid = false;
        if (obj.s1 != null && !obj.s1.isEmpty()) {
            for (int i = 0; i < obj.s1.length(); i++) {
                if ((((int)obj.s1.charAt(i)) >= 65 && ((int)obj.s1.charAt(i) <= 90)) || (((int)obj.s1.charAt(i) >= 97) && (int)obj.s1.charAt(i) <= 122) ||
                ((int)obj.s1.charAt(i) >= 48 && (int)obj.s1.charAt(i) <= 57)) {
                    valid = true;
                 }else {
                     valid = false;
                     return false;
                 }
            }
            return valid;
         }
         return valid;

    }
}