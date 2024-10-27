package sit.int202.simple;
import sit.int202.simple.Repositories.SubjectRepository;
import sit.int202.simple.entities.Subject;

public class TestModel {
    public static void main(String[] args) {
        SubjectRepository subjectRepository = new SubjectRepository();
        for (Subject subject : subjectRepository.findAll()) {
            System.out.printf("%-6s %-30s %5.2f\n",
                    subject.getId(),
                    subject.getTitle(), subject.getCredit());
        }
        System.out.println("====================");
        System.out.println("find Subject by id");
        Subject subject = subjectRepository.findById("INT 102");
        System.out.printf("%-6s %-30s %5.2f\n",
                subject.getId(),
                subject.getTitle(), subject.getCredit());
    }
}
