class User {
    private String userId;
    private String userName;
    private String email;

    //constructor
    User(String userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    //Method to display user information
    void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        //Creating User objects
        User user1 = new User("1", "John", "john@gmail.com");
        User user2 = new User("2", "Jane", "jane@gmail.com");

        //Displaying user information
        user1.displayUserInfo();
        System.out.println("-------------------");
        user2.displayUserInfo();
    }
}
