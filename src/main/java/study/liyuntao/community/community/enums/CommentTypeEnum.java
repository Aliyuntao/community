package study.liyuntao.community.community.enums;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/7/11
 * Time: 10:55
 * Description: No Description
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);

    private Integer type;

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType(){
        return type;
    }
}
