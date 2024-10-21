import java.util.HashMap;

public class MujMultiton {

    private static UserProfile multitonInstance;
    private MujMultiton() { }
    private static HashMap<String, UserProfile> hashMap;

    public static UserProfile getInstance(String key) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }

        if (!hashMap.containsKey(key)) {
            multitonInstance = new UserProfile(key);
            hashMap.put(key, multitonInstance);
        } else {
            multitonInstance = hashMap.get(key);
        }
        return multitonInstance;
    }

    public static void main(String[] args) {
        UserProfile user1 = MujMultiton.getInstance("user123");
        UserProfile user2 = MujMultiton.getInstance("user124");

        System.out.println("User1: " + user1);
        System.out.println("User2: " + user2);
        System.out.println(user1==user2);
    }
}
