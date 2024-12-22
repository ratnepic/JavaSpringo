package springo.service;

import springo.entity.UserEntity;

public interface UserService {

    UserEntity getUser(int id);

    UserEntity addUser(UserEntity user);

}
