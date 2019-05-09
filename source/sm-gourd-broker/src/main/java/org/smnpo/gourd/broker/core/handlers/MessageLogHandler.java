package org.smnpo.gourd.broker.core.handlers;

import org.smnpo.gourd.broker.core.models.CaseVO;

/**
 *
 *
 * @ClassName    : 	MessageLogHandler
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/8
 *
 */

public interface MessageLogHandler {


    void updateStatusToMainMsgLog(String msgId, int status);

    <T>void createSubMsgLogRecord(CaseVO<T> caseVO,String subEventNo);

}