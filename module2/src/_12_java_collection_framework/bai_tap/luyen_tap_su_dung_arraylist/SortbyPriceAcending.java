package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist;

import java.util.Comparator;

public class SortbyPriceAcending implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getGiaSP() - p2.getGiaSP());
    }
}
