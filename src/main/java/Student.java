import java.util.Scanner;

public class Student extends Person {
    private String maSinhVien;
    private double diemTrungBinh;
    private String email;


    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên:");
        this.maSinhVien = sc.nextLine();
        System.out.println("Nhập vào điểm trung bình:");
        this.diemTrungBinh = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào email:");
        this.email = sc.nextLine();
    }

    public boolean duocHongBongKhong(){
        return diemTrungBinh >= 8.0;
    }
    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", email='" + email + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                "} " + super.toString();
    }
}
