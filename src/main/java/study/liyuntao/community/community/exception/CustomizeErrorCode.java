package study.liyuntao.community.community.exception;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/7/9
 * Time: 11:57
 * Description: No Description
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001,"你找的问题不存在或已被删除"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"对不起，未登录无法进行该操作哦！"),
    SYS_ERROR(2004,"服务器出错啦，页面找不到啦"),
    COMMENT_NOT_FOUND(2001,"你找的评论不存在或已被删除"),
    COMMENT_IS_EMPTY(2005,"评论内容不能为空"),
    READ_NOTIFICATION_FAIL(2006,"非法已读操作"),
    NOTIFICATION_NOT_EXIST(2007,"回复不存在或已被删除"),
    FILE_UPLOAD_FAIL(2008,"上传失败")
    ;

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
