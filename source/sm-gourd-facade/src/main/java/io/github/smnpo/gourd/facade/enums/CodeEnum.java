package io.github.smnpo.gourd.facade.enums;

import io.github.smnpo.common.restful.Code;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-08 11:34
 **/
public enum CodeEnum implements Code {
    SUCCESS(0, "success"),
    MQ_NOT_CONFIG(1, "未配置消息队列"),
    DB_NOT_CONFIG(2, "未配置数据库");

    // add code enums here

    private int code;
    private String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
