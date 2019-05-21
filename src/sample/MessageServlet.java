package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/message")
public class MessageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        req.setCharacterEncoding("UTF-8");
        String message = req.getParameter("message");
        String textSize = req.getParameter("textSize");

        out.println("<html><head><meta charset=\"UTF-8\"><title>メッセージ</title></head><body>");
        if (textSize.equals("big")) {
            out.println("<h1>" + message + "</h1>");
        } else if (textSize.equals("middle")) {
            out.println("<h2>" + message + "</h2>");
        } else if (textSize.equals("small")) {
            out.println("<h3>" + message + "</h3>");
        } else {
            out.println("選択してね。");
        }
        out.println("<body></html>");
    }
}
