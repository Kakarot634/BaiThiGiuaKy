package Bai5;

public class Admin extends User {

    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Login admin");
    }

    @Override
    public void register() {
        System.out.println("Register admin");
    }

    @Override
    public void logout() {
        System.out.println("Logout admin");
    }
}
