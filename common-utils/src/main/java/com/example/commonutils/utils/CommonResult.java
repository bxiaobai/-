package com.example.commonutils.utils;

import lombok.Data;

@Data
public class CommonResult {
    private Integer code;
    private String message;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private CommonResult() {}

    private CommonResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static CommonResult error(String message) {
        return new CommonResult(500, message, null);
    }

    public static CommonResult error(Integer code ,String message) {
        return new CommonResult(code, message, null);
    }

    public static CommonResult success(Object data) {
        return new CommonResult(200, "success", data);
    }

    public static CommonResult success( String message) {
        return new CommonResult(200, message, null);
    }

    public static CommonResult success(Integer code, String message) {
        return new CommonResult(code, message, null);
    }
}