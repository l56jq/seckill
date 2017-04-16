package org.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 *
 * @author l56jq
 * @date 2017/3/27
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
