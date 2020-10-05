package _17_io_binary_file.thuc_hanh.quan_li_sp;

import _17_io_binary_file.bai_tap.quan_ly_sp_luu_ra_file_nhi_phan.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    private static final String PATH_FILE = "D:\\WorkSpace\\CodeGym\\CO720G1TranThiYenNhi\\module2\\src\\_17_io_binary_file\\thuc_hanh\\quan_li_sp\\product.dat";
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("\n1.addProduct" +
                "\n2.displayProduct" +
                "\n3.searchProduct" +
                "\n4.exit");
        System.out.println("nhập sự lựa chọn: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                addProduct();
                displayMenu();
                break;
            case 2:
                displayProduct();
                displayMenu();
                break;
            case 3:
                searchProduct();
                displayMenu();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("nhập lại: ");
                displayMenu();
                break;
        }
    }

    private static void displayProduct() {
        readProduct(productList);
    }

    private static void searchProduct() {
        System.out.println("nhập mã sản phẩm cần tìm kiếm:");
        String newCode = scanner.nextLine();

        for (Product pr: productList) {
            if(newCode.equals(pr.getCodeProduct())){
                System.out.println(pr);
            }

        }
    }

    private static void addProduct() {
        System.out.println("nhập mã sản phẩm");
        String codeProduct = scanner.nextLine();
        System.out.println("nhập tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("nhập hãng hãng");
        String delayProduct = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        int priceProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập mô tả");
        String otherDescriptions = scanner.nextLine();
        Product product = new Product(codeProduct,nameProduct,delayProduct,priceProduct,otherDescriptions);
        productList.add(product);
        writerProduct(productList);
        System.out.println("thêm thành công!");
    }

    public static void writerProduct(List<Product> products){
        FileOutputStream fileOutputStream;
        ObjectOutput objectOutput = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                objectOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readProduct(List<Product> products){
        FileInputStream fileInputStream;
        ObjectInput objectInput = null;
        try {
            fileInputStream = new FileInputStream(PATH_FILE);
            objectInput = new ObjectInputStream(fileInputStream);

            List<Product> prList = (List<Product>) objectInput.readObject();
            for (Product product: prList) {
                System.out.println(product);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                objectInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
