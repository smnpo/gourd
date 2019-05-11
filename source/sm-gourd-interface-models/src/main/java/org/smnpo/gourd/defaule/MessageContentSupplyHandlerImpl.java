package org.smnpo.gourd.defaule;

import org.smnpo.gourd.interfaces.MessageContentSupplyHandler;
import org.smnpo.gourd.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageContentSupplyHandlerImpl
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component("messageContentSupplyHandlerImpl")
public class MessageContentSupplyHandlerImpl implements MessageContentSupplyHandler {

    @Override
    public boolean preCheck() {
        return true;
    }

    @Override
    public <T> boolean handle(CaseVO<T> caseVO, boolean isMain, String eventNo) {
        return false;
    }
}