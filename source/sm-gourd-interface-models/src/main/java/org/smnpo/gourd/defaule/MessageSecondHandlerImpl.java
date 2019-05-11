package org.smnpo.gourd.defaule;

import org.smnpo.gourd.interfaces.MessageSecondHandler;
import org.smnpo.gourd.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageSecondHandlerImpl
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component("messageSecondHandlerImpl")
public class MessageSecondHandlerImpl<Action> implements MessageSecondHandler<Action> {
    @Override
    public <T> Action secondSend(CaseVO<T> caseVO) {
        return null;
    }
}