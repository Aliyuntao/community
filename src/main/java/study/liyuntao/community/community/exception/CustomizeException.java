package study.liyuntao.community.community.exception;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/7/9
 * Time: 10:56
 * Description: No Description
 */
public class CustomizeException extends RuntimeException {
    private String message;
    private Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
