package SampleServelts;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("inside init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("inside config method");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("inside service method");
        PrintWriter printWriter= servletResponse.getWriter();
        printWriter.print("<html><body>");
        printWriter.print("<h1> welcome to servlet programing</h1>");
        printWriter.print("</body></html>");
    }

    @Override
    public String getServletInfo() {
        System.out.println("inside info method");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("inside destroy method");

        System.out.println("this is srikanth");
    }
}
