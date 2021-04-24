package kr.revfactory.example.domain.post.repository;

import kr.revfactory.example.domain.post.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostWithGraphRepository extends JpaRepository<Post, Long> {

    //@EntityGraph(attributePaths = {"comments", "user"}, type = EntityGraph.EntityGraphType.LOAD)
    @EntityGraph(attributePaths = {"comments", "user", "comments.user"}, type = EntityGraph.EntityGraphType.LOAD)
    List<Post> findAll();

    //@EntityGraph(attributePaths = {"comments", "user"}, type = EntityGraph.EntityGraphType.LOAD)
    @EntityGraph(attributePaths = {"comments", "user", "comments.user"}, type = EntityGraph.EntityGraphType.LOAD)
    List<Post> findAllByUserId(Long userId);

}
