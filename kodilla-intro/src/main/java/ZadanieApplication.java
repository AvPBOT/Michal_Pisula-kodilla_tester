public class ZadanieApplication {

    public static void main(String[] args) {
        Agent adam = new Agent("Adam", 40.5, 178);
        System.out.println(adam);
        if (adam.hasName() == true) {
            if (adam.isOlderThan(30) && adam.isTallerThan(160)) {
                System.out.println(adam.getName() + " is older than 30 and taller than 160 cm.");
            } else {
                System.out.println(adam.getName() + " is younger than 30 or shorter than 160 cm.");
            }
        }

        Agent test1 = new Agent("Test1", 27, 188);
        System.out.println(test1);
        if (test1.hasName() == true) {
            if (test1.isOlderThan(30) && test1.isTallerThan(160)) {
                System.out.println(test1.getName() + " is older than 30 and taller than 160 cm.");
            } else {
                System.out.println(test1.getName() + " is younger than 30 or shorter than 160 cm.");
            }
        }
    }
}


