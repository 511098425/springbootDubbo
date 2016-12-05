package com.jsbn.wedding.bus.common;

import java.io.Serializable;

/**  
 *
 *项目名称：WeddingBOS
 *
 *描述：数据返回协议类
 *
 *创建人：Mr.chang
 *
 *创建时间：2016年8月5日 下午4:05:51 
 *   
 * Copyright @ 2016 by Mr.chang  
 *   
 */
public class Result implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3927712607948198789L;
	
	private Boolean success;//是否成功
	private String message;//返回消息
	private Object data;//返回数据
	private long count;//总条数
	
	public Result(Boolean success, String message, Object data, long count) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
		this.count = count;
	}
	public Result(Boolean success, String message, Object data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}
	
	public Result(Boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
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
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
}
  