public class ZadanieApplication {

    public static void main(String[] args) {
        Agent adam = new Agent("Adam", 40.5, 178);
        if (adam.hasName()) {
            if (adam.isOlderThan(30) && adam.isTallerThan(160)) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}