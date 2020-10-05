package _17_io_binary_file.thuc_hanh.quan_li_sp;

import java.io.Serializable;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private String delayProduct;
    private int priceProduct;
    private String otherDescriptions;

    public Product() {
    }

    public Product(String codeProduct, String nameProduct, String delayProduct, int priceProduct, String otherDescriptions) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.delayProduct = delayProduct;
        this.priceProduct = priceProduct;
        this.otherDescriptions = otherDescriptions;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDelayProduct() {
        return delayProduct;
    }

    public void setDelayProduct(String delayProduct) {
        this.delayProduct = delayProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getOtherDescriptions() {
        return otherDescriptions;
    }

    public void setOtherDescriptions(String otherDescriptions) {
        this.otherDescriptions = otherDescriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", delayProduct='" + delayProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", otherDescriptions='" + otherDescriptions + '\'' +
                '}';
    }
}
