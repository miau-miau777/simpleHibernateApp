import models.Auto;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {
       UserService userService = new UserService();
        User user = new User("Jhon", 30);
        userService.saveUser(user);
        Auto auto1 = new Auto("Ferrari", "Red");
        auto1.setUser(user);
        user.addAuto(auto1);
        Auto auto2 = new Auto("Ford", "Yellow");
        auto2.setUser(user);
        user.addAuto(auto2);
        userService.updateUser(user);

    }
}
