package io.github.smnpo.gourd.facade.handler.dbhandler;

import io.github.smnpo.gourd.facade.domain.MsgRepository;
import io.github.smnpo.gourd.facade.domain.entity.MsgDO;
import io.github.smnpo.gourd.facade.dto.MsgDTO;
import io.github.smnpo.gourd.facade.handler.DbHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-10 15:46
 **/
@Component
public class MongoHandler implements DbHandler {

    @Autowired
    private MsgRepository msgRepository;

    /**
     * 记日志
     *
     * @param msgDTO
     */
    @Override
    public void log(MsgDTO msgDTO) {
        msgRepository.save(new MsgDO(msgDTO));
    }
}
