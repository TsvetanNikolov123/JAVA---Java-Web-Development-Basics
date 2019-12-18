package repository;

import domain.entities.User;

import java.util.List;

public interface UserRepository {

    void save(User user);

    User findById(String id);

    User findByUsernameAndPassword(String username, String password);

    List<User> findUser(String username);
}
