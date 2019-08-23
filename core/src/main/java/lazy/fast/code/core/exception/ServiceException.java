package lazy.fast.code.core.exception;

/**
 * 自定义service业务异常类 - HTTP Status 400
 *
 * @author wendell
 */
public class ServiceException extends RuntimeException {

    /**
     * {"code":400,"msg":"操作失败"}
     */
    public ServiceException() {
        super(ErrorMsg.fail());
    }

    /**
     * {"code":400,"msg":"${message}"}
     *
     * @param message
     *            异常简要信息
     */
    public ServiceException(String message) {
        super(ErrorMsg.fail(message));
    }

    /**
     * {"code":400,"msg":"${message}","detailMsg":"${detailMsg}"}
     *
     * @param message
     *            异常简要信息
     * @param detailMsg
     *            异常详细信息
     */
    public ServiceException(String message, String detailMsg) {
        super(ErrorMsg.fail(message, detailMsg));
    }

    /**
     * HTTP状态码为400的业务异常类，如果需要自定义返回的code和msg，那必须通过实现MsgEnumable的枚举来定义操作
     *
     * {"code":${msgEnum.code},"msg":"${msgEnum.msg}"}
     *
     * @param msgEnum
     *            消息枚举
     */
    public ServiceException(MsgEnumable msgEnum) {
        super(ErrorMsg.of(msgEnum.code(), msgEnum.msg()));
    }

}
