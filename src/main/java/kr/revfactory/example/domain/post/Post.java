package kr.revfactory.example.domain.post;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import kr.revfactory.example.domain.user.User;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    @JsonManagedReference
    //private final List<Comment> comments = new ArrayList<>();
    private final Set<Comment> comments = new LinkedHashSet<>();

    //@ManyToOne
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
}
