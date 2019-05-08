package org.smnpo.gourd.broker.defaults;

import org.smnpo.gourd.broker.core.handlers.MessageLogHandler;
import org.smnpo.gourd.broker.core.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @ClassName    : 	MessageLogHandlerDefaultImpl
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/8
 *
 */

@Component("messageLogHandlerImpl")
public class MessageLogHandlerImpl implements MessageLogHandler {

    @Override public void updateStatusToMainMsgLog(String msgId, int status) {

    }

    @Override public <T> void createSubMsgLogRecord(CaseVO<T> caseVO, String subEventNo) {

    }
}