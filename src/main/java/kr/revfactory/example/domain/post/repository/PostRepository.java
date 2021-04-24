package kr.revfactory.example.domain.post.repository;

import kr.revfactory.example.domain.post.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAll();

    List<Post> findAllByUserId(Long userId);

    @EntityGraph(attributePaths = {"comments"}, type = EntityGraph.EntityGraphType.LOAD)
    List<Post> findAllByUserIdWithGraph(Long userId);
}
