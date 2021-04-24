package kr.revfactory.example.domain.post.repository;

import kr.revfactory.example.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAll();

    //@Query("select a from Post a join fetch a.user")
    List<Post> findAllByUserId(Long userId);

}
