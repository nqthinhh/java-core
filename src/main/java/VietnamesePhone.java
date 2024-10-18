import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VietnamesePhone extends Phone {
    private List<Contact> contactList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm liên hệ");
            System.out.println("2. Xóa liên hệ");
            System.out.println("3. Cập nhật liên hệ");
            System.out.println("4. Tìm kiếm liên hệ");
            System.out.println("5. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng: ");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                System.out.println("Nhập vào tên:");
                String name = sc.nextLine();
                System.out.println("Nhập vào phone:");
                String phone = sc.nextLine();
                insertContact(name, phone);
            } else if (menu.equals("2")) {
                System.out.println("Nhập vào tên cần xóa:");
                String name = sc.nextLine();
                removeContact(name);
            } else if (menu.equals("3")) {
                System.out.println("Nhập vào tên:");
                String name = sc.nextLine();
                System.out.println("Nhập vào newPhone:");
                String newPhone = sc.nextLine();
                updateContact(name, newPhone);
            } else if (menu.equals("4")) {
                System.out.println("Nhập vào tên cần tìm kiếm: ");
                String name = sc.nextLine();
                searchContact(name);
            } else if (menu.equals("5")) {
                return;
            } else {
                System.out.println("Mời nhập lại");
            }
        }
    }

    @Override
    void insertContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        contactList.add(contact);
    }

    @Override
    void removeContact(String name) {
        contactList.removeIf(contact -> contact.getName().equals(name));
    }

    @Override
    void updateContact(String name, String newPhone) {
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                contact.setPhone(newPhone);
            }
        }
    }

    @Override
    void searchContact(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) ;
            System.out.println(contact);
        }
    }
}
