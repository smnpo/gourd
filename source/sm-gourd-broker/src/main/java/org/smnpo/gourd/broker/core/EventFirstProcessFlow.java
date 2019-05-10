package org.smnpo.gourd.broker.core;

import com.aliyun.openservices.ons.api.Action;
import org.smnpo.gourd.broker.MessageLogStatusEnum;
import org.smnpo.gourd.broker.core.handlers.EventConfigHandler;
import org.smnpo.gourd.broker.core.handlers.MessageLogHandler;
import org.smnpo.gourd.broker.core.models.CaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	EventProcessBox
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component
public class EventFirstProcessFlow<T> {

    @Autowired
    private MessageContentProcessFlow contentProcessFlow;

    @Autowired
    private MessageLogHandler messageLogHandler;

    @Autowired
    private EventDispatcher eventDispatcher;

    @Autowired
    private EventConfigHandler confighandler;


    public Action processMainMessage(T message, String msgId) {

        messageLogHandler.updateStatusToMainMsgLog(msgId, MessageLogStatusEnum.RECEIVE.getCode());

        CaseVO<T> caseVO = converter(message);

        confighandler.initMainMsgConfig(caseVO);

        contentProcessFlow.extensionProcess(caseVO, true, caseVO.getMainEventNO());

        eventDispatcher.dispatch(caseVO);

        return Action.CommitMessage;
    }

    private CaseVO converter(T message) {

        return null;
    }

}