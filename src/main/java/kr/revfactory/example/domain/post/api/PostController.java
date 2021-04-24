package kr.revfactory.example.domain.post.api;

import kr.revfactory.example.domain.post.Post;
import kr.revfactory.example.domain.post.dto.PostResponse;
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
public class PostController {

    private final PostService postService;

    @GetMapping("/v1/posts")
    public List<Post> getPosts(@RequestParam(value = "userId", required = false) Long userId) {
        return Optional.ofNullable(userId)
                .map(postService::getPostsByUser)
                .orElseGet(postService::getPosts);
    }

    @GetMapping("/v2/posts")
    public List<PostResponse> getPostResponse(@RequestParam(value = "userId", required = false) Long userId) {
        return PostResponse.build(Optional.ofNullable(userId)
                .map(postService::getPostsByUser)
                .orElseGet(postService::getPosts));
    }

    @GetMapping("/v3/posts")
    public List<PostResponse> getPostsWithJoinPatch(@RequestParam(value = "userId", required = false) Long userId) {
        return PostResponse.build(Optional.ofNullable(userId)
                .map(postService::getPostsByUserWithJoinFetch)
                .orElseGet(postService::getPostsWithJoinFetch));
    }

    @GetMapping("/v4/posts")
    public List<PostResponse> getPostsWithGraph(@RequestParam(value = "userId", required = false) Long userId) {
        return PostResponse.build(Optional.ofNullable(userId)
                .map(postService::getPostsByUserWithGraph)
                .orElseGet(postService::getPostsWithGraph));
    }
}
