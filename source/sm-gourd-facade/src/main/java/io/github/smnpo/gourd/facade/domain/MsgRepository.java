package io.github.smnpo.gourd.facade.domain;

import io.github.smnpo.gourd.facade.domain.entity.MsgDO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-10 16:16
 **/
@Repository
public interface MsgRepository extends MongoRepository<MsgDO, String> {

}
