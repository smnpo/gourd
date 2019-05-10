package org.smnpo.gourd.broker.core;

import org.smnpo.gourd.broker.core.handlers.*;
import org.smnpo.gourd.broker.core.models.CaseVO;
import org.smnpo.gourd.broker.core.models.MessageConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	EventProcessFlow
 * @Description : 	TODO
 * @date :	2019/5/8
 */

@Component
public class MessageContentProcessFlow {

    @Autowired
    private ComponentBox componentBox;


    public <T> void extensionProcess(CaseVO<T> caseVO, boolean isMain, String eventNo) {


        MessageConfigVO configVO = caseVO.getMainMessageVO().getConfigVO();

        if (!componentBox.getFilter(configVO).filter(caseVO, isMain, eventNo)) {
            return;
        }

        componentBox.getSupplyHandler(configVO).handle(caseVO, isMain, eventNo);

        componentBox.getConverter(configVO).convert(caseVO, isMain, eventNo);

    }

}