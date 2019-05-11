package org.smnpo.gourd.broker.facade;

import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import io.github.smnpo.message.rocketmq.annotation.ConsumerListener;
import lombok.extern.slf4j.Slf4j;
import org.smnpo.gourd.broker.core.EventFirstProcessFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	MainEventListener
 * @Description : 	TODO
 * @date :	2019/5/7
 */
@Slf4j
@Component
@ConsumerListener(topic = "${mq.topic.sysBus}")
public class MainEventListener implements MessageListener {

    @Autowired
    private EventFirstProcessFlow firstProcessFlow;

    @Override
    public Action consume(Message message, ConsumeContext context) {
        return firstProcessFlow.processMainMessage(message, message.getMsgID());
    }
}