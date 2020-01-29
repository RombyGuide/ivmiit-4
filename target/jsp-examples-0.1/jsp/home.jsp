<%--
  Created by IntelliJ IDEA.
  User: blino
  Date: 29.01.2020
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span style="color: #00CC00">Hello</span>
<form method="post" action="/jsp_examples_war/home">
    <label for="color">
         <select name="color" id="color">
             <option value="red">Красный</option>
             <option value="black">Черный</option>
             <option value="white">Белый</option>
         </select>
    </label>
</form>
<input type="submit" value="Color send">

</body>
</html>
