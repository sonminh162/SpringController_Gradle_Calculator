<%--
  Created by IntelliJ IDEA.
  User: son nguyen
  Date: 3/13/2019
  Time: 1:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Spring Calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form method="get" action="/calculate">
    <div style="display:flex;">
      <div>
        <h3>First number:</h3>
        <input type="text" value="${first}" name="firstNumber">
      </div>
      <div style="margin-left: 10px">
        <h3>Second number:</h3>
        <input type="text" value="${second}" name="secondNumber">
      </div>
    </div>
    <div style="display: flex; margin-top: 30px">
      <input type="submit" name="math" value="Addition(+)">
      <input type="submit" name="math" value="Minus(-)" style="margin-left: 10px">
      <input type="submit" name="math" value="Multiply(*)" style="margin-left: 10px">
      <input type="submit" name="math" value="Divide(/)" style="margin-left: 10px">
    </div>
  </form>
  <h3>Result: ${result}</h3>
  </body>
</html>
