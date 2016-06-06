<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>吉他的查询与输出</title>
<link rel="stylesheet" href="css/normalize.css">
<style  type="text/css">
body { 
	width: 100%;
	height:100%;
	font-family: 'Open Sans', sans-serif;
	background: url(images/bg.jpg) no-repeat center;
	background-size:100% 300%;
}
.table-a table{border-right:1px solid #00F;border-bottom:1px solid #00F}
.table-a table td{border-top:1px solid #00F;border-left:1px solid #00F}
</style>
</head>
<body>
	<h1 align="center" > 搜索结果如下</h1>
	<div class="table-a">
	<table  border="0"  align="center">
		<tr>
			<td style="background-color:#FFF68F;width:100px;"><strong><font style="color:#4B0082">编号</font></strong></td>
			<td style="background-color:#FFF68F;width:100px;"><strong><font style="color:#4B0082">价格</font></strong></td>
			<td style="background-color:#FFF68F;width:100px;"><strong><font style="color:#4B0082">制造者</font></strong></td>
			<td style="background-color:#FFF68F;width:100px;"><strong><font style="color:#4B0082">模式</font></strong></td>
			<td style="background-color:#FFF68F;width:100px;"><strong><font style="color:#4B0082">类型</font></strong></td>
			<td style="background-color:#FFF68F;width:100px;"><strong><font style="color:#4B0082">背木</font></strong></td>
			<td style="background-color:#FFF68F;width:100px;"><strong><font style="color:#4B0082">顶木</font></strong></td>

		</tr>

		<c:forEach items="${requestScope.list}" var="guitar">
			<tr>
				<td>${guitar.serialNumber}</td>
				<td>${guitar.price}</td>
				<td>${guitar.spec.builder }</td>
				<td>${guitar.spec.model}</td>
				<td>${guitar.spec.type}</td>
				<td>${guitar.spec.backWood}</td>
				<td>${guitar.spec.topWood}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="index.html">返回首页</a>
	</div>
</body>
</html>