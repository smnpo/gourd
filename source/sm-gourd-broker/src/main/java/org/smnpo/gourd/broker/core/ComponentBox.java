package org.smnpo.gourd.broker.core;

import org.smnpo.gourd.broker.core.handlers.MessageContentConverter;
import org.smnpo.gourd.broker.core.handlers.MessageContentFilter;
import org.smnpo.gourd.broker.core.handlers.MessageContentSupplyHandler;
import org.smnpo.gourd.broker.core.models.MessageConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @ClassName    : 	ComponentBox
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/8
 *
 */
@Component
public class ComponentBox {

    @Autowired
    private Map<String, MessageContentFilter> filterMap = new HashMap<>();
    @Autowired
    private Map<String, MessageContentSupplyHandler> supplyHandlerMap = new HashMap<>();
    @Autowired
    private Map<String, MessageContentConverter> converterMap = new HashMap<>();

    public MessageContentFilter getFilter(MessageConfigVO configVO){

        if(StringUtils.isEmpty(configVO.getFilter())||filterMap.get(configVO.getFilter())!=null){
            return filterMap.get("messageContentFilterImpl");
        }else{
            if(filterMap.get(configVO.getFilter()).preCheck()){
                return filterMap.get(configVO.getFilter());
            }else{
                return filterMap.get("messageContentFilterImpl");
            }
        }
    }
    public MessageContentSupplyHandler getSupplyHandler(MessageConfigVO configVO){

        if(StringUtils.isEmpty(configVO.getFilter())||supplyHandlerMap.get(configVO.getSupplement())!=null){
            return supplyHandlerMap.get("messageContentSupplyHandlerImpl");
        }else{
            if(supplyHandlerMap.get(configVO.getSupplement()).preCheck()){
                return supplyHandlerMap.get(configVO.getSupplement());
            }else{
                return supplyHandlerMap.get("messageContentSupplyHandlerImpl");
            }
        }
    }
    public MessageContentConverter getConverter(MessageConfigVO configVO){

        if(StringUtils.isEmpty(configVO.getConverter())||converterMap.get(configVO.getConverter())!=null){
            return converterMap.get("messageContentConverterImpl");
        }else{
            if(converterMap.get(configVO.getConverter()).preCheck()){
                return converterMap.get(configVO.getConverter());
            }else{
                return converterMap.get("messageContentConverterImpl");
            }
        }
    }

}