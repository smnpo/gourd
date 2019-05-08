package io.github.smnpo.gourd.facade.service.impl;

import io.github.smnpo.common.restful.Result;
import io.github.smnpo.gourd.facade.dto.MsgDTO;
import io.github.smnpo.gourd.facade.service.SendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-07 19:43
 **/
@Slf4j
@Service
public class SendServiceImpl implements SendService {

    @Override
    public Result<Boolean> sendMsg(MsgDTO msg) {
        // TODO: handler逻辑
        // 0x01. 发送到消息队列
        // 0x02. 落库记录发送的消息

        return Result.success(true);
    }
}
