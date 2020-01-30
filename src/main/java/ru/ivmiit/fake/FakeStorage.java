package ru.ivmiit.fake;

import ru.ivmiit.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        String dateTime = "2000-02-28";
        LocalDate d = LocalDate.parse(dateTime);

        User user1 = new User("Roman", "root", d);
        User user2 = new User("Ivan", "root", d);
        User user3 = new User("Denis", "root", d);

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public static FakeStorage storage() {
        return storage;
    }

    public List<User> users() {
        return users;
    }
}
