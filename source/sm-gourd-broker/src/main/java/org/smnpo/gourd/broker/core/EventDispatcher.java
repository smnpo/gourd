package org.smnpo.gourd.broker.core;

import org.smnpo.gourd.interfaces.EventConfigHandler;
import org.smnpo.gourd.models.CaseVO;
import org.smnpo.gourd.models.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author :	xing.chen
 * @ClassName : 	EventDispatcher
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component
public class EventDispatcher {
    @Autowired
    private EventConfigHandler configHandler;

    @Autowired
    private EventSecondProcessFlow secondProcessFlow;


    @Resource
    ThreadPoolTaskExecutor dispatchExecutor;


    void dispatch(CaseVO caseVO) {
        configHandler.initSunMsgConfigs(caseVO);

        Map<String, MessageVO> subMessages = caseVO.getSubMsgs();

        for (String eNO : subMessages.keySet()) {
            dispatchExecutor.execute(() -> {
                secondProcessFlow.processSubMessage(caseVO, eNO);
            });
        }
    }
}