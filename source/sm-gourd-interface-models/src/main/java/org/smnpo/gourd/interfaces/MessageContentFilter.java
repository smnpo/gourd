package org.smnpo.gourd.interfaces;

import org.smnpo.gourd.models.CaseVO;

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