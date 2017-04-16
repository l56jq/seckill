package org.seckill.exception;

/**
 * 秒杀关闭异常
 *
 * @author l56jq
 * @date 2017/3/27
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
