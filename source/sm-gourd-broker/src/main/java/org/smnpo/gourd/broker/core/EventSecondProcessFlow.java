package org.smnpo.gourd.broker.core;

import com.aliyun.openservices.ons.api.Action;
import org.smnpo.gourd.broker.core.handlers.MessageLogHandler;
import org.smnpo.gourd.broker.core.handlers.MessageSecondHandler;
import org.smnpo.gourd.broker.core.models.CaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	EventProcessFlowStepTwo
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component
public class EventSecondProcessFlow {

    @Autowired
    private MessageLogHandler messageLogHandler;

    @Autowired
    private MessageContentProcessFlow contentProcessFlow;

    @Autowired
    private MessageSecondHandler secondHandler;

    public <T> Action processSubMessage(CaseVO<T> caseVO, String subEventNo) {

        contentProcessFlow.extensionProcess(caseVO, false, subEventNo);

        messageLogHandler.createSubMsgLogRecord(caseVO, subEventNo);

        return secondHandler.secondSend(caseVO);
    }

}