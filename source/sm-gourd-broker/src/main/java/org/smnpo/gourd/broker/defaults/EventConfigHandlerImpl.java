package org.smnpo.gourd.broker.defaults;

import org.smnpo.gourd.broker.core.handlers.EventConfigHandler;
import org.smnpo.gourd.broker.core.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @ClassName    : 	EventConfigHandlerImpl
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/8
 *
 */
@Component("eventConfigHandlerImpl")
public class EventConfigHandlerImpl implements EventConfigHandler {

    @Override public <T> void initMainMsgConfig(CaseVO<T> caseVO) {

    }

    @Override public <T> void initSunMsgConfigs(CaseVO<T> caseVO) {

    }
}