package com.yinghai.datingticket.common.util;

import javax.servlet.http.HttpServletResponse;

import com.yinghai.datingticket.common.constant.ConstantCode;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

public class ResponseVo {

	public ResponseVo() {}
	/**
	 * 参数为空,如手机号、密码、验证码、区号
	 * @param response
	 * @param msg
	 */
	public static void send101Code(HttpServletResponse response,String msg){
		String code = ConstantCode.PARAM_IS_NULL;
		common(code,msg,new JSONObject(),response);
	}
	/**
	 * 系统异常
	 * @param response
	 * @param msg
	 */
	public static void send111Code(HttpServletResponse response,String msg){
		String code = ConstantCode.SYS_EXCEPTION;
		common(code,msg,new JSONObject(),response);
	}
	
	/**
	 * 封装的响应方法
	 * @param code	响应码
	 * @param msg	响应信息
	 * @param data	响应数据
	 * @param response	响应对象
	 */
	public static void common(String code,String msg,JSON data,HttpServletResponse response){
		JSONObject responseObject = new JSONObject();
		responseObject.put("code", code);
		responseObject.put("msg", msg);
		responseObject.put("data", data);
		ResponseUtils.renderJson(response, responseObject.toString());
	}
	public static void send112Code(HttpServletResponse response, String msg) {
		String code = ConstantCode.API_VALIDATION_FAILURE;
		common(code,msg,new JSONObject(),response);
	}
}
