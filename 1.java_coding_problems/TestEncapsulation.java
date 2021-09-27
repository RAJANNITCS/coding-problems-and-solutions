// A java program for showing Encapsulation

class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation("rajan", 16, 30);
        System.out.println("Studant name"+ obj.getStudantName());
        System.out.println("Studant rollNo"+ obj.getStudantRollNo());
        System.out.println("Studant age"+ obj.getStudantAge());
    }
}