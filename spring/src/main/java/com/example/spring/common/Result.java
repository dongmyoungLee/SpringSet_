package com.example.spring.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Result<T> {

    private final T resultObject;
    private final ResultCode resultCode;

    public Result(ResultCode resultCode) {
        this.resultObject = null;
        this.resultCode = resultCode;
    }

    public Result(ResultCode resultCode, T resultObject) {
        this.resultObject = resultObject;
        this.resultCode = resultCode;
    }

    public T getResultObject() {
        return resultObject;
    }

    @JsonIgnore
    public ResultCode getResultCode() {
        return resultCode;
    }

    public int getCode() {
        return resultCode.getCode();
    }

    public String getMsg() {
        return resultCode.getMsg();
    }

    @JsonIgnore
    public boolean isSuccess() {
        return ResultCode.SUCCESS.equals(this.resultCode);
    }

    @JsonIgnore
    public boolean isNotSuccess() {
        return !isSuccess();
    }

    @JsonIgnore
    @Override
    public String toString() {
        return "{resultObject=" + resultObject + ", resultCode=" + resultCode + "}";
    }
}
