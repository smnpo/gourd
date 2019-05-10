package io.github.smnpo.gourd.facade.handler;

import io.github.smnpo.gourd.facade.dto.MsgDTO;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-10 15:38
 **/
public interface DbHandler {
    /**
     * 记日志
     * @param msgDTO
     */
    void log(MsgDTO msgDTO);
}
