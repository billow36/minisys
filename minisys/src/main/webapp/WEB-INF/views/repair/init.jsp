<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page
	import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>初始化数据</title>
</head>

<body>
	<form id="loginForm" action="${ctx}/repair" method="post"
		class="form-horizontal">
		<input id="submit_btn" class="btn btn-primary" type="submit"
			value="初始化" />
	</form>

	<script>
		$(document).ready(function() {
			$("#loginForm").validate();
		});
	</script>
</body>
</html>
