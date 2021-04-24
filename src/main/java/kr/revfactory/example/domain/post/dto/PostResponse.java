package kr.revfactory.example.domain.post.dto;

import kr.revfactory.example.domain.post.Comment;
import kr.revfactory.example.domain.post.Post;
import kr.revfactory.example.domain.user.dto.UserResponse;
import lombok.Builder;
import lombok.Getter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class PostResponse {
    private final Long id;
    private final String subject;
    private final List<CommentResponse> comments;
    private final UserResponse user;

    public static PostResponse build(Post post) {
        return PostResponse.builder()
                .id(post.getId())
                .subject(post.getSubject())
                .comments(CommentResponse.build(post.getComments()))
                .user(UserResponse.build(post.getUser()))
                .build();
    }

    public static List<PostResponse> build(Collection<Post> posts) {
        return posts.stream()
                .map(PostResponse::build)
                .collect(Collectors.toList());
    }
}
