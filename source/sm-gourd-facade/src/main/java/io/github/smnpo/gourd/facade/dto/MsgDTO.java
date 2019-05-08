package io.github.smnpo.gourd.facade.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-08 11:35
 **/
@Data
public class MsgDTO implements Serializable {
    private static final long serialVersionUID = -6426827972284347518L;

    @ApiModelProperty(
            value = "链路ID，需要保证唯一性",
            required = true,
            example = "32位UUID"
    )
    @NotBlank(message = "链路ID不能为空")
    private String traceId;

    @ApiModelProperty(
            value = "消息来源",
            required = true,
            example = "App"
    )
    @NotBlank(message = "消息来源不能为空")
    private String source;

    @ApiModelProperty(
            value = "消息编码",
            required = true,
            example = "E00001"
    )
    @NotBlank(message = "消息编码不能为空")
    private String eventNo;

    @ApiModelProperty(
            value = "消息体",
            required = true,
            example = "{\"age\",18}"
    )
    @NotNull(message = "消息体不能为null")
    private Map<String, Object> msgData;
}
