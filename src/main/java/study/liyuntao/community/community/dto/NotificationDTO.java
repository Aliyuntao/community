package study.liyuntao.community.community.dto;

import lombok.Data;
import study.liyuntao.community.community.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/8/15
 * Time: 9:45
 * Description: No Description
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;


}
