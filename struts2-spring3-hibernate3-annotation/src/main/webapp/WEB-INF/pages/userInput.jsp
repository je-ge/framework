<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>用户列表</title>
</head>
<body>
	<s:form action="user_save">
	  <s:hidden name="user.id"/>
	  <s:textfield label="用户名" name="user.name"/><br/>
	  <s:textfield label="年龄" name="user.age"/><br/>
	  <s:submit value="保存"/>
	</s:form>
</body>
</html>