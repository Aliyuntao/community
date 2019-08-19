package study.liyuntao.community.community.enums;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/8/15
 * Time: 8:41
 * Description: No Description
 */

public enum  NotificationEnum {
    REPLY_QUESTION(1,"回复了问题"),
    REPLY_COMMENT(1,"回复了评论");
    private int type;
    private String name;

    NotificationEnum(int type, String name){
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }}
