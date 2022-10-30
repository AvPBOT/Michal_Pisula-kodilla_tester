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
        User[] users = initUsers();
        double avgAge = calculateAverageAge(users);
        printUsersOlderThan(users, avgAge);
    }

    private static User[] initUsers() {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        return new User[]{anna, betty, carl, david, eva, frankie};
    }

    private static double calculateAverageAge(User[] users) {
        double sum = 0;
        for(int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        return sum / users.length;
    }

    private static void printUsersOlderThan(User[] users, double avgAge) {
        System.out.println("People below the average age are: ");
        for(int i = 0; i < users.length; i++) {
            if(users[i].getAge() < avgAge) {
                System.out.println(users[i].getName());
            }
        }
    }
}