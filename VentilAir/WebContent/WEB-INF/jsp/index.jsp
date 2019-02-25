<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
<html xmlns="http://www.w3.org/1999/xhtml"> 

	<head> 
		<meta http-equiv="content-type" content="text/html;charset=utf-8" /> 
	</head> 


		<body> 

			<p>Welcome to Ventil-Air Calculator!!!</p>
			
			<a href="rectangular/showForm">Calculate rectangular air ducts</a>
			<img src="${pageContext.request.contextPath}/resources/images/rect-duct.jpg"/>
			
			<br></br>
			
			<a href="circular/showForm">Calculate circular air ducts</a>
			<img src="${pageContext.request.contextPath}/resources/images/spiro-duct.jpg"/>
			
			<br><br>
	
		</body> 

</html>