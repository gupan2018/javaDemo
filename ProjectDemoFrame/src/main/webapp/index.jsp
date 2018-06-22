<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/favicon.ico" type="image/ico" />

<title>滚滚后台管理</title>

<!-- Bootstrap -->
<link href="vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- iCheck -->
<link href="vendors/iCheck/skins/flat/green.css" rel="stylesheet">

<!-- bootstrap-progressbar -->
<link
	href="vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet">
<!-- JQVMap -->
<link href="vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet" />
<!-- bootstrap-daterangepicker -->
<link href="vendors/bootstrap-daterangepicker/daterangepicker.css"
	rel="stylesheet">

<!-- Datatables -->
<link href="vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<!-- 右侧菜单栏 -->
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<!-- 页面显示设置 -->
					<div class="navbar nav_title" style="border: 0;">
						<a href="index.html" class="site_title"><i class="fa fa-paw"></i>
							<span>滚滚后台管理</span></a>
					</div>

					<div class="clearfix"></div>

					<!-- 个人信息区域 -->
					<div class="profile clearfix">
						<!-- 设置个人头像 -->
						<div class="profile_pic">
							<img src="images/head.jpg" alt="..."
								class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>欢迎您!!!</span>
							<h2>圆滚滚</h2>
						</div>
					</div>
					<!-- /menu profile quick info -->

					<br />

					<!-- 右侧菜单栏显示区域 -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">
						<div class="menu_section">

							<h3>常规设置</h3>
							<ul class="nav side-menu">
								<!-- 选项1 -->
								<li><a><i class="fa fa-home"></i> 功&nbsp;&nbsp;能 <span
										class="fa fa-chevron-down"></span></a>
										
									<ul class="nav child_menu">
										<li><a href="index.html">主&nbsp;&nbsp;页</a></li>
										<li><a href="index.html">角色管理</a></li>
										<li><a href="index2.html">管理员</a></li>
										<li><a href="index3.html">资费管理</a></li>
										<li><a href="index3.html">服务账号</a></li>
										<li><a href="index3.html">业务账号</a></li>
										<li><a href="index3.html">账单管理</a></li>
										<li><a href="index3.html">报&nbsp;&nbsp;表</a></li>
										<li><a href="index3.html">个人信息</a></li>
										<li><a href="index3.html">修改资料</a></li>
									</ul>
								</li>
								<!-- 选项2 -->
								<li><a><i class="fa fa-edit"></i> 编辑 <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="form.html">子选项1</a></li>
										<li><a href="form_advanced.html">子选项2</a></li>
									</ul>
								</li>
							</ul>
						</div>
					</div>
					<!-- /个人信息区域 -->
				</div>
			</div>


			<!-- 右侧区域顶部菜单栏 -->
			<div class="top_nav">
				<div class="nav_menu">
					<nav>
						<!-- 菜单按钮 -->
						<div class="nav toggle">
							<a id="menu_toggle"><i class="fa fa-bars"></i></a>
						</div>

						<ul class="nav navbar-nav navbar-right">
							<!-- 个人信息设置区域 -->
							<li class=""><a href="javascript:;"
								class="user-profile dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> <!-- 头像展示 --> <img
									src="images/head.jpg" alt=""> 圆滚滚 <span
									class=" fa fa-angle-down"></span>
							</a> <!-- 下拉菜单展示链接 -->
								<ul class="dropdown-menu dropdown-usermenu pull-right">
									<!-- 个人信息展示按钮 -->
									<li><a href="javascript:;"> Profile</a></li>

									<!-- 设置按钮 -->
									<li>
										<a href="javascript:;"> <span
											class="badge bg-red pull-right">50%</span> <span>Settings</span>
										</a>
									</li>

									<!-- 帮助按钮 -->
									<li><a href="javascript:;">Help</a></li>

									<!-- 登出按钮 -->
									<li>
										<a href="login.html">
										 <i class="fa fa-sign-out pull-right"></i> Log Out
										</a>
									</li>
								</ul></li>

							<!-- 未读邮件展示 -->
							<li role="presentation" class="dropdown">
								<a href="javascript:;" class="dropdown-toggle info-number"
									data-toggle="dropdown" aria-expanded="false"> <!-- 邮件图标代码 -->
									<i class="fa fa-envelope-o"></i> 
									<!-- 未读邮件条数 --> 
									<span class="badge bg-green">6</span>
								</a> 
								<!-- 未读邮件详细展示 -->
								<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
									role="menu">
									<!-- 一条未读邮件信息 -->
									<li><a> 
										<span class="image"> <img
												src="images/head.jpg" alt="Profile Image" />
										</span> <span> <!-- 发件人 --> <span>顾攀</span> <!-- 邮件接收时间 --> <span
												class="time">1小时前</span>
										</span> <!-- 邮件信息预览 --> <span class="message">这是邮件的简要信息</span>
									</a></li>

									<!-- 设置最大邮件展示条数,如果未读邮件超过这个数目,那么折叠显示,显示查看更多选项 -->
									<li>
										<div class="text-center">
											<a> <strong>查看更多</strong> <i class="fa fa-angle-right"></i>
											</a>
										</div>
									</li>
								</ul>
							</li>
						</ul>
					</nav>
				</div>
			</div>
			<!-- /右侧区域顶部菜单栏 -->

			

			<!-- 页面数据展示区域 -->
			<div class="right_col" role="main">
				<!-- 顶部功能区 -->

				<!-- /顶部功能区 -->
				
				<!-- 数据展示区域代码(以表格展示数据为主) -->
				
				<div class="col-md-12 col-sm-12 col-xs-12">
					<div class="x_panel">
						<!-- 数据库名 表名 -->
						<div class="x_title">
							<!-- 数据库名 表名 -->
							<h2>
								数据库名 <small>表名</small>
							</h2>

							<!-- 表顶部介绍以及功能区扩展 -->
							<ul class="nav navbar-right panel_toolbox">
								<!-- 收起表格图标功能区 -->
								<li><a class="collapse-link"> <!-- 收起表格图标 --> <i
										class="fa fa-chevron-up"></i>
								</a></li>
								<!-- /收起表格图标功能区 -->

								<!-- 设置图标功能区 -->
								<li class="dropdown">
									<a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-expanded="false">
										<!-- 设置图标 --> 
										<i class="fa fa-wrench"></i>
									</a> 
									
									<!-- 设置图标下拉菜单可选项 -->
									<ul class="dropdown-menu" role="menu">
										<!-- 选项1 -->
										<li><a href="#">Settings 1</a></li>
										<!-- 选项2 -->
										<li><a href="#">Settings 2</a></li>
									</ul>
								</li>
								<!-- /设置图标功能区 -->

								<!-- 关闭图标功能区 -->
								<li><a class="close-link"> <!-- 关闭图标 --> <i
										class="fa fa-close"></i>
								</a></li>
								<!-- /关闭图标功能区 -->
							</ul>
							<!-- /表顶部介绍以及功能区扩展 -->

							<div class="clearfix"></div>
						</div>
						<!-- /数据库名 表名 -->

						<!-- 展示表中数据内容 -->
						<div class="x_content">
							<!-- 表信息描述 -->
							<p class="text-muted font-13 m-b-30">这里描述了这张表的信息</p>

							<!-- 查询数据以表格形式展示 -->
							<table id="datatable" class="table table-striped table-bordered">
								<!-- 表头 -->
								<thead>
									<tr>
										<th>Name</th>
										<th>Position</th>
										<th>Office</th>
									</tr>
								</thead>

								<!-- 表体 -->
								<tbody>
									<!-- 第一行数据 -->
									<tr>
										<td>Tiger Nixon</td>
										<td>System Architect</td>
										<td>Edinburgh</td>
									</tr>

									<!-- 第二行数据 -->
									<tr>
										<td>Garrett Winters</td>
										<td>Accountant</td>
										<td>Tokyo</td>
									</tr>
									<!-- 第三行数据 -->
									<tr>
										<td>Ashton Cox</td>
										<td>Junior Technical Author</td>
										<td>San Francisco</td>
									</tr>

									<!-- 第四行数据 -->
									<tr>
										<td>Cedric Kelly</td>
										<td>Senior Javascript Developer</td>
										<td>Edinburgh</td>
									</tr>

									<!-- 第五行数据 -->
									<tr>
										<td>Airi Satou</td>
										<td>Accountant</td>
										<td>Tokyo</td>
									</tr>

									<!-- 第六行数据 -->
									<tr>
										<td>Brielle Williamson</td>
										<td>Integration Specialist</td>
										<td>New York</td>
									</tr>

									<!-- 第七行数据 -->
									<tr>
										<td>Herrod Chandler</td>
										<td>Sales Assistant</td>
										<td>San Francisco</td>
									</tr>

									<!-- 第八行数据 -->
									<tr>
										<td>Rhona Davidson</td>
										<td>Integration Specialist</td>
										<td>Tokyo</td>
									</tr>

									<!-- 第九行数据 -->
									<tr>
										<td>Colleen Hurst</td>
										<td>Javascript Developer</td>
										<td>San Francisco</td>
									</tr>

									<!-- 第十行数据 -->
									<tr>
										<td>Sonya Frost</td>
										<td>Software Engineer</td>
										<td>Edinburgh</td>
									</tr>
								</tbody>
							</table>
							<!-- /查询数据以表格形式展示 -->
						</div>
					</div>
				</div>
				
				<!-- /数据展示区域代码 -->
			</div>
		</div>

		<!-- 页脚版权区域 -->
		<footer>
			<div class="pull-right">
				不要版权了,反正都是抄的!!!!!!!! <a href="https://github.com/gupan2018">Gupan</a>
			</div>
			<div class="clearfix"></div>
		</footer>
		<!-- /页脚版权区域 -->
	</div>

	<!-- jQuery -->
	<script src="vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script src="vendors/nprogress/nprogress.js"></script>
	<!-- Chart.js -->
	<script src="vendors/Chart.js/dist/Chart.min.js"></script>
	<!-- gauge.js -->
	<script src="vendors/gauge.js/dist/gauge.min.js"></script>
	<!-- bootstrap-progressbar -->
	<script
		src="vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
	<!-- iCheck -->
	<script src="vendors/iCheck/icheck.min.js"></script>
	<!-- Skycons -->
	<script src="vendors/skycons/skycons.js"></script>
	<!-- Flot -->
	<script src="vendors/Flot/jquery.flot.js"></script>
	<script src="vendors/Flot/jquery.flot.pie.js"></script>
	<script src="vendors/Flot/jquery.flot.time.js"></script>
	<script src="vendors/Flot/jquery.flot.stack.js"></script>
	<script src="vendors/Flot/jquery.flot.resize.js"></script>
	<!-- Flot plugins -->
	<script src="vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
	<script src="vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
	<script src="vendors/flot.curvedlines/curvedLines.js"></script>
	<!-- DateJS -->
	<script src="vendors/DateJS/build/date.js"></script>
	<!-- JQVMap -->
	<script src="vendors/jqvmap/dist/jquery.vmap.js"></script>
	<script src="vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
	<script src="vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
	<!-- bootstrap-daterangepicker -->
	<script src="vendors/moment/min/moment.min.js"></script>
	<script src="vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
	
	<!-- Datatables -->
    <script src="vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="vendors/jszip/dist/jszip.min.js"></script>
    <script src="vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="vendors/pdfmake/build/vfs_fonts.js"></script>
	
	<!-- Custom Theme Scripts -->
	<script src="build/js/custom.min.js"></script>

</body>
</html>
