<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/include/taglib.jsp"%>
<%@ page
	import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<html>
<head>
<meta charset="utf-8" />
<title>XXX系统</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="apple-mobile-web-app-capable" content="yes" />

<link href="${ctxStatic}/bootstrap/2.3.2/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="${ctxStatic}/bootstrap/2.3.2/css/bootstrap-responsive.min.css"
	rel="stylesheet" />

<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
	rel="stylesheet" />
<link href="${ctxRS}/css/font-awesome.css" rel="stylesheet" />
<link href="${ctxRS}/css/adminia.css" rel="stylesheet" />
<link href="${ctxRS}/css/adminia-responsive.css" rel="stylesheet" />

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<%@ include file="/WEB-INF/layouts/header.jsp"%>
	<h5>功能导航界面</h5>

	<script>
		$(document).ready(function() {
			$("#loginForm").validate();
		});
	</script>
</body>
</html>
