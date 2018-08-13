package SampleServelts;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Refactor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("inside service method");
        PrintWriter printWriter= resp.getWriter();
        printWriter.print("<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>HTML Forms</h2>\n" +
                "\n" +
                "<form action=\"/welcome\">\n" +
                "  First name:<br>\n" +
                "  <input type=\"text\" name=\"username\" value=\"Mickey\">\n" +
                "  <br>\n" +
                "  Last name:<br>\n" +
                "  <input type=\"text\" name=\"password\" value=\"Mouse\">\n" +
                "  <br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> \n" +
                "\n" +
                "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/action_page.php\".</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>");

       /*printWriter.print("<html><body>");
        printWriter.print("<h1> welcome to srikanthpage</h1>");
        printWriter.print("</body></html>");

        ServletConfig config= getServletConfig();
        String srikanth =config.getInitParameter("srikanth");
        System.out.println(srikanth);
        ServletContext context=getServletContext();
        System.out.println(context.getInitParameter("name"));*/
    }
}
