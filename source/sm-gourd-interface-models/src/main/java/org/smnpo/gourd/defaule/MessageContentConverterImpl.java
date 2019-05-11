package org.smnpo.gourd.defaule;

import org.smnpo.gourd.interfaces.MessageContentConverter;
import org.smnpo.gourd.models.CaseVO;
import org.springframework.stereotype.Component;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageContentConverterImpl
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component("messageContentConverterImpl")
public class MessageContentConverterImpl implements MessageContentConverter {

    @Override
    public boolean preCheck() {
        return true;
    }

    @Override
    public <T> boolean convert(CaseVO<T> caseVO, boolean isMain, String eventNo) {
        return false;
    }
}