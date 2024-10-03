import java.util.Scanner;

public class Exercise05 {
    void question05() {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Mời bạn nhập thông tin account");

        System.out.println("Nhập vào id");
        account.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào email:");
        account.email = scanner.nextLine();

        System.out.println("Nhập vào username:");
        account.userName = scanner.nextLine();

        Position position = new Position();
        System.out.println("Nhập vào position id:");
        position.id = scanner.nextInt();
        System.out.println("Chọn position name:");
        System.out.println("1. DEV");
        System.out.println("2. TEST");
        System.out.println("3. SCRUM MASTER");
        System.out.println("4. PM");
        int menu = scanner.nextInt();
        while (menu < 1 || menu > 4) {
            System.out.println("Nhập lại");
            menu = scanner.nextInt();

        }
        if (menu == 1) {
            position.name = PositionName.Dev;
        } else if (menu == 2) {
            position.name = PositionName.Test;
        } else if (menu == 3) {
            position.name = PositionName.Scrum_Master;

        } else {
            position.name = PositionName.PM;
        }
        account.position = position;

        System.out.println("account.id = " + account.id);
        System.out.println("account.userName = " + account.userName);
        System.out.println("account.position.name = " + account.position.name);
    }

    void question06(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào thông tin phòng ban");
        Department department = new Department();

        System.out.println("Nhập vào id:");
        department.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào name:");
        department.name = scanner.nextLine();

        System.out.printf("Department[id=%d, name=%s]%n", department.id, department.name);
    }
}
