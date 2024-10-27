package sit.int202.simple;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import sit.int202.simple.Repositories.SubjectRepository;
import sit.int202.simple.entities.Subject;

//2.Create Servlet
//Create collection of subject when servlet instantiate
@WebServlet(name = "SubjectListServlet", value = "/subject-list")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Subject> subjects = new SubjectRepository().findAll();
        request.setAttribute("subjects", subjects);

        //Forward collection to JSP foe each HTTP Request
        request.getRequestDispatcher("/subject_listing.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}

