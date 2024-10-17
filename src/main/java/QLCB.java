import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiém cán bộ theo tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát chương trình");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                themCanBo();
            } else if (menu.equals("2")) {
                timKiemTheoHoTen();
            } else if (menu.equals("3")) {
                hienthiDSCB();
            } else if (menu.equals("4")) {
                xoaCanBoTheoTen();
            } else if (menu.equals("5")) {
                return;
            }else {
                System.out.println("Vui lòng chọn đúng chức năng");
            }
        }
    }

    public void themCanBo() {
        System.out.println("Chọn loại cán bộ muốn thêm: ");
        System.out.println("1.Công nhân");
        System.out.println("2.Kỹ sư");
        System.out.println("3.Nhân viên");
        System.out.println("Chọn loại cán bộ muốn thêm:");
        String menu = sc.nextLine();
        if (menu.equals("1")) {
            CongNhan congNhan = nhapVaoCongNhan();
            canBoList.add(congNhan);
        } else if (menu.equals("2")) {
            KySu kySu = nhapVaoKySu();
            canBoList.add(kySu);
        } else if (menu.equals("3")) {
            NhanVien nhanVien = nhapVaoNhanVien();
            canBoList.add(nhanVien);
        } else {
            System.out.println("Vui lòng chọn đúng loại cán bộ");
        }
    }

    public void xoaCanBoTheoTen() {
        System.out.println("Nhập tên cán bộ cần xóa:");
        String ten = sc.nextLine();
        canBoList.removeIf(canBo -> canBo.hoTen.contains(ten));
    }

    public void hienthiDSCB() {
        System.out.println("Danh sách cán bộ:");
        for (CanBo canBo : canBoList) {
            System.out.println(canBo);
        }
    }

    public void timKiemTheoHoTen() {
        System.out.println("Nhập vào họ tên cần tìm:");
        String hoTen = sc.nextLine();
        for (CanBo canBo : canBoList) {
            if (canBo.hoTen.equals(hoTen)) {
                System.out.println(canBo);
            }
        }
    }

    private CongNhan nhapVaoCongNhan() {
        System.out.println("Mời bạn nhập vào thông tin công nhân.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        System.out.println("3.Khác");
        String menu = sc.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.Nam;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.Nu;
        } else {
            gioiTinh = GioiTinh.Khac;
        }
        System.out.println("Nhập vào địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập vào bậc: ");
        int bac = Integer.parseInt(sc.nextLine());
        return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);

    }

    private KySu nhapVaoKySu() {
        System.out.println("Mời bạn nhập vào thông tin kỹ sư.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        System.out.println("3.Khác");
        String menu = sc.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.Nam;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.Nu;
        } else {
            gioiTinh = GioiTinh.Khac;
        }
        System.out.println("Nhập vào địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập vào ngành đào tạo: ");
        String nganhDaoTao = sc.nextLine();
        return new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
    }

    private NhanVien nhapVaoNhanVien() {
        System.out.println("Mời bạn nhập vào thông tin nhân viên.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        System.out.println("3.Khác");
        String menu = sc.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.Nam;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.Nu;
        } else {
            gioiTinh = GioiTinh.Khac;
        }
        System.out.println("Nhập vào địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập vào ngành đào tạo: ");
        String congViec = sc.nextLine();
        return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
    }
}
