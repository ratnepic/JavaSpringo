package springo.dao;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import springo.entity.UserEntity;
import springo.repository.UserRepository;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Component
@RequiredArgsConstructor
public class UserDao {

    private final UserRepository userRepository;

    @SneakyThrows
    public UserEntity getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(
                () -> new UserPrincipalNotFoundException("User with id " + id + " not found")
        );
    }

    @SneakyThrows
    public UserEntity addUser(UserEntity user) {
        return userRepository.saveAndFlush(user);
    }
}
