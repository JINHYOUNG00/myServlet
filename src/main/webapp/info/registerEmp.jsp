<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- info/registerEmp.jsp -->
	<h3>사원등록화면...</h3>
	<form action="addEmp.do" method="post">
		<table border="1">
			<tr>
				<th>사원번호</th>
				<td><input type="number" name="eid"></td>
			</tr>
			<tr>
				<th>사원명</th>
				<td><input type="text" name="last_name"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="first_name"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<th>직무</th>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">입력</button></td>
			</tr>
		</table>
	</form>
</body>
</html>