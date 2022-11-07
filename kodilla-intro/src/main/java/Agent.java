public class Agent {

    String name;
    double age;
    double height;

    public Agent(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isOlderThan() {
        return getAge() > 30;
    }

    public boolean isTallerThan() {
        return getHeight() > 160;
    }

    @Override
    public String toString() {
        return "Agent {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", height = " + height +
                '}';
    }
}