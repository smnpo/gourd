package io.github.smnpo.gourd.facade.domain.entity;

import io.github.smnpo.gourd.facade.dto.MsgDTO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-10 16:23
 **/
@Data
@Document(collection = "message_facade")
public class MsgDO {
    @Id
    private String id;

    private MsgDTO msgData;

    private Date createTime;

    private Date updateTime;

    private Integer retry;

    private Integer status;

    public MsgDO(MsgDTO msgData) {
        this.msgData = msgData;
        this.createTime = new Date();
        this.updateTime = new Date();
        this.retry = 0;
        this.status = 1;
    }
}
