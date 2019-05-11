package org.smnpo.gourd.interfaces;

import org.smnpo.gourd.models.CaseVO;

public interface MessageContentSupplyHandler {

    boolean preCheck();

    <T> boolean handle(CaseVO<T> caseVO, boolean isMain, String eventNo);
}
