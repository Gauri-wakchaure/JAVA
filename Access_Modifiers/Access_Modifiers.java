public class Access_Modifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "CBI";
        account1.email = "cbi67@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}

// package is a collection of similar things
class Account {

    // It can access anyone
    public String name;

    // It can access within package
    protected String email;

    // It can access only within same class
    private String password;

    // To access private variables or set private variables value we use
    // Getter method
    public String getPassword() {
        return this.password;
    }

    // Setter method
    public void setPassword(String pass) {
        this.password = pass;
    }
}

