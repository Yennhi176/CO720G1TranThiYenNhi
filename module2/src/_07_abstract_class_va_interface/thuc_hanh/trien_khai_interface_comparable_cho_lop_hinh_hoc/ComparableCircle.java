package _07_abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparable_cho_lop_hinh_hoc;

import _06_ke_thua.bai_tap.lop_circle_lop_cylinder.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {


    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        return 0;
    }
}
