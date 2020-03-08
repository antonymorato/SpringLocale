<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>LocaleDB</title>
</head>
<body>


<form:form method="post" >
    <a href="<%=request.getContextPath()%>?lang=en">EN</a>

<%--    <form:label path = "lang">lang</form:label>--%>

    <a href="<%=request.getContextPath()%>?languageVar=ru">RU</a>
</form:form>


</body>
</html>