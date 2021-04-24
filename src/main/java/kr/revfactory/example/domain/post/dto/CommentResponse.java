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
public class CommentResponse {
    private final Long id;
    private final String reply;
    private final UserResponse user;

    public static CommentResponse build(Comment comment) {
        return CommentResponse.builder()
                .id(comment.getId())
                .reply(comment.getReply())
                .user(UserResponse.build(comment.getUser()))
                .build();
    }

    public static List<CommentResponse> build(Collection<Comment> comments) {
        return comments.stream()
                .map(CommentResponse::build)
                .collect(Collectors.toList());
    }
}
