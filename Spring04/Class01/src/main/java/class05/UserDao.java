package class05;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
	private Map<String, User> userDatabase = new HashMap<>();

    public User findByUsername(String username) {
        return userDatabase.get(username);
    }

    public void save(User user) {
        userDatabase.put(user.getUsername(), user);
    }

    public void deleteByUsername(String username) {
        userDatabase.remove(username);
    }
}
