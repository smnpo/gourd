package io.github.smnpo.gourd.facade.handler.mqhandler;

import com.alibaba.fastjson.JSON;
import io.github.smnpo.gourd.facade.dto.MsgDTO;
import io.github.smnpo.gourd.facade.handler.MqHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-10 15:02
 **/
@Component
@ConditionalOnProperty(
        prefix = "kafka.producer",
        name = {"id"}
)
public class KafkaMqHandler implements MqHandler {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送消息
     *
     * @param topic
     * @param msgDTO
     */
    @Override
    public void send(String topic, MsgDTO msgDTO) {
        kafkaTemplate.send(topic, msgDTO.getTraceId(), JSON.toJSONString(msgDTO));
    }
}
