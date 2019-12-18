package service;

import domain.models.service.UserServiceModel;

public interface UserService {

    void register(UserServiceModel userServiceModel);

    UserServiceModel getById(String id);

    UserServiceModel getByUsernameAndPassword(String username, String password);

    UserServiceModel getByUsername(String username);

    boolean isUsernameTaken(String username);
}
