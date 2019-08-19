package study.liyuntao.community.community.dto;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/7/11
 * Time: 9:27
 * Description: No Description
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
