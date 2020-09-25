/*
 * 	프로젝트(Project): 회원가입(Session - 세션)
 * 	파일명(File): MemberLoginController.java
 * 	생성일자(Create Date): 2020-09-25
 * 	저자(Author): Dodo / rabbit.white at daum dot net
 * 	설명(Description): 
 * 	1. JSP/Servlet으로 구현한 로그인 페이지
 * 
 */
package com.member.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberLoginController implements Controller {

	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpUtil.forward(req, res, "/WEB-INF/views/member/login.jsp");
		
	}

}
