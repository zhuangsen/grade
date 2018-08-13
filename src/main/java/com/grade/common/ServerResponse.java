package com.grade.common;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
//保证序列化json的时候,如果是null的对象,key也会消失
public class ServerResponse<T> implements Serializable {

    private int success;
    private String message;
    private T data;

    private ServerResponse(int success){
        this.success = success;
    }
    private ServerResponse(int success,T data){
        this.success = success;
        this.data = data;
    }

    private ServerResponse(int success,String message,T data){
        this.success = success;
        this.message = message;
        this.data = data;
    }

    private ServerResponse(int success,String message){
        this.success = success;
        this.message = message;
    }

//    @JsonIgnore
//    //使之不在json序列化结果当中
//    public boolean isSuccess(){
//        return this.success == ResponseCode.SUCCESS.getCode();
//    }

    public int getSuccess(){
        return success;
    }
    public T getData(){
        return data;
    }
    public String getmessage(){
        return message;
    }


    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createBySuccessMessage(String message){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),message);
    }

    public static <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ServerResponse<T> createBySuccess(String message,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),message,data);
    }


    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }


    public static <T> ServerResponse<T> createByErrorMessage(String errorMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode,String errorMessage){
        return new ServerResponse<T>(errorCode,errorMessage);
    }
}
