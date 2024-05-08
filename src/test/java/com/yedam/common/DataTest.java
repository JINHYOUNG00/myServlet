package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.mapper.EmpMapper;
import com.yedam.vo.EmployeeVO;

public class DataTest {
	public static void main(String[] args) {
		SqlSessionFactory instance = DataSource.getInstance();
		SqlSession session = instance.openSession(false); // 디폴트 false 자동커밋 안됨
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		
//		EmployeeVO emp1 = new EmployeeVO(999,"길동" , "김", "kim@email", "IT_PROG");
//		EmployeeVO emp2 = new EmployeeVO(998,"길동" , "홍", "hong@email", "IT_PROG");
//		
//		
//		int r = mapper.insertEmp(emp2) + mapper.insertEmp(emp1);
//		System.out.println(r + "건 처리");
//		session.commit();
		
//		
//		mapper.deleteEmp(205);
//		session.commit();
		System.out.println(mapper.getEmployee(100).toString()
				);
		
		
		List<EmployeeVO> list = mapper.selectEmp(); //session.selectList("com.yedam.mapper.EmpMapper.selectEmp");
		for (EmployeeVO evo : list) {
			System.out.println(evo.toString());
		}
	}
}
