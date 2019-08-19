package study.liyuntao.community.community.dto;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/8/14
 * Time: 16:11
 * Description: No Description
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
