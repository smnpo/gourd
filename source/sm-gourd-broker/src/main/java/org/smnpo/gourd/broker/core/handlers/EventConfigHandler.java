package org.smnpo.gourd.broker.core.handlers;

import org.smnpo.gourd.broker.core.models.CaseVO;
import org.springframework.stereotype.Component;

public interface EventConfigHandler {
    <T> void initMainMsgConfig(CaseVO<T> caseVO);
    <T> void initSunMsgConfigs(CaseVO<T> caseVO);
}
