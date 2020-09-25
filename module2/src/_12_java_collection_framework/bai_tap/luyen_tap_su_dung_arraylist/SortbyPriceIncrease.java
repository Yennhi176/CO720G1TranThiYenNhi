package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist;

import java.util.Comparator;

public class SortbyPriceIncrease implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p2.getGiaSP() - p1.getGiaSP());
    }
}
