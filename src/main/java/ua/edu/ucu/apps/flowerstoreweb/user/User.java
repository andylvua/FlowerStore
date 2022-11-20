package ua.edu.ucu.apps.flowerstoreweb.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Getter @Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Transient
    private int age;

    private String name;
    private String email;
    private String password;
    private double balance;
    private LocalDate dob;

    public int getUserAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
