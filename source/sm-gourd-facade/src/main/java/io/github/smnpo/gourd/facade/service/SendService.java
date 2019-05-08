package io.github.smnpo.gourd.facade.service;

import io.github.smnpo.common.restful.Result;
import io.github.smnpo.gourd.facade.dto.MsgDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-07 19:42
 **/
@RestController
@Api(tags = "send-service", description = "发送消息控制器")
public interface SendService {

    @PostMapping("/send")
    @ApiOperation(value = "发送消息")
    Result<Boolean> sendMsg(@RequestBody @Valid MsgDTO msg);
}
