import java.util.Scanner;

public class StdinAndStdout {
/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Complete this line
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Complete this line

        System.out.println(a);
        // Complete this line
        System.out.println(b);
        System.out.println(c);
        // Complete this line
    }
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Ez ayért kell hogy a következő sorbeolvasás teljes legyen. Enélkül csak egy üres sort írna ki a gép az s helyére
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
