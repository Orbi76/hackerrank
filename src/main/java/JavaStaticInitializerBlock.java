import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static  int B;
    static int H;
    static boolean flag = true;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        try {
            if (H <= 0 || B<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }


    }

    public static void main(String[] args){

    }
}
