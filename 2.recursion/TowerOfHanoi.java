// A java program for solving tower of hanoi problem


class ToweOFHanoi {

    static void findTowerOfHanoi(int number,int towerA,int towerB,int towerC) {
        if( number > 0) {
            findTowerOfHanoi(number - 1, towerA, towerC, towerB);
            System.out.println("("+towerA+","+towerC+")");
            findTowerOfHanoi(number - 1, towerB, towerA, towerC);
        }
    }
    
    public static void main(String[] args) {
        int number = 3;
        int towerA = 1;
        int towerB = 2;
        int towerC = 3;
        findTowerOfHanoi(number,towerA,towerB,towerC);
    }
} 