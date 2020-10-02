package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    // create a name path link:
    private static final String path = "src/_12_java_collection_framework/bai_tap/luyen_tap_su_dung_arraylist/product.csv";
    private static String NEW_LINE = "\n";
    private static String COMA =",";
    private static FileWriter fileWriter = null;
    private static ArrayList<Product> listProduct = new ArrayList<>();


   public static void writeToFileCSV(ArrayList<Product> listProduct) {

        try {

            fileWriter = new FileWriter(path);

            fileWriter.append("tenSP, id, giaSP");

            fileWriter.append(NEW_LINE);
            /*String tenSP, int id, double giaSP*/
            for (Product product: listProduct) {
                //nhi
                fileWriter.append(product.getTenSP());
                //nhi,
                fileWriter.append(COMA);
                // nhi, id
                fileWriter.append(String.valueOf(product.getId()));
                // nhi, id,
                fileWriter.append(COMA);
                // nhi, id, gia
                fileWriter.append(String.valueOf(product.getGiaSP()));

                fileWriter.append(NEW_LINE);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
