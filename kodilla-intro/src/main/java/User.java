public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String [] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        System.out.println("The average age is: ");
        int sum = 0;
        for(int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }

        int ageAverage = sum / users.length;
        System.out.println(ageAverage);

        System.out.println();
        System.out.println("People below the average age are: ");
        for(int i = 0; i < users.length; i++) {
            if(users[i].getAge() < ageAverage) {
                System.out.println(users[i].getName());
            }
        }


    }
}