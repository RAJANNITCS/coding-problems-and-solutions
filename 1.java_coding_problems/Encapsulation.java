class Encapsulation {

    private String studantName;
    private int    studantRollNo;
    private int studantAge;

    Encapsulation(String name, int rollNo, int age) {
        this.studantName = name;
        this.studantRollNo = rollNo;
        this.studantAge = age;
    }

    public String getStudantName() {
        return this.studantName;
    }

    public void setStudantName(String name) {
        this.studantName = name;
    }

    public int getStudantRollNo() {
        return this.studantRollNo;
    }

    public void setStudantRollNo(int rollNo) {
        this.studantRollNo = rollNo;
    }

    public int getStudantAge() {
        return this.studantAge;
    }

    public void setStudantAge(int age) {
        this.studantAge = age;
    }
}