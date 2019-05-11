package org.smnpo.gourd.interfaces;

import org.smnpo.gourd.models.CaseVO;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageLogHandler
 * @Description : 	TODO
 * @date :	2019/5/8
 */

public interface MessageLogHandler {


    void updateStatusToMainMsgLog(String msgId, int status);

    <T> void createSubMsgLogRecord(CaseVO<T> caseVO, String subEventNo);

}