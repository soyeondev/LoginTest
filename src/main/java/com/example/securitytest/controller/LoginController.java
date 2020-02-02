package com.example.securitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/loginform.it", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginform() {
		System.out.println("loginform 메소드 호출입니다.");
		return "loginform";// "/WEB-INF/views/loginform.jsp"
	}

	// 로그인실패 페이지 요청
	@RequestMapping(value = "/loginfail.it", method = RequestMethod.GET)
	public String loginfail() {

		/* View 정보를 반환하는 부분 */
		return "loginfail"; // "/WEB-INF/views/loginfail.jsp"
	}

	// 로그아웃폼 페이지 요청
	@RequestMapping(value = "/logoutform.it", method = RequestMethod.GET)
	public String logoutform() {

		/* View 정보를 반환하는 부분 */
		return "logoutform"; // "/WEB-INF/views/logoutform.jsp"
	}

	// 계정별 로그인
	@RequestMapping(value = "/loginsuccess.it", method = RequestMethod.GET)
	public String loginresult() {

		return "loginsuccess";// "/WEB-INF/views/loginsuccess.jsp"
	}


}
