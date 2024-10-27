package sit.int202.simple;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Hello Aom", value = "/my-info")
public class MyInfoServer  extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello Esther!";
    }


    //constuter
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p> <b> ID: </b> 6613050020 </p>");
        out.println("<p> <b> Name: </b> Chanidapa Panta  </p>");
        out.println("<p> <b> Gpax: </b> 4.00 </p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}


