package kr.revfactory.example.domain.post.repository;

import kr.revfactory.example.domain.post.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @EntityGraph(attributePaths = {"comments", "comments.user", "user"}, type = EntityGraph.EntityGraphType.LOAD)
    List<Post> findAllByUserId(Long userId);

}
