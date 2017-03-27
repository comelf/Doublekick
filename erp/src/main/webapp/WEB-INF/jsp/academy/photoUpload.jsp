<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Upload Multiple File Request Page</title>
</head>
<body>
	<form method="POST" action="/academy/photo/upload" enctype="multipart/form-data">
		File1 to upload: <input type="file" name="file">
 
		Name1: <input type="text" name="name">
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
</body>
</html>