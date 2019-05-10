package org.smnpo.gourd.broker.core.handlers;

import org.smnpo.gourd.broker.core.models.CaseVO;

public interface MessageContentSupplyHandler {

    boolean preCheck();

    <T> boolean handle(CaseVO<T> caseVO, boolean isMain, String eventNo);
}
