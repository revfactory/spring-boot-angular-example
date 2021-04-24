package kr.revfactory.example.domain.post.api.v1;

import kr.revfactory.example.domain.post.Post;
import kr.revfactory.example.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/posts")
public class V1PostController {

    private final PostService postService;

    @GetMapping
    public List<Post> getPosts(@RequestParam(value = "userId", required = false) Long userId) {
        return Optional.ofNullable(userId)
                .map(postService::getPostsByUser)
                .orElseGet(postService::getPosts);
    }
}
