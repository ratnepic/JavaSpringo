package springo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springo.dao.UserDao;
import springo.entity.UserEntity;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity getUser(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        return userDao.addUser(user);
    }
}
