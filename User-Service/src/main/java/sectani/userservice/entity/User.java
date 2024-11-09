package sectani.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class User {
    private String id;
    private String nom;
    private String email;
    private String tel;
    private String interest;
}
