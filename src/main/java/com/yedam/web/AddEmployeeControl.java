package com.yedam.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.Control;
import com.yedam.common.DataSource;
import com.yedam.mapper.EmpMapper;
import com.yedam.vo.EmployeeVO;

public class AddEmployeeControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String a = req.getParameter("eid");
		String b = req.getParameter("first_name");
		String c = req.getParameter("last_name");
		String d = req.getParameter("email");
		String e = req.getParameter("job");
		
		EmployeeVO emp = new EmployeeVO();
		emp.setEmployeeId(Integer.parseInt(a));
		emp.setFirstName(b);
		emp.setLastName(c);
		emp.setEmail(d);
		emp.setJobId(e);
		
		SqlSession session = DataSource.getInstance().openSession(true);
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		PrintWriter out = resp.getWriter();
		if(mapper.insertEmp(emp) == 1) {
			out.print("OK");
		} else {
			out.print("ERROR");
		}
		
		
		
		
	}

}
