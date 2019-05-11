package org.smnpo.gourd.interfaces;

import org.smnpo.gourd.models.CaseVO;

public interface EventConfigHandler {

    <T> void initMainMsgConfig(CaseVO<T> caseVO);

    <T> void initSunMsgConfigs(CaseVO<T> caseVO);
}
