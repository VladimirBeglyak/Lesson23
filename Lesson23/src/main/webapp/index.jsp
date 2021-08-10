<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/form" method="post">
    <label for="input_name">Enter name:</label>
    <input name="name" type="text" id="input_name">
    <label for="input_age">Enter age:</label>
    <input name="age" type="text" id="input_age">
    <button type="submit">Submit</button>
</form>
</body>
</html>