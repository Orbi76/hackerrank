import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        scan.close();

        BigInteger ab = a.add(b);
        BigInteger amulb = a.multiply(b);

        System.out.println(ab);
        System.out.println(amulb);



    }
}
