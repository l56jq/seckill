package org.seckill.exception;

/**
 * 秒杀相关异常
 *
 * @author l56jq
 * @date 2017/3/27
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
