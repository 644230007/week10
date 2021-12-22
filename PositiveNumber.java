package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        int number = 0;
        String result = "";
        if (number > 0) {
            result = number + " เป็นจำนวนเต็มบวก";
        } else if (number < 0) {
            result = number + " เป็นจำนวนเต็มลบ";
        } else {
            result = number + " เป็นจำนวนเต็มศูนย์";
        }
        System.out.println(result);

        // if (number > 0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        // }
        // if (number < 0) {
        // System.out.println("เป็นจำนวนเต็มลบ");
        // }
        // if (number == 0) {
        // System.out.println("เป็นจำนวนเต็มศูนย์");
        // }
    }
}
