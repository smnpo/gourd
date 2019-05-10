package org.smnpo.gourd.broker;

public enum MessageLogStatusEnum {
    SENT(0),
    RECEIVE(1),
    FINISHED(2),
    ;

    private int code;

    MessageLogStatusEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
