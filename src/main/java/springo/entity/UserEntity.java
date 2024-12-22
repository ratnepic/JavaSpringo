package springo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String email;

    private String firstName;

    private String lastName;

    private String job;

}
