package org.smnpo.gourd.interfaces;

import org.smnpo.gourd.models.CaseVO;

public interface MessageContentConverter {

    boolean preCheck();

    <T> boolean convert(CaseVO<T> caseVO, boolean isMain, String eventNo);
}
