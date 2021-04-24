package kr.revfactory.example.domain.post.repository;

import kr.revfactory.example.domain.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostWithGraphRepository extends JpaRepository<Post, Long> {

    @EntityGraph(attributePaths = {"comments", "user"})
    //@EntityGraph(attributePaths = {"comments", "user"}, type = EntityGraph.EntityGraphType.LOAD)
    //@EntityGraph(attributePaths = {"comments", "user", "comments.user"}, type = EntityGraph.EntityGraphType.LOAD)
    List<Post> findAll();

    @EntityGraph(attributePaths = {"comments", "user"})
    //@EntityGraph(attributePaths = {"comments", "user"}, type = EntityGraph.EntityGraphType.LOAD)
    //@EntityGraph(attributePaths = {"comments", "user", "comments.user"}, type = EntityGraph.EntityGraphType.LOAD)
    List<Post> findAllByUserId(Long userId);

    @EntityGraph(attributePaths = {"comments", "user", "comments.user"}, type = EntityGraph.EntityGraphType.LOAD)
    Page<Post> findAll(Pageable pagealbe);

    @EntityGraph(attributePaths = {"comments", "user", "comments.user"}, type = EntityGraph.EntityGraphType.LOAD)
    Page<Post> findAllByUserId(Long userId, Pageable pageable);
}
