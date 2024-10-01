import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";
        System.out.println("department.name = " + department.name);

        Position position = new Position();
        position.id = 1;
        position.name = PositionName.Dev;
        System.out.println("position.name = " + position.name);

        Account account = new Account();
        account.id = 1;
        account.email ="thinh@gmail.com";
        account.userName="thinh.nq";
        account.fullName="Nguyen Quang Thinh";
        account.department = department;
        account.department.id = 1;
        account.position = account.position;
        account.createDate = LocalDate.now();
        System.out.println("account.fullName = " + account.fullName);

        Group group = new Group();
        group.id = 1;
        group.name = "Java Core";
        group.creator = account;
        group.createDate = LocalDate.of(2024, 10 , 1);
        System.out.println("group.name = " + group.name);

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.group = group;
        groupAccount.account = account;
        groupAccount.joinDate = LocalDate.of(2024,1,10);
        System.out.println("Nhân viên: " + groupAccount.account.userName + " đã tham gia nhóm: " + groupAccount.group.name);
        System.out.println("Ngày tham gia nhóm: " + groupAccount.joinDate);

        TypeQuestion type = new TypeQuestion();
        type.id = 1;
        type.name = TypeName.Multiple_Choice;
        System.out.println("Loại câu hỏi: " + type.name);

        CategoryQuestion category = new CategoryQuestion();
        category.id = 1;
        category.name = "Java";
        System.out.println("Danh mục câu hỏi: " + category.name);

        Question question = new Question();
        question.id = 1;
        question.content = "Kiểu dữ liệu nguyên thủy có mấy loại?";
        question.category = category;
        question.type = type;
        question.creator = account;
        question.createDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi: " + question.content);

        Answer answer = new Answer();
        answer.id = 1;
        answer.content = "Có 8 loại: boolean, char, byte, short, int, long, float, double";
        answer.questionId = question;
        answer.isCorrect = true;
        System.out.println("Nội dung câu trả lời: " + answer.content);

        Exam exam = new Exam();
        exam.id = 1;
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.category = category;
        exam.duration = 180;
        exam.creator = account;
        exam.createDate = LocalDate.now();
        System.out.println("Tên đề thi: " + exam.title);

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.exam = exam;
        examQuestion.question= question;
        System.out.println("Mã đề thi: " + examQuestion.exam.code + " có câu hỏi: " + examQuestion.question.content);

    }
}
