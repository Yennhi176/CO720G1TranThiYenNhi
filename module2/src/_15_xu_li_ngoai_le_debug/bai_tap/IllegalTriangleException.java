package _15_xu_li_ngoai_le_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    String message;

    public IllegalTriangleException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
