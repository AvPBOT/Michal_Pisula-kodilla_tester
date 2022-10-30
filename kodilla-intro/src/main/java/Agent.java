public class Agent {

    private String name;
    private double age;
    private double height;

    public Agent(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkParameters() {
        if(this.name == null) {
            return;
        }
        if(this.age > 30 && this.height > 160) {
            System.out.println(this.name + " is older than 30 and taller than 160 cm.");
        }
        else {
            System.out.println(this.name + " is younger than 30 or shorter than 160 cm.");
        }
    }
}