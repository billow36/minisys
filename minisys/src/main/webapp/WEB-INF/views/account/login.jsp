<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/include/taglib.jsp"%>
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

<link href="${ctxRS}/css/pages/login.css" rel="stylesheet" />

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<div id="login-container">
		<div id="login-header">
			<h3>登陆</h3>
		</div>
		<!-- /login-header -->

		<div id="login-content" class="clearfix">
			<form action="./" />
			<fieldset>
				<div class="control-group">
					<label class="control-label" for="username">用户名</label>
					<div class="controls">
						<input type="text" class="" id="username" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="password">密码</label>
					<div class="controls">
						<input type="password" class="" id="password" />
					</div>
				</div>
			</fieldset>

			<div id="remember-me" class="pull-left">
				<input type="checkbox" name="remember" id="remember" /> <label
					id="remember-label" for="remember">记住用户名</label>
			</div>

			<div class="pull-right">
				<button type="submit" class="btn btn-warning btn-large">登陆
				</button>
			</div>
			</form>

		</div>
		<!-- /login-content -->


		<div id="login-extra">

			<p>
				没有帐户? <a href="javascript:;">注册</a>
			</p>

			<p>
				忘记密码? <a href="forgot_password.html">找回密码</a>
			</p>

		</div>
		<!-- /login-extra -->

	</div>
	<!-- /login-wrapper -->



	<!-- Le javascript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="${ctxStatic}/jquery/jquery-1.9.1.min.js"></script>

	<script src="${ctxStatic}/bootstrap/2.3.2/js/bootstrap.min.js"></script>

</body>
</html>
