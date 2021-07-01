// A java program for showing NCR formula

class NCRFormula {

    static int fac(int number) {
        if(number > 0) {
            return fac(number - 1) * number;
        }
        return 1;
    }

    static int findNCRResult(int n,int r) {
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        t1 = fac(n);
        t2 = fac(r);
        t3 = fac(n - r);
        return t1/ (t2 * t3);
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println("Result of ncr formula " + findNCRResult(n,r));
    }
}