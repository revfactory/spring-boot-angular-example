package kr.revfactory.example.domain.post.api.v2;

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
@RequestMapping("/v2/posts")
public class V2PostController {

    private final PostService postService;

    @GetMapping
    public List<PostResponse> getPosts(@RequestParam(value = "userId", required = false) Long userId) {
        return PostResponse.build(Optional.ofNullable(userId)
                .map(postService::getPostsByUser)
                .orElseGet(postService::getPosts));
    }
}
