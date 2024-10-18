import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    protected String ten;
    protected GioiTinh gioiTinh;
    protected LocalDate ngaySinh;
    protected String diaChi;

    public Person(){};

    public Person(String ten, GioiTinh gioiTinh, LocalDate ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        this.ten = sc.nextLine();
        System.out.println("Chọn giới tính: ");
        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        System.out.println("3.Khác");
        String menu = sc.nextLine();
        if (menu.equals("1")){
            this.gioiTinh = GioiTinh.Nam;
        } else if (menu.equals("2")) {
            this.gioiTinh = GioiTinh.Nu;
        } else if (menu.equals("3")) {
            this.gioiTinh = GioiTinh.Khac;
        }
        System.out.println("Nhập vào ngày sinh:");
        this.ngaySinh = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập vào địa chỉ:");
        this.diaChi = sc.nextLine();
    }

    public void showInfo(){
        System.out.println(this);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
