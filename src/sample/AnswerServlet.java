package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/answer")
public class AnswerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String answer = request.getParameter("answer");

        out.println("<html><head><meta charset=\"UTF-8\"><title>メッセージ</title></head><body>");
        switch (Integer.parseInt(answer)) {
            case 1:
                out.println("<h1>不正解なんだな</h1>");
                break;
            case 2:
                out.println("<h1>正解!!!</h1>");
                break;
            case 3:
                out.println("<h1>不正解だよ</h1>");
                break;
        }
        out.println("<body></html>");
    }
}
