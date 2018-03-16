package com.appchina.devnew.interceptor;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenyu on 2018/3/6.
 */
public class MyInterceptor implements HandlerInterceptor {

    private Logger infoLog = LogManager.getLogger("InfoLog");
    private Logger errorLog = LogManager.getLogger("ErrorLog");

    Gson gson = new Gson();

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        infoLog.info("this is MyInterceptor preHandle:" + httpServletRequest.getRequestURL());

        String url = httpServletRequest.getRequestURL().toString();
        String method = httpServletRequest.getMethod();
        String uri = httpServletRequest.getRequestURI();
        String queryString = httpServletRequest.getQueryString();

        Map<String,Object> logMap = new HashMap<>();
        logMap.put("url", url);
        logMap.put("method", method);
        logMap.put("uri", uri);
        logMap.put("queryString", queryString);


        infoLog.info(gson.toJson(logMap));


        // 只有返回true才会继续向下执行，返回false取消当前请求

//        //获取session
//        HttpSession session = httpServletRequest.getSession(true);
//        //判断用户ID是否存在，不存在就跳转到登录界面
//        if(session.getAttribute("userId") == null){
//            logger.info("------:跳转到login页面！");
//            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/admin/login");
//            return false;
//        }else{
//            session.setAttribute("userId", session.getAttribute("userId"));
//            return true;
//        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        infoLog.info("this is MyInterceptor postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        infoLog.info("this is MyInterceptor afterCompletion");
    }
}
