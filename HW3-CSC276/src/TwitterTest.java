import java.util.Random;

public class TwitterTest {

    public static void main(String[] args) {
        Person p1 = new Person("Alex", "Alex56", 156);
        Person p2 = new Person("Colette", "Cookie59", 10000);
        Person p3 = new Person("Austin", "Ablades", 327);

        Person[] users = {p1, p2, p3};
        Twitter twitterUsers = new Twitter(users);

        twitterUsers.printAllUsers();
        System.out.println("************************");
        System.out.println("Total followers: " + twitterUsers.calculateTotalFollowers());


        String[] randomNames = {"Andrew", "Carter", "Brandon", "Zach", "Kaila", "Corey", "Lance", "Goku", "Leslie", "Sara"};
        Person[] randomPeople = new Person[20];

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String randomName = randomNames[rand.nextInt(randomNames.length)];
            //String username = "@" + randomName.toLowerCase();
            String username = randomName.toLowerCase();
            int followers = rand.nextInt(100) +1;

            randomPeople[i] = new Person(randomName, username, followers);
        }

        Twitter ranUsers = new Twitter(randomPeople);
        System.out.println("************************");
        System.out.println("Random Names: " );
        ranUsers.printAllUsers();
    }
}