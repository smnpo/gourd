package org.smnpo.gourd.defaule;

import org.smnpo.gourd.interfaces.MessageContentFilter;
import org.smnpo.gourd.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageContentFilterImpl
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component("messageContentFilterImpl")
public class MessageContentFilterImpl implements MessageContentFilter {
    @Override
    public boolean preCheck() {
        return true;
    }

    @Override
    public <T> boolean filter(CaseVO<T> caseVO, boolean isMain, String eventNo) {
        return false;
    }
}