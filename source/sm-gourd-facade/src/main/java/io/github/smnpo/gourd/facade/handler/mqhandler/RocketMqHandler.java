package io.github.smnpo.gourd.facade.handler.mqhandler;

import com.alibaba.fastjson.JSON;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.Producer;
import io.github.smnpo.gourd.facade.dto.MsgDTO;
import io.github.smnpo.gourd.facade.handler.MqHandler;
import io.github.smnpo.message.rocketmq.ProducerAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-08 16:25
 **/
@Component
//@ConditionalOnProperty(
//        prefix = "rocketmq.producer",
//        name = {"id"}
//)
@ConditionalOnBean(ProducerAutoConfiguration.class)
public class RocketMqHandler implements MqHandler {

    @Autowired
    private Producer producer;

    /**
     * 发送消息
     *
     * @param topic
     * @param msgDTO
     */
    @Override
    public void send(String topic, MsgDTO msgDTO) {
        producer.send(new Message(topic, msgDTO.getEventNo(), msgDTO.getTraceId(), JSON.toJSONBytes(msgDTO.getMsgData())));
    }
}
