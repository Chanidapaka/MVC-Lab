package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simple.Repositories.SubjectRepository;
import sit.int202.simple.entities.Subject;

import java.io.IOException;

//Controller FindSubjectServlet
@WebServlet(name = "findsubjectservlet", value = "/find-Subject")//Map URL//
public class FindSubjectServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String subjectId = request.getParameter("subjectId");
        SubjectRepository sr = new SubjectRepository();
        Subject subject = sr.findById(subjectId);
        request.setAttribute("subject", subject);
        request.getRequestDispatcher("/subject-info.jsp").forward(request, response);
    }

    public void destroy() {
    }
}

