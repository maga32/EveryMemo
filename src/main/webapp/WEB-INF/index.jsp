<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<meta http-equiv="content-language" content="kr">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
</head>
<body>
	<%--@ include file="template/header.jsp" --%>
	<jsp:include page="${ param.body }" />
	<%--@ include file="template/footer.jsp" --%>
</body>
</html>