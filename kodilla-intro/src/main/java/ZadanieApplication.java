public class ZadanieApplication {

    public static void main(String[] args) {
        Agent adam = new Agent("Adam", 40.5, 178);
        System.out.println(adam.name + " " + adam.age + " " + adam.height);
        adam.checkParameters();
    }
}