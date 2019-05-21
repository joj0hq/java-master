<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: jotaro.yuza
  Date: 2019-05-21
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>今日の運勢は？</title>
    <meta charset="UTF-8">
</head>

<%!
    private static String omikuji() {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;

        switch (dice) {
            case 0:
                return "大吉";
            case 1:
                return "中吉";
            case 2:
                return "小吉";
            default:
                return "吉";
        }
    }
%>


<body>
    <h1>今日の運勢は、、、<span style="color: #ff0000">「<%= omikuji() %>」</span></h1>
</body>
</html>
