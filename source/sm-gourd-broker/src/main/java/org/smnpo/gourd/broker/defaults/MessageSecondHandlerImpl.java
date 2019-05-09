package org.smnpo.gourd.broker.defaults;

import com.aliyun.openservices.ons.api.Action;
import org.smnpo.gourd.broker.core.handlers.MessageSecondHandler;
import org.smnpo.gourd.broker.core.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @ClassName    : 	MessageSecondHandlerImpl
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/8
 *
 */
@Component("messageSecondHandlerImpl")
public class MessageSecondHandlerImpl implements MessageSecondHandler {
    @Override public <T> Action secondSend(CaseVO<T> caseVO) {
        return null;
    }
}