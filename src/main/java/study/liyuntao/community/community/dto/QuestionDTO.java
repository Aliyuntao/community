package study.liyuntao.community.community.dto;

import lombok.Data;
import study.liyuntao.community.community.model.User;

@Data
public class QuestionDTO {
    private Integer id;
    private String description;
    private String title;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private User user;
}
