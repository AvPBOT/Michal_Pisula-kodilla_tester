public class ZadanieApplication {

    public static void main(String[] args) {
        Agent adam = new Agent("Adam", 40.5, 178);
        System.out.println(adam);
        if (adam.olderAndHigher() == true) {
            System.out.println(adam.getName() + " is older than 30 and taller than 160 cm.");
        } else {
            System.out.println(adam.getName() + " is younger than 30 or shorter than 160 cm.");
        }

        Agent test1 = new Agent("Test1", 27, 188);
        System.out.println(test1);
        if (test1.olderAndHigher() == true) {
            System.out.println(test1.getName() + " is older than 30 and taller than 160 cm.");
        } else {
            System.out.println(test1.getName() + " is younger than 30 or shorter than 160 cm.");
        }
    }
}


