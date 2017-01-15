<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>用户列表</title>
</head>
<body>
<s:a href="user_input.action">添加</s:a>
	<table border="1">
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>年龄</th>
			<th>操作</th>
		</tr>
		<s:iterator value="#users">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="age" /></td>
				<td>
				 <s:a href="user_input.action?user.id=%{id}">编辑</s:a>
				 <s:a href="user_delete.action?user.id=%{id}">删除</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>