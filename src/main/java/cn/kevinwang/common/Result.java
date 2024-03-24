package cn.kevinwang.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @author wang
 * @create 2024-02-14-12:07
 */
public class Result<T>  {

    private Integer code;
    private String message;
    private T data;

    public Result() {
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static<T> Result success(T data){
        return new Result(Constance.ResponseCode.SUCCESS,"success",data);
    }


    public static Result fail(String message){
        return new Result(Constance.ResponseCode.FAIL,message,null);
    }

    public static Result fail(Integer code,String message){
        return new Result(code,message,null);
    }

    public static Result fail(RuntimeException e){
        return new Result(Constance.ResponseCode.FAIL,e.getMessage(),null);
    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
