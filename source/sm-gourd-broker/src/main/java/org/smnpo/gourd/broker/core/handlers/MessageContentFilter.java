package org.smnpo.gourd.broker.core.handlers;

import org.smnpo.gourd.broker.core.models.CaseVO;

/**
 *
 *
 * @ClassName    : 	MessageFilter
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/8
 *
 */

public interface MessageContentFilter {

    boolean preCheck();

    <T>boolean filter(CaseVO<T> caseVO,boolean isMain,String eventNo);


}