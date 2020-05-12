
public class Staircase {
    static void starcase(int n ){

        System.out.println("Hello");

        String jel = "";
        String format = "%" + n + "s%n"; //spaces and after the sign
        //String format = "%s%n";// sign and after the space

        for(int i = 0; i<n; i++){
            jel += "#";
            System.out.printf(format, jel);

        }

    }

    public static void main(String[] args) {
      //  int n = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        starcase(4);
      //  scanner.close();

    }
}
