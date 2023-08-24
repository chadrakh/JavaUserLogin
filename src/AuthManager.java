import java.util.ArrayList;
import java.util.List;

public class AuthManager {
    private static final User GUEST = new User("guest", "password");
    private final List<User> USERS;

    public AuthManager() {
        USERS = new ArrayList<>();
        // Add users to the list here
        USERS.add(GUEST);
    }

    public boolean authenticate(User user) {
        for (User storedUser : USERS) {
            if (user.getUsername().equals(storedUser.getUsername()) &&
                    user.getPassword().equals(storedUser.getPassword())) {
                return true;
            }
        }
        return false;
    }
}