package org.smnpo.gourd.models;

import lombok.Data;

import java.util.Map;

/**
 * @author :	xing.chen
 * @ClassName : 	MessageConfigVO
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Data
public class MessageConfigVO {

    private String filter;
    private Map<String, Object> filterParameter;
    private String converter;
    private Map<String, Object> converterParameter;
    private String supplement;
    private Map<String, Object> supplementParameter;
}