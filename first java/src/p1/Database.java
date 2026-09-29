package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    private static List<User> users = new ArrayList<>();
    private static Map<String, User> usersByUsername = new HashMap<>();

    public static void addUser(User user) {
        users.add(user);
        usersByUsername.put(user.getUsername(), user);
    }

    public static User getUserByUsername(String username) {
        return usersByUsername.get(username);
    }

    public static List<Product> getProductsByCategory(String category) {
        // implementation to fetch products from database based on category
        return new ArrayList<>();
    }

}

