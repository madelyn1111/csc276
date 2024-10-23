public class Person {

    private String name;
    private String userName;
    private int numFollowers;


    public Person(String name, String userName, int numFollowers) {
        this.name = name;
        this.userName = userName;
        this.numFollowers = numFollowers;
    }
    public String toString(){
        return "Name: " + name + " Username: @" + userName + " Followers: " + numFollowers;
    }

    // Getters
    public String getName(){
        return name;
    }
    public String getUserName(){
        return userName;
    }
    public int getNumFollowers(){
        return numFollowers;
    }

}

