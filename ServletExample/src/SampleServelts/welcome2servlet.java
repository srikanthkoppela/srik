package SampleServelts;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class welcome2servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter= resp.getWriter();
        printWriter.print("<html><body>");

        printWriter.print("<h1> welcome to servlet2 programing</h1>");
        printWriter.print("</body></html>");
    }
}
