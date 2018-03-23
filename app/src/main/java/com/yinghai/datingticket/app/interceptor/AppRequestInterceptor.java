package com.yinghai.datingticket.app.interceptor;


import com.yinghai.datingticket.app.util.ValidateAPITokenUtil;
import com.yinghai.datingticket.common.util.ResponseVo;
import net.sf.json.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class AppRequestInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String apiSendTime = request.getParameter("apiSendTime");
		String apiToken = request.getParameter("apiToken");
		boolean success= ValidateAPITokenUtil.ValidatingApiToken(apiSendTime, apiToken);
		if(!success){
			ResponseVo.send112Code(response,"api验证失败！");
			return false;
		}
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

	


}
