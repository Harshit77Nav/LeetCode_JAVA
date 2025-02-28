// 3280. Convert Date to Binary
import java.util.*;

public class ConvertDatetoBinary {
    public static void main(String[] args) {
        // date = "2080-02-29"
        String datex = "2080-02-29";
        String[] arr = datex.split("-");

        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        int num3 = Integer.parseInt(arr[2]);

        String res = Integer.toBinaryString(num1) + "-" + Integer.toBinaryString(num2) + "-" + Integer.toBinaryString(num3);
        System.out.println(res);


    }
}
