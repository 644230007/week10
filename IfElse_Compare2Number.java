package Week10;

public class IfElse_Compare2Number {
    public static void main(String[] args) {
        int x = 90, y = 33;
        String result = "";
        if (x > y) {
            result = (x+" มากกว่า "+y);
        } else if (x < y) {
            result = (x+" น้อยกว่า "+y);
        } else {
            result = (x+" เท่ากับ "+y);
        }
        System.out.println(result);
    }
}
