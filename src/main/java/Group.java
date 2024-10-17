import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createDate;
    Account[] accounts;

    Group(){
    };

    Group(String name, Account creator, Account[] accounts, LocalDate createDate){
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
        this.accounts = accounts;
    }
    Group(String name, Account creator, String[] usernames, LocalDate createDate){
        this.name = name;
        this.creator = creator;
        Account[] acc = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account a = new Account();
            a.userName = usernames[i];
            acc[i] = a;
        }
    }

}
