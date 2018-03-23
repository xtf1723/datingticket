package com.yinghai.datingticket.app.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 拦截器
 * @author Administrator
 *
 */
public class AccessTokenInterceptor implements HandlerInterceptor{
	private Logger log = Logger.getLogger(this.getClass());

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		/*String userId = request.getParameter("userId");
		if(userId==null){
			System.out.println("***********已被拦截");
			return false;
		}
		System.out.println("*********拦截器"+userId);*/
		System.out.println("AccessTokenInterceptor************运行中");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
