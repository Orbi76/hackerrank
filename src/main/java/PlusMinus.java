import java.util.Scanner;

//import static com.oracle.javafx.jmx.json.impl.JSONSymbol.scanner;

public class PlusMinus {
    static int plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i : arr) {
            if (i > 0)
                pos++;
            if (i < 0)
                neg++;
            if (i == 0)
                zero++;

        }
        System.out.printf("%.6f%n", (double) pos / arr.length);
        System.out.printf("%.6f%n", (double) neg / arr.length);
        System.out.printf("%.6f%n", (double) zero / arr.length);


        return pos;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
