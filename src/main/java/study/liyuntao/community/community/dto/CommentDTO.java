package study.liyuntao.community.community.dto;

import lombok.Data;
import study.liyuntao.community.community.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/8/13
 * Time: 10:06
 * Description: No Description
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long commentCount;
    private Long likeCount;
    private String content;
    private User user;
}
