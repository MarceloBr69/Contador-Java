<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Ud ha visto esta pagina <c:out value="${contador}"/> veces</p>
	<a href="/opcional">Desea volver a testear esta pagina?</a>
</body>
</html>