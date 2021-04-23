package kr.revfactory.example.domain.post.service;

import kr.revfactory.example.domain.post.Post;
import kr.revfactory.example.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getPostsByUser(Long userId) {
        return postRepository.findAllByUserId(userId);
    }
}
