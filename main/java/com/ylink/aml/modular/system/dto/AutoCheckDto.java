package com.ylink.aml.modular.system.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Auther: lida
 * @Date: 2019/7/11 14:46
 */
@Data
public class AutoCheckDto implements Serializable {
    private int autoCheckId;
    private String ruleRunId;
}
