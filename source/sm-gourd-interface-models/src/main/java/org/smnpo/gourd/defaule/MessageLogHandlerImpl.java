package org.smnpo.gourd.defaule;

import org.smnpo.gourd.interfaces.MessageLogHandler;
import org.smnpo.gourd.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageLogHandlerDefaultImpl
 * @Description : 	TODO
 * @date :	2019/5/8
 */

@Component("messageLogHandlerImpl")
public class MessageLogHandlerImpl implements MessageLogHandler {

    public void updateStatusToMainMsgLog(String msgId, int status) {

    }

    public <T> void createSubMsgLogRecord(CaseVO<T> caseVO, String subEventNo) {

    }
}