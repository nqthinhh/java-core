import java.time.LocalDate;

public class Account {
    int id;
    String email;
    String userName;
    String fullName;
    Department department;
    Position position;
    LocalDate createDate;


    Account() {
    }

    ;

    Account(int id, String email, String userName, String fistname, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fistname + lastName;
    }

}
