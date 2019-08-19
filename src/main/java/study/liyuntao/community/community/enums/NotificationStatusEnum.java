package study.liyuntao.community.community.enums;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/8/15
 * Time: 8:49
 * Description: No Description
 */
public enum  NotificationStatusEnum {
    UNREAD(0),READ(1);
    private int status;

    NotificationStatusEnum(int status){
        this.status=status;
    }

    public int getStatus() {
        return status;
    }
}
