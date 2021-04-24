package kr.revfactory.example.domain.post.repository;

import kr.revfactory.example.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAll();

    List<Post> findAllByUserId(Long userId);

    @Query("select a from Post a join fetch a.comments join fetch a.user")
    //@Query("select distinct a from Post a join fetch a.comments join fetch a.user")
    List<Post> findAllJoinFetch();

    @Query("select a from Post a join fetch a.comments join fetch a.user where a.user.id = :userId")
    //@Query("select distinct a from Post a join fetch a.comments join fetch a.user where a.user.id = :userId")
    List<Post> findAllByUserIdJoinFetch(@Param("userId") Long userId);
}
