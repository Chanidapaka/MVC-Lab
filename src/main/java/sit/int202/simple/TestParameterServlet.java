package sit.int202.simple;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "myinfoServlet", value = "/test-parameter")
public class TestParameterServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Esther!";
    }


    //constuter
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

       //input มา แบบที่2
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Map<String, String[]> parameterMap = request.getParameterMap();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p> <b> User name: </b> "+ username +" </p>");
        out.println("<p> <b> Password: </b> "+ password +" </p>");
        out.println("<hr>");
        out.println("<p> <b> User name: </b> "+ parameterMap.get("username")[0] +" </p>");
        out.println("<p> <b> Password: </b> "+ parameterMap.get("password")[0]  +" </p>");
        out.println("<a href='index.jsp'>Back</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

