package springo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import springo.entity.UserEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String email;

    private String firstName;

    private String lastName;

    private String job;

    public static User fromEntity(UserEntity entity) {
        return User.builder()
                .email(entity.getEmail())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .job(entity.getJob())
                .build();
    }
}
