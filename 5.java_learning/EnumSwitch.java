// A java program for showing enum in switch 


class EnumSwitch {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        Day day = Day.SUNDAY;

        switch(day) {
            case SUNDAY:
                System.out.println("Today is sunday");
                break;
            case MONDAY:
                System.out.println("Today is monday");
                break;
            case TUESDAY:
                System.out.println("Today is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is thursday");
                break;
            case FRIDAY:
                System.out.println("Today is friday");
                break;
            case SATURDAY:
                System.out.println("Today is saturday");
                break;
            default:
                System.out.println("Today is other day");
                break;
        }
    }
}