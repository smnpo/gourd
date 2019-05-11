package org.smnpo.gourd.defaule;

import org.smnpo.gourd.interfaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 *
 * @ClassName    : 	CompomemtsAutoScanConfig
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/11
 *
 */
@Configuration
public class CompomemtsAutoScanConfig {
    @Bean
    public EventConfigHandler regCenter() {return new EventConfigHandlerImpl();}
    @Bean
    public MessageContentConverter messageContentConverter() {return new MessageContentConverterImpl();}
    @Bean
    public MessageContentFilter messageContentFilter() {return new MessageContentFilterImpl();}
    @Bean
    public MessageContentSupplyHandler messageContentSupplyHandler() {return new MessageContentSupplyHandlerImpl();}
    @Bean
    public MessageLogHandler messageLogHandler() {return new MessageLogHandlerImpl();}
    @Bean
    public MessageSecondHandler messageSecondHandler() {return new MessageSecondHandlerImpl();}


}