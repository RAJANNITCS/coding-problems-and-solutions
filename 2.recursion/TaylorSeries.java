// A java program for finding taylor serise

class TaylorSeries {

    static double pow = 1;
    static double fac = 1;
    static double value = 1;

    static double findTaylorSerise(double number, double power) {
        double value = 0;

        if(power > 0) {
            value = findTaylorSerise(number, power -1);
            pow = pow * number;
            fac = fac * power;

            return value + (pow/fac);
        }
        return 1;
    }

    static double findTaylorSeriseNew(double number,double power) {
        
        if (power > 0) {
            value = 1 + number/power * value;
            findTaylorSeriseNew(number, power - 1);
        }
        return value;
    }

    static double findTaylorSeriseUsingLoop(double number, double power) {
        double value = 1;
        for(;power > 0 ; power--) {
            value = 1 + number/ power * value;
        }
        return value;
    }

    public static void main(String[] args) {
        double number = 3;
        double power = 10;
        System.out.println("The result of taylor serise is " + findTaylorSerise(number, power));
        System.out.println("The result of taylor serise is " + findTaylorSeriseNew(number,power));
        System.out.println("The result of taylor serise is " + findTaylorSeriseUsingLoop(number, power)); 
    }
}