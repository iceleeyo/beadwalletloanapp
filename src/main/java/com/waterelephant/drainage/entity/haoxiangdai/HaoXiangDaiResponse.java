/******************************************************************************
 * Copyright (C) 2016 Wuhan Medical union Co.Ltd All Rights Reserved. 
 * 本软件为武汉水象科技有限公司开发研制。 未经本公司正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.waterelephant.drainage.entity.haoxiangdai;

/**
 * Module: 
 * HaoXiangDaiResponse.java 
 * @author huangjin
 * @since JDK 1.8
 * @version 1.0
 * @description: <描述>
 */
public class HaoXiangDaiResponse {
	public static final int CODE_SUCCESS = 200; // 接口调用成功
	public static final int CODE_NETERROR = 100; // 接口调用失败
	public static final int CODE_DUPLICATECALL = 101; // 重复调用
	public static final int CODE_PARAMETER = 103; // 参数错误

	private int code; // 状态码
	private String msg;// 状态码对应信息
	private Object response; // 响应数据

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

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

}
