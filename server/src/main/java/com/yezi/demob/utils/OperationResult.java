package com.yezi.demob.utils;

import lombok.Data;

/**
 * @Author: yezi
 * @Date: 2019/4/17 08 00
 * @Description:
 */
@Data
public class OperationResult {
    private String returnCode;
    private String msg;
    private Object data;

    public static OperationResult ok(Object data) {
        OperationResult result = new OperationResult();
        result.setReturnCode(StatusCode.SUCCESS.getStatusCode());
        result.setMsg(null);
        result.setData(data);
        return  result;
    }

    public static OperationResult error(String code, String msg, Object data) {
        OperationResult result = new OperationResult();
        result.setReturnCode(code);
        result.setMsg(msg);
        result.setData(data);
        return  result;
    }

}
