package io.github.smnpo.gourd.facade.handler;

import io.github.smnpo.gourd.facade.dto.MsgDTO;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-10 15:00
 **/
public interface MqHandler {
    /**
     * 发送消息
     * @param topic
     * @param msgDTO
     */
    void send(String topic, MsgDTO msgDTO);
}
