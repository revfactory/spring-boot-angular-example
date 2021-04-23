package kr.revfactory.example.domain.user;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

}
