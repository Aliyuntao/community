package study.liyuntao.community.community.dto;

import lombok.Data;
import study.liyuntao.community.community.model.User;

@Data
public class QuestionDTO {
    private Long id;
    private String description;
    private String title;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Long commentCount;
    private Long viewCount;
    private Long likeCount;
    private User user;
}
