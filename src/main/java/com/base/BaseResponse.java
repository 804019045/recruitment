package com.base;

public class BaseResponse {
    private int code;       //交互状态码（1：成功；其他：失败）
    private String msg;     //交互失败的错误信息
    private Object data;    //交互的数据(可能是字符串，也可能是数组，也可能是对象)

    public BaseResponse() {
        this.code = 1;
        this.msg = "success";
        this.data = null;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseRespose{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

