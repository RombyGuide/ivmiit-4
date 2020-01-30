package ru.ivmiit.repositories;

import ru.ivmiit.models.User;

import java.util.List;

/**
 * 30.01.2020
 * UsersRepository
 *
 * Интерфейс, описывающий поведение объекта, предоставляющего доступ к данным (паттерн DAO)
 *
 * @author RombyGuIde (My Home Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository {
    List<User> findAll();
    void save(User user);
    boolean isExist(String name, String password);
}
