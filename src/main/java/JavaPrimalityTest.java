import java.util.Scanner;
import java.math.*;


public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[]main){
        BigInteger n = scanner.nextBigInteger();

        scanner.close();

        if (n.isProbablePrime(1) == true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
