//package com.ckuguaerp.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class LoginFilter implements Filter {
//
//	@Override
//	public void destroy() {
//		
//	}
//
//	@Override
//	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
//			throws IOException, ServletException {
//		HttpServletRequest request = (HttpServletRequest)arg0;
//		HttpServletResponse response = (HttpServletResponse)arg1;
//		HttpSession session = request.getSession();
//		
//		if(session.getAttribute("LOGIN_USER")==null
//				&& request.getRequestURI().indexOf("/system/login") == -1){
//			// û�е�¼
//			response.sendRedirect(request.getContextPath()+"/system/login");
//		}else{
//			// �Ѿ���¼������������һ����Դ���������ʣ�
//			arg2.doFilter(arg0, arg1);
//		}
//
//	}
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		
//	}
//
//}
