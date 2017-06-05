<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table{
		style="border: 1px solid black";
	}
</style>

</head>
<body>

<a href="/index">index</a>

	<div style="text-align: center; margin-top: 10%">
		
		<form action="/saveUser" method="post">
			<input type="text" name="username" placeholder="username">
			<br>
			<br>
			<input type="email" name="useremail" placeholder="email">
			<br>
			<br>
			<input type="password" name="userpassword" placeholder="password">
			<br>
			<br>
			
			<button>save user</button>
		</form>
		
			
	</div>
	
	
	<table style="border: 1px solid black">
		<tr>
		    <th style="border: 1px solid black">username</th>
		    <th style="border: 1px solid black">email</th>
		    <th style="border: 1px solid black">password</th>
		    <th style="border: 1px solid black">del</th>
   		</tr>
			<c:forEach var="u" items="${users}">
   				<tr>
					<th style="border: 1px solid black">${u.name}</th>
					<th style="border: 1px solid black"> ${u.email}</th> 
					<th style="border: 1px solid black">${u.password}</th> 
					<th style="border: 1px solid black"><a href="/deleteUser/${u.id}">delete</a></th><br>
				</tr>
			</c:forEach>
     		
	</table>
	
	
		
</body>
</html>