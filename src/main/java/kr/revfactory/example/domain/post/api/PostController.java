package kr.revfactory.example.domain.post.api;

import kr.revfactory.example.domain.post.Post;
import kr.revfactory.example.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("posts")
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<Post> getPosts(@RequestParam("userId") Long userId) {
        return postService.getPostsByUser(userId);
    }
}
