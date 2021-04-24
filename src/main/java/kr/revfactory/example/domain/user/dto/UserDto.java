package kr.revfactory.example.domain.user.dto;

import kr.revfactory.example.domain.user.User;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDto {
    private Long id;
    private String name;
    private String email;

    public static UserDto build(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
