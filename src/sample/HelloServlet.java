package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class sample.HelloServlet
 */
//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse respose)
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // response.getWriter().append("Served at:").append(request.getContextPath());
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); // クライアントのブラウザにHTMLを送り返すための出力ストリームを取得
        out.println("<html><head><title>HelloServlet</title></head><body>");
        out.println("<h1>ようこそ！HelloServletへ</h1>");
        out.println("</body></html>");
    }
}
