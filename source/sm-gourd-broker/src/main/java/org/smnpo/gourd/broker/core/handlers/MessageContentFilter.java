package org.smnpo.gourd.broker.core.handlers;

import org.smnpo.gourd.broker.core.models.CaseVO;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageFilter
 * @Description : 	TODO
 * @date :	2019/5/8
 */

public interface MessageContentFilter {

    boolean preCheck();

    <T> boolean filter(CaseVO<T> caseVO, boolean isMain, String eventNo);


}