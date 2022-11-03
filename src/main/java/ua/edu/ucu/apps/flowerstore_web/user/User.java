package ua.edu.ucu.apps.flowerstore_web.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class User {
    private String name;
    private String email;
    private String password;

    double balance;
}
