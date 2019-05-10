package io.github.smnpo.gourd.facade.handler.dbhandler;

import io.github.smnpo.gourd.facade.dto.MsgDTO;
import io.github.smnpo.gourd.facade.handler.DbHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-10 15:48
 **/
@Slf4j
@Component
public class MySqlHandler implements DbHandler {

    /**
     * 记日志
     *
     * @param msgDTO
     */
    @Override
    public void log(MsgDTO msgDTO) {
        log.info("mysql is not support.");
    }
}
