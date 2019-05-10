package org.smnpo.gourd.broker.core.handlers;

import org.smnpo.gourd.broker.core.models.CaseVO;

public interface MessageContentConverter {

    boolean preCheck();

    <T> boolean convert(CaseVO<T> caseVO, boolean isMain, String eventNo);
}
