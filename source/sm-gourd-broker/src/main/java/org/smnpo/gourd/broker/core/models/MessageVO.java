package org.smnpo.gourd.broker.core.models;

import lombok.Data;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageVO
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Data
public class MessageVO<T> {
    private T message;
    private MessageConfigVO configVO;
    private Object supplement;
    private Object sentData;
}