package kr.revfactory.example.domain.post.dto;

import kr.revfactory.example.domain.post.Comment;
import kr.revfactory.example.domain.post.Post;
import kr.revfactory.example.domain.user.User;
import kr.revfactory.example.domain.user.dto.UserDto;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostResponse {
    private Long id;
    private String subject;
    private List<Comment> comments;
    private UserDto user;

    public static PostResponse build(Post post) {
        return PostResponse.builder()
                .id(post.getId())
                .subject(post.getSubject())
                .comments(post.getComments())
                .user(UserDto.build(post.getUser()))
                .build();
    }
}
