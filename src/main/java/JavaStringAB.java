import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaStringAB {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int an = A.length();
        int bn = B.length();
        int sumab = an + bn;
        System.out.println(sumab);

        int res = A.compareTo(B);
        if (res > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
