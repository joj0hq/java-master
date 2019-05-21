<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: jotaro.yuza
  Date: 2019-05-21
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequestInformation</title>
    <meta charset="UTF-8">
</head>

<%!
    class RequestInfoServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            // PrintWriter out = response.getWriter();
        }
    }
%>

<body>
    <h1>リクエスト情報を表示します。</h1>
    <p>リモートIPアドレス：<%= request.getRemoteAddr() %></p>
    <p>リクエストURI：<%= request.getRequestURI() %></p>
    <p>HTTPメソッド：<%= request.getMethod() %></p>
    <p>ブラウザの種類：<%= request.getHeader("User-Agent") %></p>
    <p>利用可能ファイル種別：<%= request.getHeader("Accept") %></p>
    <p>利用可能言語：<%= request.getHeader("Accept-Language") %></p>
</body>
</html>
