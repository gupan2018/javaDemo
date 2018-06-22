<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<!--主要-->
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css" />
<!--加了些颜色的配比-->
<link rel="stylesheet"
	href="bootstrap-3.3.7-dist/css/bootstrap-theme.css" />
<link rel="stylesheet" href="styles/login.css" />
</head>
<body>
	<div>
		<form class="form-horizontal">
			<!-- 用户名输入框 -->
			<div class="form-group">
				<label class="col-sm-2 control-label">用户名:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputUser"
						placeholder="用户名">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">密码:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="inputPassword3"
						placeholder="密码">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label> <input type="checkbox"> 记住密码
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">登录</button>
				</div>
			</div>
		</form>
	</div>

	<script src="juery-1.12.4.min.js"></script>
	<script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</body>
</html>
