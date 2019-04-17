package com.yezi.demob.utils;


/**
 * @Author: yezi
 * @Date: 2019/4/17 08 10
 * @Description: 状态码枚举类
 */
public enum StatusCode {

    SUCCESS("请求成功", "200"),
    GATEWAY("服务器异常", "502"),
    SERVER_ERROR("内部服务器异常", "500"),
    BADREQUEST("客户端请求参数错误", "400"),
    UNAUTHORIZED("请求用户身份", "401"),
    NOTFOUND("服务器无法返回对应的资源", "404");

    private String statusMsg;
    private String statusCode;


    StatusCode(String statusMsg, String statusCode) {
        this.statusMsg = statusMsg;
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
