package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.EmployeeVO;

public interface EmpMapper {
	List<EmployeeVO> selectEmp();
	int insertEmp(EmployeeVO emp);
	int deleteEmp(int empId);
	EmployeeVO getEmployee(int empId);
}
