package springo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springo.entity.UserEntity;
import springo.models.User;
import springo.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user/{id}")
    public User getUser1(@PathVariable("id") int id){
        return User.fromEntity(userService.getUser(id));
    }

    @GetMapping("/user")
    public User getUser2(@RequestParam("id") int id){
        return User.fromEntity(userService.getUser(id));
    }

    @PostMapping("/user")
    public User createUser(
            @RequestParam String email,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String job
    ) {
        return User.fromEntity(userService.addUser(UserEntity.builder()
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .job(job)
                .build()));
    }
}
