package ru.ivmiit.repositories;

import ru.ivmiit.models.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 14.03.2018
 * UsersRepositoryInMemoryImpl
 *
 * Реализация объекта доступа к данным с испольованием фейкового хранилища
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersRepositoryInMemoryImpl implements UsersRepository {
    private List<User> users;

    public UsersRepositoryInMemoryImpl() {
        this.users = new ArrayList<>();

        // Парсинг
        String dateTime = "2000-02-28";
        LocalDate d = LocalDate.parse(dateTime);

        User user1 = new User("Roman", "root", d);
        User user2 = new User("Ivan", "root", d);
        User user3 = new User("Denis", "root", d);

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User> findAll() {
        return this.users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
