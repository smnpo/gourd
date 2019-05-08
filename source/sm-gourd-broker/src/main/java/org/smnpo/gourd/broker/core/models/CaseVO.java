package org.smnpo.gourd.broker.core.models;

import com.aliyun.openservices.ons.api.Message;
import lombok.Data;

import java.util.Map;

/**
 *
 *
 * @ClassName    : 	CaseVO
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/8
 *
 */
@Data
public class CaseVO<T> {
    private String                   traceId;
    private String                   mainEventNO;
    private MessageVO<T>             mainMessageVO;
    private Map<String,MessageVO<T>> subMsgs;

}