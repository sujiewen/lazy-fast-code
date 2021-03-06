package lazy.fast.code.core.web.exception;

import lazy.fast.code.core.web.result.ResultMsg;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 基础异常类 - 自定义的非受检异常应该继承此类
 *
 * @author wendell
 */
@Getter
public abstract class BaseUnCheckException extends RuntimeException {

    /**
     * http状态码, ResultMsg中的code可以与此相同
     */
    private final HttpStatus httpStatus;

    private final ResultMsg resultMsg;

    public BaseUnCheckException(HttpStatus httpStatus, ResultMsg resultMsg) {
        super(resultMsg.toString());
        this.httpStatus = httpStatus;
        this.resultMsg = resultMsg;
    }

}
