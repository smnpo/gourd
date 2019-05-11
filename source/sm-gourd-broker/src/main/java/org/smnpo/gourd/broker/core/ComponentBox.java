package org.smnpo.gourd.broker.core;

import org.smnpo.gourd.interfaces.MessageContentConverter;
import org.smnpo.gourd.interfaces.MessageContentFilter;
import org.smnpo.gourd.interfaces.MessageContentSupplyHandler;
import org.smnpo.gourd.models.MessageConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author :	xing.chen
 * @ClassName : 	ComponentBox
 * @Description : 	TODO
 * @date :	2019/5/8
 */
@Component
public class ComponentBox {

    @Autowired
    private Map<String, MessageContentFilter>        filterMap;
    @Autowired
    private Map<String, MessageContentSupplyHandler> supplyHandlerMap;
    @Autowired
    private Map<String, MessageContentConverter>     converterMap;

    public MessageContentFilter getFilter(MessageConfigVO configVO) {

        if (StringUtils.isEmpty(configVO.getFilter()) || filterMap.get(configVO.getFilter()) != null) {
            return filterMap.get("messageContentFilterImpl");
        } else {
            if (filterMap.get(configVO.getFilter()).preCheck()) {
                return filterMap.get(configVO.getFilter());
            } else {
                return filterMap.get("messageContentFilterImpl");
            }
        }
    }

    public MessageContentSupplyHandler getSupplyHandler(MessageConfigVO configVO) {

        if (StringUtils.isEmpty(configVO.getFilter()) || supplyHandlerMap.get(configVO.getSupplement()) != null) {
            return supplyHandlerMap.get("messageContentSupplyHandlerImpl");
        } else {
            if (supplyHandlerMap.get(configVO.getSupplement()).preCheck()) {
                return supplyHandlerMap.get(configVO.getSupplement());
            } else {
                return supplyHandlerMap.get("messageContentSupplyHandlerImpl");
            }
        }
    }

    public MessageContentConverter getConverter(MessageConfigVO configVO) {

        if (StringUtils.isEmpty(configVO.getConverter()) || converterMap.get(configVO.getConverter()) != null) {
            return converterMap.get("messageContentConverterImpl");
        } else {
            if (converterMap.get(configVO.getConverter()).preCheck()) {
                return converterMap.get(configVO.getConverter());
            } else {
                return converterMap.get("messageContentConverterImpl");
            }
        }
    }

}