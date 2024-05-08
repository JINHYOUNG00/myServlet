package com.yedam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.Control;
import com.yedam.common.DataSource;
import com.yedam.mapper.EmpMapper;

public class RegisterControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		SqlSession session = DataSource.getInstance().openSession();
//		EmpMapper mapper = session.getMapper(EmpMapper.class);
//		
//	
		
		req.getRequestDispatcher("WEB-INF/info/registerEmp.jsp").forward(req, resp);
		
	}

}
