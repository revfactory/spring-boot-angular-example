package kr.revfactory.example.domain.post.service;

import kr.revfactory.example.domain.post.Post;
import kr.revfactory.example.domain.post.repository.PostRepository;
import kr.revfactory.example.domain.post.repository.PostWithGraphRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final PostWithGraphRepository postWithGraphRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public List<Post> getPostsByUser(Long userId) {
        return postRepository.findAllByUserId(userId);
    }

    public List<Post> getPostsWithJoinFetch() {
        return postRepository.findAllJoinFetch();
    }

    public List<Post> getPostsByUserWithJoinFetch(Long userId) {
        return postRepository.findAllByUserIdJoinFetch(userId);
    }

    public List<Post> getPostsWithGraph() {
        return postWithGraphRepository.findAll();
    }

    public List<Post> getPostsByUserWithGraph(Long userId) {
        return postWithGraphRepository.findAllByUserId(userId);
    }
}
