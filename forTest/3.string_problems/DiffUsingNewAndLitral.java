// A java program for showing difference between 
// buy createing string using new or litrel


class DiffUsingNewAndLitral {

    public static void main(String[] args) {
        String animal_1 = new String("Dog");
        String animal_2 = new String("Dog");
        String animal_5 = "Dog";
        // String animal_3 = "cat";
        // String animal_4 = "cat";
        System.out.println(animal_1 == animal_2);
        // System.out.println(animal_3 == animal_4);
        System.out.println(animal_1 == animal_5);
    }


}