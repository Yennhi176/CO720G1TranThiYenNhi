package _17_io_binary_file.bai_tap.quan_ly_sp_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<SanPham> listSp = new ArrayList<>();
    private static final String PATH_FILE = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_17_io_binary_file\\bai_tap\\quan_ly_sp_luu_ra_file_nhi_phan\\sanpham.dat";

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {

            System.out.println("\n1.thêm. " +
                    "\n2.hiển thị. " +
                    "\n3.tìm kiếm. " +
                    "\n4.thoát. "
            );

            System.out.println("nhập sự lựa chọn: ");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    themSanPham();
                    displayMenu();
                    break;
                case 2:
                    hienThiSanPham();
                    displayMenu();
                    break;
                case 3:
                    timKiemSanPham();
                    displayMenu();
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("nhập lại:");
                    displayMenu();
                    break;
            }

    }

    private static void timKiemSanPham() {

        System.out.println("nhập mã sản phẩm cần tìm kiếm: ");
        String newId = scanner.nextLine();

        for (SanPham sp : listSp) {
            if (newId.equals(sp.getMaSp())) {
                System.out.println(sp);
            }
        }

    }

    private static void hienThiSanPham() {
        docSP(listSp);
    }

    private static void themSanPham() {
        System.out.println("nhập mã sp: ");
        String maSp = scanner.nextLine();
        System.out.println("nhập tên sp: ");
        String tenSp = scanner.nextLine();
        System.out.println("nhập hãng sản xuất:");
        String hangSx = scanner.nextLine();
        System.out.println("nhập giá sp: ");
        double giaSp = Double.parseDouble(scanner.nextLine());
        System.out.println("mô tả khác: ");
        String moTa = scanner.nextLine();

        SanPham sanPham = new SanPham(maSp, tenSp, hangSx, giaSp, moTa);
        listSp.add(sanPham);
        ghiSP(listSp);
        System.out.println("thêm thành công! ");

    }

    public static void ghiSP(List<SanPham> sanPhams) {
        FileOutputStream fileOutputStream;
        ObjectOutput objectOutput = null;

        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(sanPhams);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void docSP(List<SanPham> listSp) {

        FileInputStream fileInputStream;
        ObjectInput objectInput = null;

        try {
            fileInputStream = new FileInputStream(PATH_FILE);
            objectInput = new ObjectInputStream(fileInputStream);

            // Đọc đối tượng object vào list
            List<SanPham> sanPhamList = (List<SanPham>) objectInput.readObject();
            for (SanPham sanPham : sanPhamList) {
                System.out.println(sanPham);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
