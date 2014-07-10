<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${name} <br />
	<ul>
	<#list scores as score>
	  <li>${score["type"]!""} = ${score["score"]!""}</li>
	</#list>
	</ul>
</body>
</html>