package com.yedam.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.Control;
import com.yedam.common.DataSource;
import com.yedam.mapper.EmpMapper;
import com.yedam.vo.EmployeeVO;

public class InfoControl implements Control {

	@Override
	public void exec(HttpServletRequest req,HttpServletResponse resp)  throws ServletException, IOException {
		System.out.println("InfoControl 호출");
		// 서블릿의 정보 -> jsp 페이지 출력.
		// info.do -> info.jsp 요청재지정.
		// 전달해야할 값
		req.setAttribute("req", req);
		req.setAttribute("name", "홍길동");
		System.out.println("address: " + req);
		
		SqlSession session = DataSource.getInstance().openSession();
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmployeeVO> list = mapper.selectEmp();
		req.setAttribute("elist", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("info.jsp");
		rd.forward(req, resp);
	}

}
