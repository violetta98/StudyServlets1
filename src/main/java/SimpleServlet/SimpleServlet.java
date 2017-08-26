package SimpleServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String string = request.getQueryString();
        response.setContentType("text/html;charset=utf-8"); // без этого наш текст не будет трактоваться, как html
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<h2>" + string + "</h2>"); // выводим строку get запроса
    }

}
