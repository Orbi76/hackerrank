import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String A= sc.next();

        String backwordsA = new StringBuilder(A).reverse().toString();

     //   System.out.println(backwordsA);
        if (A.equals(backwordsA)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
