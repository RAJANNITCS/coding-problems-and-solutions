// A java program for showing enum

class EnumColor {

    public enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value;
        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // for (Season s: Season.values()) {
        //     System.out.println(s);
        // }
        // Season c1 = Season.WINTER;
        // System.out.println(c1);
        // System.out.println(Season.valueOf("WINTER"));
        // System.out.println(Season.valueOf("WINTER").ordinal());
        // System.out.println(Season.valueOf("SPRING").ordinal());
        for (Season s: Season.values()) {
            System.out.println(s + " " + s.value);
        }
    }
}