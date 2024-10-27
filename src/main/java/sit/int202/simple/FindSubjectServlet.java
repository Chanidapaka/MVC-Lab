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

    //ตอนเรียกมา
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //ตัวแปร subjectId
        String subjectId = request.getParameter("subjectId");

        //เรียก Model ขึ้นมา
        SubjectRepository sr = new SubjectRepository();

        //เอา พารามิเตอร์ subjectId มาค้นหา
        Subject subject = sr.findById(subjectId);

        //เอา  subjectId มาเซ็ตAttribute
        request.setAttribute("subject", subject);
        request.getRequestDispatcher("/subject-info.jsp").forward(request, response); //view ชื่อsubject-info
    }

    public void destroy() {
    }
}

