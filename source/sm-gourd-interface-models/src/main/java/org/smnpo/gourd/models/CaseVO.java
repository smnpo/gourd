package org.smnpo.gourd.models;

import lombok.Data;

import java.util.Map;

/**
 * @author :	xing.chen
 * @ClassName : 	CaseVO
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Data
public class CaseVO<T> {
    private String traceId;
    private String mainEventNO;
    private MessageVO<T> mainMessageVO;
    private Map<String, MessageVO<T>> subMsgs;

}