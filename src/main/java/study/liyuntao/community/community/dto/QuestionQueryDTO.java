package study.liyuntao.community.community.dto;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/8/19
 * Time: 10:23
 * Description: 用于搜索实现
 */
@Data
public class QusetionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
