package org.smnpo.gourd.broker.core.handlers;

import com.aliyun.openservices.ons.api.Action;
import org.smnpo.gourd.broker.core.models.CaseVO;

public interface MessageSecondHandler {

    <T> Action secondSend(CaseVO<T> caseVO);
}
