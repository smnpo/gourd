package io.github.smnpo.gourd.facade.service.impl;

import io.github.smnpo.common.restful.Result;
import io.github.smnpo.gourd.facade.dto.MsgDTO;
import io.github.smnpo.gourd.facade.enums.CodeEnum;
import io.github.smnpo.gourd.facade.handler.DbHandler;
import io.github.smnpo.gourd.facade.handler.MqHandler;
import io.github.smnpo.gourd.facade.service.SendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-07 19:43
 **/
@Slf4j
@Service
public class SendServiceImpl implements SendService {

    @Value("${spring.mq.producer.topic}")
    private String topic;

    @Autowired(required = false)
    private Map<String, MqHandler> mqHandlerMap;

    @Autowired(required = false)
    private Map<String, DbHandler> dbHandlerMap;

    @Override
    public Result<Boolean> sendMsg(MsgDTO msg) {

        // 0x01. 发送到消息队列
        if (CollectionUtils.isEmpty(mqHandlerMap)) {
            return Result.fail(CodeEnum.MQ_NOT_CONFIG);
        } else {
            mqHandlerMap.forEach((name, handler) -> handler.send(topic, msg));
        }

        // 0x02. 落库记录发送的消息
        if (CollectionUtils.isEmpty(mqHandlerMap)) {
            return Result.fail(CodeEnum.DB_NOT_CONFIG);
        } else {
            dbHandlerMap.forEach((name, handler) -> handler.log(msg));
        }

        return Result.success(true);
    }
}
