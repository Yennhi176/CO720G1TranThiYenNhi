package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> listProduct = new ArrayList<Product>();


    public static void main(String[] args) {
        displayMenu();

    }

    private static void displayMenu() {
        int choose = 0;
        do {
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm  tăng dần theo giá\n" +
                    "7.Sắp xếp sản phẩm  giảm dần theo giá\n" +
                    "8. thoát."
            );

            System.out.println("mời bạn nhập sự lựa chọn");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showInformationOfProduct();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
                    sortAcendingProduct();
                    break;
                case 7:
                    sortDecreaseProduct();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (choose >= 1 && choose <= 8);
    }

    private static void sortDecreaseProduct() {
        Collections.sort(listProduct, new SortbyPriceIncrease());
        showInformationOfProduct();

    }

    private static void sortAcendingProduct() {
        Collections.sort(listProduct, new SortbyPriceAcending());
        showInformationOfProduct();

    }

    private static void addNewProduct() {
        scanner.nextLine();
        System.out.println("nhập tên sản phẩm: ");
        String tenSP = scanner.nextLine();
        System.out.println("nhập id sản phẩm: ");
        int id = scanner.nextInt();
        System.out.println("nhập giá sản phẩm: ");
        double giaSP = scanner.nextDouble();

        Product product = new Product(tenSP, id, giaSP);
        listProduct.add(product);
        System.out.println(listProduct);
        System.out.println("hoàn thành!!!.....");
    }




    private static void findProduct() {
        showInformationOfProduct();
        scanner.nextLine();
        System.out.println("nhập tên sản phẩm cần tìm:");
        String valuename = scanner.nextLine();


        for (int i =0; i<listProduct.size();i++){
            if(valuename.equals(listProduct.get(i).getTenSP())){
                System.out.println(listProduct.get(i).toString());
            }
        }
    }

    private static void showInformationOfProduct() {
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }

    private static void deleteProduct() {
        System.out.println("nhập id muốn xóa:");
        int idDel = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (idDel == listProduct.get(i).getId()) {
                listProduct.remove(listProduct.get(i));
            }
        }
    }

    private static void editProduct() {
        System.out.println("nhập id muốn sửa");
        int idEdit = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập tên sản phẩm mới:");
        String newName = scanner.nextLine();
        System.out.println("nhập giá mới");
        double newPrice = scanner.nextDouble();
        for (int i = 0; i < listProduct.size(); i++) {
            if (idEdit == listProduct.get(i).getId()) {
                listProduct.get(i).setGiaSP(newPrice);
                listProduct.get(i).setTenSP(newName);
            }
        }
    }
}






