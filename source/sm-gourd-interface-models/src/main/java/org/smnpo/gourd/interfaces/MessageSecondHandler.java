package org.smnpo.gourd.interfaces;

import org.smnpo.gourd.models.CaseVO;

public interface MessageSecondHandler<Action> {

    <T> Action secondSend(CaseVO<T> caseVO);
}
